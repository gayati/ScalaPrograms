package com.bridgelabz.fuctionalprograms

import com.bridgelabz.utility.Utility

object StringReplace {
  def  main(args: Array[String]): Unit = {
     println("Enter the name to be replaced: ")
    var inputString= Utility.readString()
    Utility.replaceString(inputString)
  }
   
}