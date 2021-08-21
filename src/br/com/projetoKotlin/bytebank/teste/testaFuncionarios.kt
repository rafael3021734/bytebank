package br.com.projetoKotlin.bytebank.teste

import br.com.projetoKotlin.bytebank.modelo.Analista
import br.com.projetoKotlin.bytebank.modelo.CalculadoraBonificacao
import br.com.projetoKotlin.bytebank.modelo.Diretor
import br.com.projetoKotlin.bytebank.modelo.Gerente

fun testaFuncionarios() {
    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111.11",
        salario = 1000.0
    )
    println("nome ${alex.nome}")
    println("cpf  ${alex.cpf}")
    println("salario ${alex.salario}")
    println("Bonificação ${alex.bonificacao}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.111.111.11",
        salario = 2000.0,
        senha = 1234
    )
    println("nome ${fran.nome}")
    println("cpf  ${fran.cpf}")
    println("salario ${fran.salario}")
    println("Bonificação ${fran.bonificacao}")

    if (fran.autentica(1234)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }
    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )
    val maria = Analista(
        nome = "Maria",
        cpf = "444.444.444.44",
        salario = 3000.00
    )

    println("nome ${gui.nome}")
    println("cpf  ${gui.cpf}")
    println("salario ${gui.salario}")
    println("Bonificação ${gui.bonificacao}")
    println("PLR ${gui.plr}")

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)


    println("total de bonificação: ${calculadora.total}")
    //  br.com.projetoKotlin.bytebank.teste.testaComportamentosConta()
}