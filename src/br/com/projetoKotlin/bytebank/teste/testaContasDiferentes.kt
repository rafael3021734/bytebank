package br.com.projetoKotlin.bytebank.teste

import br.com.projetoKotlin.bytebank.modelo.*

fun testaContasDiferentes() {
    val contaCorrente: Conta = ContaCorrente(
        titular = Cliente(nome = "Alex", cpf = "111.111.111-11", senha = 1, endereco = Endereco(logradouro = " Rua vergueiro")),
        numero = 1000
    )
    println("titular")
    println("nome do titular${contaCorrente.titular.nome}")
    println("cpf do titular${contaCorrente.titular.cpf}")
    println("endereço do titular${contaCorrente.titular.endereco.logradouro}")

    val contaPoupanca: Conta = ContaPoupanca(
        titular = Cliente(
            nome = "Fran",
            cpf = "222.222.222-22",
            senha = 2
        ),
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo  após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca, 1)

    println("saldo corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber transferencia: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente, 2)

    println("saldo poupança após transferir para poupança: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferencia: ${contaCorrente.saldo}")

    //  br.com.projetoKotlin.bytebank.teste.testaFuncionarios()
}