package com.bridgelabz.utility

import scala.math
import scala.util.Sorting
import scala.util.control.Breaks

object Utility {

  def readInteger(): Int = {
    scala.io.StdIn.readInt()

  }
  def readString(): String = {
    scala.io.StdIn.readLine()
  }
  def readDouble(): Double = {
    scala.io.StdIn.readDouble()
  }
  def readBoolean(): Boolean = {
    scala.io.StdIn.readBoolean()
  }

  def replaceString(inputString: String): Unit = {
    if (inputString.length() >= 3) {
      println(s"Hello $inputString, How are you?")
    } else {
      println("Enter the String of length greater than 3")
    }
  }

  def checkLeapYear(year: Int) = {
    if (year.toString.length == 4) {
      if (year % 4 == 0)
        println("It is leap year")
      else
        println("It is not leap year")
    } else {
      println("It is not valid year")
    }
  }

  def powerOfTwo(number: Double) = {
    var num: Double = 0;
    if (number >= 0 && number <= 31) {
      num = scala.math.pow(2, number)
      println(num)
    } else {
      println("Enter the number between 0 to 31")
    }
  }

  def printHarmonicSeries(number: Int) {
    var sum: Double = 0.0
    for (i <- 1 to number) {
      sum += (1.toDouble / i)
    }
    println("Harmonic sum is " + sum)
  }

  def calculateDistance(x: Double, y: Double) {

    var distance: Double = scala.math.sqrt((scala.math.pow(x, 2) + (scala.math.pow(y, 2))))
    println(distance)
  }

  def calculatePercentage(noOfTimes: Int) {
    var head: Int = 0
    var tail: Int = 0

    for (i <- 1 to noOfTimes) {
      if (scala.math.random() < 0.5) {
        head += 1
      } else {
        tail += 1
      }
    }
    var headpercent: Double = head * 100 / noOfTimes
    var tailpercent: Double = 100 - headpercent
    println(headpercent)
    println(tailpercent)
  }

  def computePrimefactor(number: Int) {
    var total: Int = number
    while (total % 2 == 0) {
      println(2)
      total = total / 2
    }
    var number1 = number / 2
    for (i <- 3 to number1 by 1) {
      while (total % i == 0) {
        println(i);
        total = total / i
      }
    }
    if (total > 2) {
      System.out.println(total);
    }
  }

  var startTime: Long = 0
  var stopTime: Long = 0
  def start = { startTime = System.currentTimeMillis }

  def stop = { stopTime = System.currentTimeMillis }

  def elapsedTime = {
    println("The elapsed time is" + (stopTime - startTime) + " milliseconds")
  }

  def gambler(stackprice: Int, goalprice: Int, noOfTimes: Int) {
    var wins: Int = 0
    var loss: Int = 0
    var winpercent: Double = 0.0;
    var losspercent: Double = 0.0;

    for (i <- 1 to noOfTimes by 1) {
      if (stackprice > 0 && stackprice <= goalprice) {
        if (math.random() > 0.5) {
          wins += 1
        } else {
          loss += 1
        }
        if (stackprice == goalprice) {
          wins += 1
        }
      }
    }
    println(wins)
    println(loss)
    winpercent = wins * 100 / noOfTimes
    losspercent = 100 - winpercent
    println("The win percentage are: " + winpercent)
    println("The loss percentage are: " + losspercent)
  }

  def buildIntegerMatrix(rows: Int, columns: Int) = {
    var IntegerArray = Array.ofDim[Any](rows, columns)
    for (i <- 0 until rows by 1) {
      for (j <- 0 until columns by 1) {
        IntegerArray(i)(j) = Utility.readInteger();
      }
    }
    printTwoDArray(IntegerArray, rows, columns)
    // printTwoDArray1[Int](rows,columns,IntegerArray)

  }

  def buildDoubleMatrix(rows: Int, columns: Int) = {
    var DoubleArray = Array.ofDim[Double](rows, columns)
    for (i <- 0 until rows by 1) {
      for (j <- 0 until columns by 1) {
        DoubleArray(i)(j) = Utility.readDouble()
      }
    }

    printTwoDArray(DoubleArray, rows, columns)
    //printTwoDArray1[Double](rows,columns,DoubleArray)

  }

  // def printTwoDArray1[T : reflect.ClassTag](length: Int,length1: Int,array: Array[Array[Any]])= {
  //  val tTag = implicitly[reflect.ClassTag[T]]
  //   for (i <- 0 until array.length by 1) {
  //      for (j <- 0 until array(0).length by 1) {
  //        print(array(i)(j) + " ")
  //      }
  //      println()
  //    }
  // }

  def printTwoDArray[T: Manifest](array: Array[Array[T]], rows: Int, columns: Int) {
    for (i <- 0 until array.length by 1) {
      for (j <- 0 until array(0).length by 1) {
        print(array(i)(j) + " ")
      }
      println()
    }
  }

  def buildBooleanMatrix(rows: Int, columns: Int) = {
    var BooleanArray = Array.ofDim[Boolean](rows, columns)
    for (i <- 0 until rows by 1) {
      for (j <- 0 until columns by 1) {
        BooleanArray(i)(j) = Utility.readBoolean()
      }
    }

    printTwoDArray(BooleanArray, rows, columns)
  }

