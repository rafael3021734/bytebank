package br.com.projetoKotlin.bytebank.teste

import br.com.projetoKotlin.bytebank.modelo.Endereco

fun testeSafeNulo() {
    var endereco: Endereco? = null
    var enderecoNulo: Endereco? = Endereco(logradouro = " Rua Vergueiro ")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let { endereco: Endereco ->
        println(endereco.logradouro.length)
        val tamanhoComplemento: Int =
            endereco.complemento?.length ?: throw IllegalStateException("Completo não pode ser vazio")
        println(tamanhoComplemento)
    }
}
