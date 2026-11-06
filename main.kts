val ejercicios = listOf("problemas/P2.kts", "problemas/P3.kts", "problemas/P4.kts")

ejercicios.forEach { ejercicio ->
    val resultado = ProcessBuilder("kotlin", ejercicio).inheritIO().start().waitFor()
    check(resultado == 0) { "No se pudo ejecutar $ejercicio" }
}
