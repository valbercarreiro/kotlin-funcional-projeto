package br.com.alura.bytebank

fun main() {
    testaTipoFuncaoReferencia()
    testaTipoFuncaoClasse()

    val minhaFuncaoLambda: () -> Unit = {
        println("executa como lambda")
    }
    println(minhaFuncaoLambda())

    val minhaFuncaoAnonima: () -> Unit = fun() {
        println("executa como lambda")
    }
    println(minhaFuncaoAnonima())
}

private fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse())
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())
}

fun teste() {
    println("Executa teste")
}

class Teste: () -> Unit {
    override fun invoke() {
        println("executa invoke do Teste")
    }

}
