package br.com.projetoKotlin.bytebank.modelo

class Cliente(
    var nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    private val senha: Int
): Autenticavel {
   override fun autentica(senha: Int): Boolean {
        println("Autentica br.com.projetoKotlin.bytebank.modelo.Funcionario Admin")
        if(this.senha == senha){
            return true
        }
        return false
    }
}