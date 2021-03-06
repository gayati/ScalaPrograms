package com.bridgelabz.algorithmprograms

object MergeSort {
  def main(args: Array[String]): Unit = {
    def merge(left: List[Int], right: List[Int]): List[Int] =
      (left, right) match {
        case (left, Nil)  => left
        case (Nil, right) => right
        case (leftHead :: leftTail, rightHead :: rightTail) =>
          if (leftHead < rightHead) leftHead :: merge(leftTail, right)
          else rightHead :: merge(left, rightTail)
      }

    def mergeSort(list: List[Int]): List[Int] = {
      val n = list.length / 2
      if (n == 0) list // i.e. if list is empty or single value, no sorting needed
      else {
        val (left, right) = list.splitAt(n)
        merge(mergeSort(left), mergeSort(right))
      }
    }

    var s = mergeSort(List(33, 44, 22, -10, 99))
    println(s)

  }

}