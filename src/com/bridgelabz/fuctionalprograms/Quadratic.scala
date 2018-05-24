package com.bridgelabz.fuctionalprograms
import com.bridgelabz.utility.Utility

object Quadratic {
   def main(args: Array[String]): Unit = {
     System.out.println("Enter the value of a,b & c")
  var a:Double= Utility.readDouble
  var b:Double  = Utility.readDouble
	var c:Double  = Utility.readDouble
	Utility.findRootsOfEquation(a,b,c)
  }
}