package br.com.projetoKotlin.bytebank.modelo

interface Autenticavel {

    fun autentica(senha: Int): Boolean

}