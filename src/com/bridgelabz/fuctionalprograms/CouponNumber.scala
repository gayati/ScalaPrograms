package com.bridgelabz.fuctionalprograms

import com.bridgelabz.utility.Utility

object CouponNumber {
  def main(args: Array[String]): Unit = {
    println("Enter the number of coupons you want to generate: ")
   
    var couponnumbers:Int = Utility.readInteger()
    Utility.generateCoupons(couponnumbers)

  }
}