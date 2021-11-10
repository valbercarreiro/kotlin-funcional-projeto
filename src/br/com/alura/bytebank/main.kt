package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno
import br.com.alura.bytebank.teste.*

fun main() {

    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
    println(enderecoEmMaiusculo)

    Endereco(logradouro = "rua vergueiro teste", numero = 3180)
        .let { endereco ->
            "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
        }.let (::println)

    listOf(Endereco(complemento = "casa"), Endereco(), Endereco(complemento = "apartamento"))
        .filter { endereco -> endereco.complemento.isNotEmpty() }
        .let (block = ::println)

    soma(1, 5, resultado =  {
        println(it)
    })

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("realizar pagamento")
    })
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    resultado(a + b)
}