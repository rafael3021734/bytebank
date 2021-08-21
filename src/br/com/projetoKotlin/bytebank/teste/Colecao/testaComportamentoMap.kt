package br.com.projetoKotlin.bytebank.teste.Colecao

fun testaComportamentosMap() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0,
        4 to 100.0,
        5 to 150.0,
        6 to 80.0
    )
    //   val valorPedido: Double? = pedidos.getValue(0) //getValue usado para quando a chave for nula! apresenta mensagem exception
    //   println(valorPedido)
    var mensagem: Double? = pedidos.getOrElse(1, {
        0.0
    })
    println(pedidos)
    println(pedidos.getOrDefault(1, -1.0))
    println(pedidos.getOrDefault(1, -1.0))

    println(pedidos.keys)
    for (numero in pedidos.keys) {
        println("Pedidos $numero")
    }
    println(pedidos.values)

    for (valor: Double? in pedidos.values) {
        println("Valor do pedido: $valor")
    }
    val pedidosFiltrados: Map<Int, Double> = pedidos.filter { (numero: Int, valor: Double) ->
        numero % 2 == 0 && valor > 50.0
    }
    println(pedidosFiltrados)

    val pedidosAcima: Map<Int, Double> = pedidos.filterValues { valor ->
        valor > 70.0
    }
    val pedidosPares: Map<Int, Double> = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }
    println(pedidosPares)

    println(pedidos + mapOf(7 to 90.0, 8 to 20.0))
    println(pedidos)

    println(pedidos - listOf(6, 5))
    println(pedidos)

    //Adicionar
    pedidos.putAll(listOf<Pair<Int, Double>>(7 to 90.0, 8 to 20.0))
    println(pedidos)
    pedidos += listOf<Pair<Int, Double>>(7 to 90.0, 8 to 20.0)
    println(pedidos)

    //Remove
    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(50.0)
    println(pedidos)

    pedidos.values.remove(100.0)
    println(pedidos)

    pedidos -= 6  //remove a chave
    println(pedidos)

    val pedido: Double? = pedidos[3]
    pedido?.let {
        println("pedido $it")
    }
    for (p: Map.Entry<Int, Double> in pedidos) {
        println("número do pedido: ${p.key}")
        println("valor do pedido: ${p.value}")
    }
    pedidos[4] = 70.0
    println(pedidos)
    pedidos.put(5, 80.0)
    println(pedidos)
    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)
    pedidos.putIfAbsent(6, 300.0)
    println(pedidos)
    pedidos.remove(6)
    println(pedidos)
    pedidos.remove(3, 100.0)
    println(pedidos)
    pedidos.remove(3, 50.0)
    println(pedidos)
}