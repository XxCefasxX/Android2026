package com.cefasprojects.unidep2026.intro

fun main() {
    //Se pediran los datos de una persona
    //Nombre
    //Genero
    println("Cual es tu genero?")
    println("H-> Hombre")
    println("M-> Mujer")
    var genero = readln()
    //pedir genero hasta que ingrese un valor valido


    //Edad

    //mostrar los datos de la persona

    //mostrar: nombre es un (generacion)
    println("Manuel es ${generacion(10, genero)}")
}

//fun generacion(edad: Int, genero: String): String {
//    var etiqueta: String = ""
//    when (genero) {
//        "H" ->
//            when {
//                (edad <= 2) -> etiqueta = "un Bebe"
//                (edad > 2 && edad <= 11) -> etiqueta = "un Niño"
//                (edad > 11 && edad <= 17) -> etiqueta = "un Adoleente"
//                (edad > 17 && edad <= 59) -> etiqueta = "un Adulto"
//                else -> etiqueta = "un Anciano"
//            }
//
//        "M" ->
//            when {
//                (edad <= 2) -> etiqueta = "una Bebe"
//                (edad > 2 && edad <= 11) -> etiqueta = "una Niña"
//                (edad > 11 && edad <= 17) -> etiqueta = "una Adoleente"
//                (edad > 17 && edad <= 59) -> etiqueta = "una Adulta"
//                else -> etiqueta = "una Anciana"
//            }
//    }
//    return etiqueta
//}

fun generacion(edad: Int, genero: String): String {

  return when (genero) {
        "H" ->
            when {
                (edad <= 2) ->  "un Bebe"
                (edad > 2 && edad <= 11) ->  "un Niño"
                (edad > 11 && edad <= 17) ->  "un Adoleente"
                (edad > 17 && edad <= 59) ->  "un Adulto"
                else ->  "un Anciano"
            }

        "M" ->
            when {
                (edad <= 2) ->  "una Bebe"
                (edad > 2 && edad <= 11) ->  "una Niña"
                (edad > 11 && edad <= 17) ->  "una Adoleente"
                (edad > 17 && edad <= 59) ->  "una Adulta"
                else ->  "una Anciana"
            }
        else -> ""
    }

}