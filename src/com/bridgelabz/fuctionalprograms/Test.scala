package com.bridgelabz.fuctionalprograms

import com.bridgelabz.utility.Utility

object Test {
  def main(args: Array[String]): Unit = {
    //    var array1: Array[String] = giveArray("sdsdf")
    //    print(array1(0))
    //
    //    var aarray2 = makeArray[String](5)
    //  println(aarray2.mkString(" "))
    //  }
    //
    //  def giveArray[T: Manifest](elem: T): Array[T] = {
    //    var array = new Array[T](1)
    //    array(0) = elem
    //    array
    //  }
    //
    //   def makeArray[T : reflect.ClassTag](length: Int): Array[T] = {
    //  val tTag = implicitly[reflect.ClassTag[T]]
    //  tTag.newArray(length)
    //   }

    println("enter a line of text")
    var input = Utility.readInteger()
    //var input1: String = input.toString()
    if (Utility.palindrome(input.toString()))
      println("is a palindrome")
    else
      println("is not a palindrome")
  }
}