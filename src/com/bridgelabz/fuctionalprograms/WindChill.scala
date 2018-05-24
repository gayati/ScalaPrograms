package com.bridgelabz.fuctionalprograms

import com.bridgelabz.utility.Utility
 
object WindChill {
  def main(args: Array[String]): Unit = {
    var temperature:Double = 0.0
		var velocity:Double = 0.0
		System.out.println("Enter the temperature value");
		temperature = Utility.readDouble();
		System.out.println("Enter the velocity value");
		velocity = Utility.readDouble();
    Utility.calculateWindchill(temperature, velocity);
  }
}