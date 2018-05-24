package com.bridgelabz.fuctionalprograms
import com.bridgelabz.utility.Utility

object TwoDimentioalArray {
  
 def main(args: Array[String]): Unit = {
   
 println("1.IntegerArray")
 println("2.DoubleArray")
 println("3.BooleanArray")
 println("Enter your choice:")
 var number= Utility.readInteger()
 
 println("Enter the Number of rows for array:")
 var rows:Int = Utility.readInteger()
 println("Enter the Number of columns for array:")
 var columns:Int = Utility.readInteger()
 println("Enter the" + " " +(rows * columns) + " " +"element")
 
 number match{
   case 1 => Utility.buildIntegerMatrix(rows, columns)
   case 2 => Utility.buildDoubleMatrix(rows, columns)
   case 3 => Utility.buildBooleanMatrix(rows, columns)
   case _ => 
 }
 }

}