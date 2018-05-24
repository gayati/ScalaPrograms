package com.bridgelabz.fuctionalprograms
import com.bridgelabz.utility.Utility
object PrimeFactors {
  def main(args: Array[String]): Unit = {
    println("Enter the number of which the prime factors are to be find:");
		var inputnumber = Utility.readInteger();
		Utility.computePrimefactor(inputnumber);
  }
   
}