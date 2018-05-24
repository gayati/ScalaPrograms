package com.bridgelabz.fuctionalprograms
import com.bridgelabz.utility.Utility
object StopWatch {
   def main(args: Array[String]): Unit = {
    println(">> Press 1 to start the StopWatch:");
  var number:Int = Utility.readInteger();
  Utility.start
              
  println(">> Press 2 to stop the StopWatch:");
  var number1:Int = Utility.readInteger();
  Utility.stop
  Utility.elapsedTime
  }
  
}