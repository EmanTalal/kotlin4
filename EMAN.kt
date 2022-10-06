package com.example.myapplication4

fun main() {
    com3(2.1,3.3)

}
  fun com3(number1: Double,number2:Double,oprster:String="+" ) {
      when (oprster) {
          "+" -> println(number1 + number1)
          "-" -> println(number1 - number2)
          "*" -> println(number1*number2)
          "/" -> println(number1/number2)
          else -> println("don't now")
      }
}




