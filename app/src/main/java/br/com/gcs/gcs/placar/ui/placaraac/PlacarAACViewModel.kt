package br.com.gcs.gcs.placar.ui.placaraac

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class PlacarAACViewModel:ViewModel (){
    val placarA = MutableLiveData<Int>()
    val placarB = MutableLiveData<Int>()

    init {
        placarA.value = 0
        placarB.value = 0
    }

    fun adicionaPonoTimeA(ponto:Int){
        placarA.value = placarA.value?.plus(ponto)
    }

    fun adicionaPonoTimeB(ponto:Int){
        placarB.value = placarA.value?.plus(ponto)
    }

    fun reiniciarJogo(){
        placarA.value = 0
        placarB.value = 0
    }
}