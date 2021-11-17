fun testaScopeFunctions() {
    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
    println(enderecoEmMaiusculo)

    Endereco(logradouro = "rua vergueiro teste", numero = 3180)
            .let { endereco ->
                "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
            }.let(::println)

    listOf(Endereco(complemento = "casa"), Endereco(), Endereco(complemento = "apartamento"))
            .filter { endereco -> endereco.complemento.isNotEmpty() }
            .let(block = ::println)
}