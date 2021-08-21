package br.com.projetoKotlin.bytebank.teste

import br.com.projetoKotlin.bytebank.modelo.Cliente
import br.com.projetoKotlin.bytebank.modelo.ContaCorrente
import br.com.projetoKotlin.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(nome = "João", cpf = "333.333.333-33", senha = 1)

    val contaJoao = ContaCorrente(joao, 1002)
    contaJoao.titular.nome = "João"

    var contaMaria = ContaPoupanca(Cliente(nome = "Maria", cpf = "444.444.444-44",senha = 2), 1003)
    contaMaria.titular.nome = "Maria"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}