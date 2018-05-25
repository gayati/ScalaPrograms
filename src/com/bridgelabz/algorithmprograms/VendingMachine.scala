package com.bridgelabz.algorithmprograms

import com.bridgelabz.utility.Utility

object VendingMachine {
  def main(args: Array[String]): Unit = {
    
    def calculate(amount: Int) = {
      var amt = amount
      var note: Int = 0
      if (amt > 1000){ note = amt / 1000; amt = amt % 1000; println("The note of Rs.1000 are:  " + note)}
      if (amt > 500){ note = amt / 500; amt = amt % 500; println("The note of Rs.500 are:  " + note)}
      if (amt > 100){note = amt / 100; amt = amt % 100; println("The note of Rs.100 are:  " + note)}
      if (amt > 50){ note = amt / 50; amt = amt % 50; println("The note of Rs.50 are:  " + note)}
      if (amt > 20){note = amt / 20; amt = amt % 20; println("The note of Rs.20 are:  " + note)}
      if (amt > 10){note = amt / 10; amt = amt % 10; println("The note of Rs.10 are:  " + note)}
      if (amt > 2){note = amt / 2; amt = amt % 2; println("The note of Rs.2 are:  " + note)}
      if (amt > 1){note = amt / 1; amt = amt % 1; println("The note of Rs.1 are:  " + note)}

    }
    println("Enter the amount to calculate the number of notes: ")
    val amount= Utility.readInteger()
    calculate(amount)
  }

}