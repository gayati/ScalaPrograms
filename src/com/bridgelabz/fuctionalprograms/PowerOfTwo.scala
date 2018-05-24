package com.bridgelabz.fuctionalprograms

import com.bridgelabz.utility.Utility

object PowerOfTwo {
  def  main(args: Array[String]): Unit = {
    println("Please enter the number to find power of two: ")
     var number = Utility.readDouble()
     Utility.powerOfTwo(number)
    
  }
}