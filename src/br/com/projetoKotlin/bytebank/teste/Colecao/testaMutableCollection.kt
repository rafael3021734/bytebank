package br.com.projetoKotlin.bytebank.teste.Colecao

fun testaMutableCollection() {
    val Nomes: MutableCollection<String> = mutableListOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )
    Nomes.add("Paulo")
    Nomes.remove("Alex")
    for (Nome in Nomes) {
        println(Nome)
    }
    println(Nomes)
}