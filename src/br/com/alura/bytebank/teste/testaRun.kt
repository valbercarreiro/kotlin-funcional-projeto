fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("Taxa mensal $taxaMensal")

    val contaPoupanca = ContaPoupanca(Cliente(nome = "Alex", cpf = "111.111.111-11", senha = 1234))
    contaPoupanca.run {
        deposita(1000.0)
        saldo * taxaMensal
    }.let {
        println("Rendimento mensal $saldo")
    }

    val rendimentoAnual = run {
        var saldo = contaPoupanca.saldo
        repeat(12) { indice ->
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println("Simulação rendimento anual $rendimentoAnual")
}