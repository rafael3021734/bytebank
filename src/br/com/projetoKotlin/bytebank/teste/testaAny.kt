package br.com.projetoKotlin.bytebank.teste

import br.com.projetoKotlin.bytebank.modelo.Endereco

fun testaAny() {
    val endereco = Endereco(logradouro = "Rua Vergueiro", complemento = "Alura", cep = "00000-020")
    val enderecoNovo = Endereco(bairro = "Vila Mariana", numero = 1000, cep = "00000-000")
    println(endereco.equals(endereco))
    println(endereco.equals(enderecoNovo))
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
    println(endereco.toString())
    println(enderecoNovo.toString())

    println("${enderecoNovo.javaClass}@${Integer.toHexString(endereco.hashCode())}")
}

fun teste(valor: Any){
    val numero: Int? = valor as? Int
    println(numero)
}