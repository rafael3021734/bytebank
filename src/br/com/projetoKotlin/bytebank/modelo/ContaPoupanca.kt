package br.com.projetoKotlin.bytebank.modelo

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular,
    numero
) {
    override fun saca(valor: Double) {
        if (saldo >= valor ) {
            this.saldo -= valor
        }
    }
}