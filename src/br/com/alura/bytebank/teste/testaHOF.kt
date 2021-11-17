fun testaHiOrderFunctions() {
    soma(1, 5, resultado = {
        println(it)
    })

    somaReceiver(2, 6, resultado = {
        println(this)
    })

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistema = SistemaInterno()
    sistema.entra(autenticavel, 1234, autenticado = {
        println("realizar pagamento")
    })

    sistema.entraReceiver(autenticavel, 1234, autenticado = {
        pagamento()
    })
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("Antes da soma")
    resultado(a + b)
    println("Depois da soma")
}

fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit) {
    println("Antes da soma")
    total = a + b
    total.resultado()
    println("Depois da soma")
}