val ejercicios = listOf("problemas/P2.kts", "problemas/P3.kts", "problemas/P4.kts")

ejercicios.forEach { ejercicio ->
    val resultado = ProcessBuilder(
        "kotlin",
        "-J--enable-native-access=ALL-UNNAMED",
        "-J--sun-misc-unsafe-memory-access=allow",
        ejercicio
    ).inheritIO().start().waitFor()
    check(resultado == 0) { "No se pudo ejecutar $ejercicio" }
}
