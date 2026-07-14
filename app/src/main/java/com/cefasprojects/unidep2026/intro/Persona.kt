package com.cefasprojects.unidep2026.intro

class Persona(Id: String = "", Nombre: String = "", Edad: Int = 0, Genero: String = "") {
    var id: String = Id
    var nombre: String = Nombre
    var apellidos: String = ""
    var edad: Int = Edad
    var genero: String = Genero
    var puesto: Puesto = Puesto("")
}

class Puesto(nombre: String) {
    var nombre: String = nombre
}

