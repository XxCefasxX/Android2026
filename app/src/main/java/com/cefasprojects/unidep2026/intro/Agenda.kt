package com.cefasprojects.unidep2026.intro

fun main() {

    var lista = mutableListOf<Persona>()
    var persona = Persona()
    var persona2 = Persona()
    var persona3 = Persona()

    println("Indica el nombre")
    persona.nombre = readln()

    println("Indica el edad")
    persona.edad = readln().toInt()

    println("Indica el genero")
    persona.genero = readln()
    lista.add(persona)

    persona2.nombre = "Juan"
    persona2.edad = 3
    persona2.genero = "H"
    lista.add(persona2)

    persona3.nombre = "Luis"
    persona3.edad = 29
    persona3.genero = "H"
    lista.add(persona2)


    for(per in lista){
        println("${per.nombre} tiene ${per.edad} y es ${generacion(per.edad, per.genero)}")
    }

}