package com.jordev.buscarcepm3.ui.theme.viewmodel

import androidx.lifecycle.ViewModel
import com.jordev.buscarcepm3.ui.theme.repositorio.Repositorio
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BuscarCepViewModel @Inject constructor(private val repositorio: Repositorio): ViewModel() {

    fun valor(): String{
        return repositorio.valor()

    }

    /*val _valor = MutableStateFlow("")
    val valorAlterado: StateFlow<String> = _valor

    fun valor(): String{
        viewModelScope.launch {
            _valor.value = repositorio.valor()
        }
        return valorAlterado.toString()

    }*/
}