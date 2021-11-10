package br.com.alura.bytebank.teste

fun testaFuncaoAnonimaMaisDeUmRetorno() {
    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) {
            return salario + 50.0
        }
        return salario + 100.0
    }
    println(calculaBonificacaoAnonima)
}

fun testaFuncaoLambdaMaisDeUmRetorno() {
    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.0) {
            return@lambda salario + 50.0
        }
        salario + 100.0
    }
    println(calculaBonificacao(1100.0))
}

fun testaFuncaoAnonima() {
    val minhaFuncaoAnonima: (Int, Int) -> Int = fun(a, b): Int {
        return a + b
    }
    println(minhaFuncaoAnonima(20, 10))
}

fun testaFuncaoLambda() {
    val minhaFuncaoLambda: (Int, Int) -> Int = { a, b ->
        a + b
    }
    println(minhaFuncaoLambda(15, 10))
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasse(10, 10))
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5, 10))
}

fun soma(a: Int, b: Int): Int {
    return a + b
}

class Soma: (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int = p1 + p2
}