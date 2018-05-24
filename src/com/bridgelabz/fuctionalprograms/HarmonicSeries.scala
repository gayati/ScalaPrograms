package com.bridgelabz.fuctionalprograms

import com.bridgelabz.utility.Utility

object HarmonicSeries {
  def main(args: Array[String]): Unit = {
    println("Enter the Harmonic Value: ")
    var number:Int = Utility.readInteger()
    Utility.printHarmonicSeries(number)
  }
}