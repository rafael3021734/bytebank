package br.com.projetoKotlin.bytebank.modelo

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular,
    numero
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }

}