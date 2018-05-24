package com.bridgelabz.algorithmprograms

import com.bridgelabz.utility.Utility

object Anagrams {
  def main(args: Array[String]): Unit = {
    println("Enter the strings: ")
    var inputString1 = Utility.readString()
    var inputString2 = Utility.readString()
    var flag: Boolean = Utility.isAnagram(inputString1, inputString2)
    if (flag == true) {
      println("Strings are Anagram")
    } else {
      println("Strings are not Anagram ")
    }

  }
}