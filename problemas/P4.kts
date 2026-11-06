val eliminarElementos: (List<String>, List<String>) -> List<String> = { elementos, porEliminar ->
    val descartados = porEliminar.toSet()
    elementos.filterNot(descartados::contains)
}

val colores = listOf("rojo", "verde", "azul", "amarillo", "gris", "blanco", "negro")
val coloresPorEliminar = listOf("amarillo", "cafe", "blanco")

println("Problema 4 - Eliminar elementos")
println("Antes: $colores")
println("Elementos a eliminar: $coloresPorEliminar")
println("Después:")
println(eliminarElementos(colores, coloresPorEliminar))
