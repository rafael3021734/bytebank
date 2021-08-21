package br.com.projetoKotlin.bytebank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
        private  set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }
 /*   fun registra(gerente: br.com.projetoKotlin.bytebank.modelo.Gerente){
        this.total +=  gerente.bonificacao
    }
    fun registra(diretor: br.com.projetoKotlin.bytebank.modelo.Diretor){
        this.total += diretor.bonificacao
    }*/
}