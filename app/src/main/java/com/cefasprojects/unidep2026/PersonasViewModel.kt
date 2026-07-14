package com.cefasprojects.unidep2026

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.cefasprojects.unidep2026.intro.Persona

class PersonasViewModel : ViewModel() {
    var text by mutableStateOf("")
    var lista = mutableStateListOf<Persona>()
}