  def calculateWindchill(temperature: Double, velocity: Double) = {

    var windchill: Double = 0.0;
    if (temperature <= 50 && velocity <= 120 && velocity >= 3) {
      windchill = 35.75 + (0.6215 * temperature) + (((0.427 * temperature) - 35.75) * Math.pow(velocity, 0.16));
      println("The windchill is as follows:" + windchill);

    } else {
      println("Please enter valid input");
    }
  }

  def findRootsOfEquation(a: Double, b: Double, c: Double) = {
    var root1: Double = 0.0
    var root2: Double = 0.0
    var delta: Double = ((b * b) - (4 * a * c))
    if (delta > 0) {
      root1 = ((-b) + (math.sqrt(delta))) / (2 * a)
      root2 = ((-b) - (math.sqrt(delta))) / (2 * a)
    }
    System.out.println("Root values are:" + root1 + "and" + root2)
  }

  def generateRandomnumber(): Int = {
    var random = scala.util.Random
    random.nextInt(1000000)
  }

  def generateCoupons(couponnumbers: Int) = {
    var couponsArray = new Array[Int](couponnumbers)
    var i: Int = 0
    var j: Int = 1

    while (i < couponnumbers) {
      couponsArray(i) = generateRandomnumber()
      while (j < couponnumbers) {
        if (couponsArray(i) == couponsArray(j)) {
          i -= 1
        }
        j += 1
      }
      println(couponsArray(i))
      i += 1

    }

  }

  def isAnagram(inputString1: String, inputString2: String): Boolean = {

    if (inputString1 == null || inputString2 == null || inputString1.length != inputString2.length) false

    var Array1: Array[Char] = inputString1.toArray
    var Array2: Array[Char] = inputString2.toArray

    Sorting.quickSort(Array1)
    Sorting.quickSort(Array2)
    Array1.sameElements(Array2)

  }

  //  def isAnagram(inputString1: String, inputString2: String) : Boolean = {
  //  val sLetters1 =inputString1.toLowerCase.filter(c => c.isLetterOrDigit)
  //   val sLetters2 =inputString2.toLowerCase.filter(c => c.isLetterOrDigit)
  //  ((sLetters1 == sLetters1.reverse) && (sLetters2 == sLetters2.reverse))
  //}

  def isPrime(n: Int) = (2 until n) forall (n % _ != 0)

  def isPrimeAnagram[T: Manifest](primeArray: Array[T]) = {

    var i: Int = 0

    //    while (i < primeArray.length) {
    //      var j: Int = i + 1;
    //      while (j < primeArray.length) {
    //        if (isAnagram((primeArray(i).toString()), primeArray(j).toString())) {
    //          println(primeArray(i).toString() + "-->" + primeArray(j).toString())
    //        }
    //        j += 1
    //      }
    //      i += 1
    //    }

    for (i <- 0 until primeArray.length - 1; j <- (i + 1) until primeArray.length - 1 - i) {
      if (isAnagram((primeArray(i).toString()), primeArray(j).toString())) {
        println(primeArray(i).toString() + "-->" + primeArray(j).toString())
      }
    }
  }

  def palindrome(s: String): Boolean = {
    val sLetters = s.toLowerCase.filter(c => c.isLetterOrDigit)
    (sLetters == sLetters.reverse)
  }

  def isPrimePalindrome[T: Manifest](primeArray: Array[T]) = {
    var i = 0
    while (i < primeArray.length) {
      if (palindrome(primeArray(i).toString())) {
        println(String.valueOf(primeArray(i)))
      }
      i += 1
    }
  }

  def search[T <% Ordered[T]](target: T, l: Array[T]) = {
    // @tailrec
    def recursion(low: Int, high: Int): Option[Int] = (low + high) / 2 match {
      case _ if high < low          => None
      case mid if l(mid) > (target) => recursion(low, mid - 1)
      case mid if l(mid) < (target) => recursion(mid + 1, high)
      case mid                      => Some(mid)
    }
    recursion(0, l.size - 1)
  }

  def imperativeBubbleSort[T <% Ordered[T]](array: Array[T]): Array[T] = {
    for (i <- 0 until array.length - 1; j <- 0 until array.length - 1 - i) {
      if (array(j) > array(j + 1)) {
        val temp = array(j)
        array(j) = array(j + 1)
        array(j + 1) = temp
      }
    }
    array
  }
   
   def insertionSort(array: Array[Int]): Array[Int] = {
  for (i <- 1 until array.length) {
    // A[ i ] is added in the sorted sequence A[0, .. i-1]
    // save A[i] to make a hole at index iHole
    val item = array(i)
    var iHole = i
    // keep moving the hole to next smaller index until A[iHole - 1] is <= item
    while (iHole > 0 && array(iHole - 1) > item) {
      // move hole to next smaller index
      array(iHole) = array(iHole - 1)
      iHole = iHole - 1
    }
    // put item in the hole
    array(iHole) = item
  }
  array
}
  
  
  
  
  
  
  
  
  
  
  
  
}