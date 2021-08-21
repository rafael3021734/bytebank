package br.com.projetoKotlin.bytebank.modelo

class SistemaInterno {

    fun entra(admin: FuncionarioAdmin, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticação")
        }
    }

    fun entra(admin: Cliente, senha: Int) {

    }
}