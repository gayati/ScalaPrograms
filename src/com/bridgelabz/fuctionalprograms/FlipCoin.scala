package com.bridgelabz.fuctionalprograms

import com.bridgelabz.utility.Utility

object FlipCoin {
   def main(args: Array[String]): Unit = {
     println("Enter the number of time you want to flip the coin: ")
     var noOfTimes = Utility.readInteger();
     Utility.calculatePercentage(noOfTimes)
  }
 
}