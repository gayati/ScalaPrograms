package com.bridgelabz.fuctionalprograms

import com.bridgelabz.utility.Utility

object LeapYearProgram {
  def main(args: Array[String]): Unit = {
    println("Enter the year: ")
     var year = scala.io.StdIn.readInt()
     Utility.checkLeapYear(year)
  }
}