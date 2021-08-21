package br.com.projetoKotlin.bytebank.teste.Colecao

fun testaSet() {
    val assitiramCursoAndroid: MutableSet<String> = mutableSetOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: MutableSet<String> = mutableSetOf("Alex", "Paulo", "Maria")
    //val assistiramAmbos: Set<String> = assitiramCursoAndroid + assistiramCursoKotlin
    val assistiramAmbos: MutableSet<String> = mutableSetOf<String>()
    //assistiramAmbos.addAll(assistiramAmbos)
    //assistiramAmbos.addAll(assistiramCursoKotlin)
    //assistiramAmbos.addAll(assitiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.addAll(assitiramCursoAndroid)
    assistiramAmbos.add("Ana")
    assistiramAmbos.add("Ana")

    println(assistiramCursoKotlin + assitiramCursoAndroid)
    println(assistiramCursoKotlin union assitiramCursoAndroid)

    println(assitiramCursoAndroid - assistiramCursoKotlin)
    println(assitiramCursoAndroid subtract assistiramCursoKotlin)

    println(assitiramCursoAndroid intersect assistiramCursoKotlin)

    val assistiramList: MutableList<String> = assistiramAmbos.toMutableList()
    assistiramList.add("Alex")
    println(assistiramList)
    println(assistiramList.toSet())

    println(assistiramAmbos)
}