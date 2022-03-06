fun main(args: Array<String>) {
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    filtrarAssentos(numeros)
    tipoDeIngresso()
}

private fun filtrarAssentosDisponiveis(numeros: List<Int>): List<Int> =
    numeros.filter { disponivel -> disponivel % 1 == 0 }

private fun filtrarAssentosOcupados(numeros: List<Int>): List<Int> =
    numeros.filter { disponivel -> disponivel % 1 != 0 }

private fun filtrarAssentos(numeros: List<Int>) {
    var assentosDisponiveis = filtrarAssentosDisponiveis(numeros)
    var assentosOcupados = filtrarAssentosOcupados(numeros)
    println("Assentos Disponiveis: $assentosDisponiveis")
    println("Assentos Ocupados: $assentosOcupados")
}
    fun tipoDeIngresso(): Unit {
        val tipoDeIngresso = TipoDeIngresso()

        println(
            "Escoha o tipo de igresso:\n" +
                    "1 - Inteiro\n" +
                    "2 - Estudante\n" +
                    "3 - Idoso"
        )
        val valorInteiro = 30
        val tipo = readLine()!!.toInt()
        when (tipo) {
            1 -> {
                println(tipoDeIngresso.ingresso())
            }
            2 -> {
                println(tipoDeIngresso.estudante())
            }
            3 -> {
                println(tipoDeIngresso.idoso(valorInteiro))
            }
        }
    }

