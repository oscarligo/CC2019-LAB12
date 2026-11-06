typealias Diccionario = Map<String, Comparable<*>>

val ordenarPorClave: (List<Diccionario>, String) -> List<Diccionario> = { diccionarios, clave ->
    require(diccionarios.all { clave in it }) { "La clave '$clave' no existe en todos los diccionarios." }

    diccionarios.sortedWith { primero, segundo ->
        @Suppress("UNCHECKED_CAST")
        (primero.getValue(clave) as Comparable<Any>).compareTo(segundo.getValue(clave))
    }
}

val telefonos: List<Diccionario> = listOf(
    mapOf("make" to "Nokia", "model" to 216, "color" to "Black"),
    mapOf("make" to "Mi Max", "model" to 2, "color" to "Gold"),
    mapOf("make" to "Samsung", "model" to 7, "color" to "Blue")
)

println("Problema 2 - Ordenar por model")
println("Antes:")
telefonos.forEach(::println)
println("Después:")
ordenarPorClave(telefonos, "model").forEach(::println)
