package com.bridgelabz.algorithmprograms

import com.bridgelabz.utility.Utility
import scala.collection.mutable.ListBuffer

object PrimeNumbers {
  def main(args: Array[String]): Unit = {

    val primeList = for (i <- 2 to 1000 if Utility.isPrime(i)) yield i
    println("The prime number are as folows: ")
    print(primeList.mkString(" "))
    println()
    println("The prime anagrams are as follows: ")
    var primeArray = primeList.toArray
    Utility.isPrimeAnagram(primeArray)
    println()
    println("The prime palindrome are as follows: ")
    Utility.isPrimePalindrome(primeArray)

  }
}