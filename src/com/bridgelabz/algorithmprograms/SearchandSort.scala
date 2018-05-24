package com.bridgelabz.algorithmprograms
import scala.annotation.tailrec
import com.bridgelabz.utility.Utility
import scala.util.Sorting

object SearchandSort {
  def main(args: Array[String]): Unit = {

    println("1.IntegerBinary Search")
    println("2.StringBinary Search")
    println("3.Integer BubbleSort")
    println("4.String BubbleSort ")
    println("5.Integer InsertionSort")
    println("6.String InsertionSort")
    println("7.Enter your choice:")
    val choice = Utility.readInteger()

    choice match {
      case 1 =>
        println("Enter the length of array")
        var length = Utility.readInteger()
        val integerArray = new Array[Int](length)
        for (i <- 0 until integerArray.length by 1) { integerArray(i) = Utility.readInteger() }
        Sorting.quickSort(integerArray)
        print(integerArray.mkString(" "))
        println("Enter the elemwnt to searched: ")
        val input = Utility.readInteger()
        println(Utility.search(input, integerArray))

      case 2 =>
        println("Enter the length of array")
        var length = Utility.readInteger()
        val StringArray = new Array[String](length)
        for (i <- 0 until StringArray.length by 1) { StringArray(i) = Utility.readString() }
        Sorting.quickSort(StringArray)
        println(StringArray.mkString(" "))
        println("Enter the elemwnt to searched: ")
        val input = Utility.readString()
        println(Utility.search(input, StringArray))

      case 3 =>
        println("Enter the length of array")
        var length = Utility.readInteger()
        val integerArray = new Array[Int](length)
        for (i <- 0 until integerArray.length by 1) { integerArray(i) = Utility.readInteger() }
        val intArray = Utility.imperativeBubbleSort(integerArray)
        println(intArray.mkString(" "))

      case 4 =>
        println("Enter the length of array")
        var length = Utility.readInteger()
        val stringArray = new Array[String](length)
        for (i <- 0 until stringArray.length by 1) { stringArray(i) = Utility.readString() }
        val strArray = Utility.imperativeBubbleSort(stringArray)
        println(strArray.mkString(" "))

      case 5 =>
        println("Enter the length of array")
        var length = Utility.readInteger()
        val integerArray1 = new Array[Int](length)
        for (i <- 0 until integerArray1.length by 1) { integerArray1(i) = Utility.readInteger() }
        val intArray1 = Utility.insertionSort(integerArray1)
        println(intArray1.mkString(" "))

      case 6 =>
        println("Enter the length of array")
        var length = Utility.readInteger()
        val stringArray = new Array[String](length)
        for (i <- 0 until stringArray.length by 1) { stringArray(i) = Utility.readString() }
        val strArray = Utility.imperativeBubbleSort(stringArray)
        println(strArray.mkString(" "))

    }

  }

}