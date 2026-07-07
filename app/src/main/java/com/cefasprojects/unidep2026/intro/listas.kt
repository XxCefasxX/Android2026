package com.cefasprojects.unidep2026.intro

fun main() {

    //pedir registrar una persona
    //registrar en listas los datos de la persona
    //preguntar si quiere registrar otra persoan
    //si dice si, pedir nuevamente los datos
    //si dice no, mostrar todos los datos de las personas
    //-Juan tiene 35 años  y es un adulto
    //-Laura tiene 10 años  y es una niña

    val numeros = arrayOf(5, 6, 3, 8)
    println(numeros[2])

    //recorrer por indice
    for (i in numeros.indices) {
        println(numeros[i])
    }

    //recorrer por objetos
    for (numero in numeros) {
        println(numero)
    }

    //inmutables
    val nombres = listOf("Juan", "Jose", "Luis")
    println(nombres[1])

    for (nombre in nombres) {
        println(nombre)
    }

    //mutables
    var apellidos = mutableListOf<String>("Castillo", "Perez")
    apellidos.add("Lopez")//agrega un elemento a la lista
    apellidos.remove("Perez")//elimina el elemento por su valor
    apellidos.removeAt(0)//elimina el elemento por su indice
    for (ap in apellidos) {
        println(ap)
    }

}