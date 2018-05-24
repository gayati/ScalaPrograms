package com.bridgelabz.algorithmprograms
import scala.io.Source
import scala.util.Sorting
import com.bridgelabz.utility.Utility
object InsertionSort {
   def main(args: Array[String]): Unit = {

    var integerArray = Source.fromFile("Demo").mkString.split(" ")
    Sorting.quickSort(integerArray)
    println(integerArray.mkString(" "))
    println("Enter the element to searched: ")
    val input = Utility.readString()
    println(Utility.search(input, integerArray))

  }
}