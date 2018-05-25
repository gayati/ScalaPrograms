package com.bridgelabz.algorithmprograms

import com.bridgelabz.utility.Utility

object Binary {
  def main(args: Array[String]): Unit = {

    println("Enter the number to find binary: ")
    val number = Utility.readInteger()
    val bin = Nil
    var str = Utility.toBinary(number, bin).mkString("")

    for (i <- 0 until (8 - str.size))
      str = '0' + str
    println("The binary of the number is " + str)

    var str1 = str.substring(0, str.size / 2)
    var str2 = str.substring(str.size / 2, 8)
    var str3 = str2 + str1

    var decimalnumber = Integer.parseInt(str3, 2);
    System.out.println("After nibble swap the decimal of given number is " + decimalnumber);

    // println(4.toBinaryString.reverse.padTo(8, "0").reverse.mkString)

  }
}