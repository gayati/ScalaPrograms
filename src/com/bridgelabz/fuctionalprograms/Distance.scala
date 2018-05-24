package com.bridgelabz.fuctionalprograms

import com.bridgelabz.utility.Utility

object Distance {
  def main(args: Array[String]): Unit = {
  println("Enter the X co-ordinate: ")
  var x = Utility.readDouble()
  println("Enter the Y co-ordinate: ")
  var y = Utility.readDouble()
  Utility.calculateDistance(x, y)
  
  }
  
}