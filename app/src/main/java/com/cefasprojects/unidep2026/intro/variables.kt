package com.cefasprojects.unidep2026.intro

fun main() {
    println("Ingrese un numero:")
    var num1 = readln()
    println("Ingrese otro numero")
    var num2 = readln()

    println("Que operacion desea realizar")
    println("1- Suma")
    println("2- Resta")
    println("3- Divi")
    println("4- Multi")
    var op=readln()

    when(op){
        "1"->  suma( num1.toInt(), num2.toInt())
        "2"->  resta( num1.toInt(), num2.toInt())
        "3"->  divi( num1.toFloat(), num2.toFloat())
        "4"->  mult( num1.toInt(), num2.toInt())
    }

}

fun suma(num1: Int, num2: Int) {
    var suma = num1 + num2
    println("La suma es ${suma}")
}
fun resta(num1: Int, num2: Int) {
    var res = num1 - num2
    println("La resta es ${res}")
}
fun divi(num1: Float, num2: Float) {
    var divi = num1 / num2
    println("La div es ${divi}")
}
fun mult(num1: Int, num2: Int) {
    var multi = num1 * num2
    println("La mult es ${multi}")
}