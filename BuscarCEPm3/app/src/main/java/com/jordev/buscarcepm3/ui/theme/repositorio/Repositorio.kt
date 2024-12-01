package com.jordev.buscarcepm3.ui.theme.repositorio

import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class Repositorio @Inject constructor(){

    fun valor(): String{
        return "Mundo Hacker"
    }

}