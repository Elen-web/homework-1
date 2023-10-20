package com.example.kotlin_hw1

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Scanner

@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    println("Task 1:")
    task1()

    println("\nTask 2:")
    task2()

    println("\nTask 3:")
    task3()

    println("\nTask 4:")
    task4()

    println("\nTask 5:")
    task5()

    println("\nTask 6:")
    val result6 = task6(10.0, 2.0)
    println("Task 6 Result: $result6")

    println("\nTask 7:")
    task7()

    println("\nTask 8:")
    task8()

    println("\nTask 9:")
    task9()

    println("\nTask 10:")
    task10()
}


fun task1() {
    val array = arrayOf(1, 2, 3, 4, 5)
    val list = listOf("apple", "banana", "cherry")
    println("Array: ${array.joinToString()}")
    println("List: ${list.joinToString()}")
}

fun task2() {
    var originalString = "Hello, World!"
    originalString += " Welcome to Kotlin."
    val substring = originalString.substring(0, 5)
    val uppercaseString = originalString.toUpperCase()
    println("Modified String: $originalString")
    println("Substring: $substring")
    println("Uppercase: $uppercaseString")
}

fun task3() {
    val map = mapOf("Kotlin" to 10, "Java" to 8, "Python" to 7)
    for ((key, value) in map) {
        println("Key: $key, Value: $value")
    }
}


fun task4() {
    fun checkNumberSign(number: Int): String {
        return when {
            number > 0 -> "Positive"
            number < 0 -> "Negative"
            else -> "Zero"
        }
    }

    val num1 = 5
    val num2 = -3
    val num3 = 0

    println("$num1 is ${checkNumberSign(num1)}")
    println("$num2 is ${checkNumberSign(num2)}")
    println("$num3 is ${checkNumberSign(num3)}")
}

fun task5() {
    val scanner = Scanner(System.`in`)
    print("Enter your name: ")
    val name = scanner.nextLine()
    print("Enter your age: ")
    val age = scanner.nextInt()

    println("Hello, $name!")
    println("You are $age years old.")
    if (age < 18) {
        println("You are a minor.")
    } else {
        println("You are an adult.")
    }
}

fun task6(a: Double, b: Double): Double {
    if (b == 0.0) {
        throw IllegalArgumentException("Division by zero is not allowed.")
    }
    return a / b
}


@RequiresApi(Build.VERSION_CODES.O)
fun task7() {
    val currentDateTime = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
    val formattedDateTime = currentDateTime.format(formatter)
    println("Current Date and Time: $formattedDateTime")
}




class Person(val name: String, val age: Int)

fun task8() {
    val person = Person("Alice", 30)
    println("Name: ${person.name}")
    println("Age: ${person.age}")
}


class  Pers(val name: String, val age: Int) {
    fun getLifeStage(): String {
        return when {
            age < 13 -> "Child"
            age in 13..19 -> "Teenager"
            else -> "Adult"
        }
    }
}

fun task9() {
    val person = Pers("Bob", 25)
    val lifeStage = person.getLifeStage()
    println("${person.name} is a $lifeStage.")
}


fun task10() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("Even Numbers: $evenNumbers")
}