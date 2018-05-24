package com.bridgelabz.algorithmprograms
import scala.io.Source
import scala.util.Sorting
import com.bridgelabz.utility.Utility
object BinarySearch {
  def main(args: Array[String]): Unit = {

    var stringArray = Source.fromFile("IntegerDemo").mkString.split(" ")
    Sorting.quickSort(stringArray)
    println(stringArray.mkString(" "))
    println("Enter the element to searched: ")
    val input = Utility.readString()
    println(Utility.search(input, stringArray))

  }

}