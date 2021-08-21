package br.com.projetoKotlin.bytebank.modelo

import br.com.projetoKotlin.bytebank.Exception.FalhaAutenticacaoException
import br.com.projetoKotlin.bytebank.Exception.SaldoInsuficienteException


abstract class Conta(
    var titular: Cliente,
    val numero: Int
) : Autenticavel{
    var saldo = 0.0
        protected set

   companion object Contador {
        var total =  0
            private set
    }

    init {
        println("Criando Conta")
        Contador.total++
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

 abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor){
            throw SaldoInsuficienteException(mensagem = "O saldo é insuficiente, saldo atual: $saldo, valor a ser subtraído $valor")
        }
        if (!autentica(senha)){
            throw FalhaAutenticacaoException(mensagem = "O saldo é insuficiente, saldo atual: $saldo, valor a ser subtraído $valor")
        }
        saldo -= valor
        destino.deposita(valor)

    }
}