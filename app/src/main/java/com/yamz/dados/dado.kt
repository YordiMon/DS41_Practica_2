package com.yamz.dados

class Dado {
    fun lanzarDado(numLados: Int, numDados: Int): Int {

        val rangoDados = 1..numDados
        val rangoLados = 1..numLados
        val lista = ArrayList<Int>()

        for (i in rangoDados) {
            lista.add(rangoLados.random())
        }

        return lista.sum()
    }
}