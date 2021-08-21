package br.com.projetoKotlin.bytebank.teste

import br.com.projetoKotlin.bytebank.Exception.SaldoInsuficienteException
import java.lang.ClassCastException

fun funcao1() {


    println("início funcao1")
    try {
        funcao2()
    } catch (e: SaldoInsuficienteException){
        e.printStackTrace()
        println("SaldoInsuficienteException foi pego")
    }
    println("fim funcao1")
}
fun funcao2() {
    println("início funcao2")
    try {
        for (i in 1..5) {
            println(i)
            val endereco = Any()
            throw SaldoInsuficienteException()
        }
    } catch (e: ClassCastException) {
        println("ClassCastException foi pegada")
    }
    println("fim funcao2")
}