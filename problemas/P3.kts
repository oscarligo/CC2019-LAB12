val transponer: (List<List<Int>>) -> List<List<Int>> = { matriz ->
    if (matriz.isEmpty()) {
        emptyList()
    } else {
        val columnas = matriz.first().size
        require(matriz.all { it.size == columnas }) { "Todas las filas deben tener la misma longitud." }
        List(columnas) { columna -> matriz.map { fila -> fila[columna] } }
    }
}

val matriz = listOf(
    listOf(1, 2, 3),
    listOf(4, 5, 6),
    listOf(7, 8, 9)
)

println("Problema 3 - Transponer matriz")
println("Antes:")
matriz.forEach(::println)
println("Después:")
transponer(matriz).forEach(::println)
