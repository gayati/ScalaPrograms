package com.bridgelabz.fuctionalprograms

import com.bridgelabz.utility.Utility

object Gambler {
   def main(args: Array[String]): Unit = {
     println("Enter the stack price: ")
   var stackPrice: Int = Utility.readInteger()
   println("Enter the goal price: ")
   var goalPrice:Int = Utility.readInteger()
   println("Enter the number of times you want to play: ")
   var noOfTimes:Int = Utility.readInteger()
   Utility.gambler(stackPrice, goalPrice, noOfTimes)
   
   
  }
  
}