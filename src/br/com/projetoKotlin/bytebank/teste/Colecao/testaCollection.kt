package br.com.projetoKotlin.bytebank.teste.Colecao

fun testaCopia() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes
    //   banco.nomes.add("Alex")
    banco.salva("Alex")
    println(nomesSalvos)
    println(banco.nomes)
}

class BancoDeNomes {
    private val dados = mutableListOf<String>()
    val nomes: Collection<String> get() = dados.toList()
    fun salva(nome: String){
        dados.add(nome)
    }
    companion object{
        private val dados = mutableListOf<String>()
    }

}

fun testaCollection() {
    val nomes: Collection<String> = listOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )
    for (nome in nomes) {
        println(nome)
    }
    println(nomes)
    println("tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da Coleção ${nomes.size}")
}