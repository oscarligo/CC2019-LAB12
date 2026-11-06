# CC2019-LAB12

Implementación en Kotlin de los ejercicios 2, 3 y 4 del Laboratorio 12 de Teoría de la Computación.

**Demo**: <https://youtu.be/wMYnW93nZhA>

## Ejecución

Para ejecutar todos los ejercicios:

```bash
kotlin -J--enable-native-access=ALL-UNNAMED -J--sun-misc-unsafe-memory-access=allow main.kts
```

También se puede ejecutar cada ejercicio por separado, por ejemplo:

```bash
kotlin -J--enable-native-access=ALL-UNNAMED -J--sun-misc-unsafe-memory-access=allow problemas/P2.kts
```

Las opciones `-J` evitan las advertencias de compatibilidad producidas por Kotlin al ejecutarse con versiones recientes de Java.

## Estructura de archivos

- `main.kts`: punto de entrada que ejecuta en orden los tres scripts de ejercicios.
- `problemas/P2.kts`: ordena una lista de diccionarios según una clave indicada mediante una función lambda.
- `problemas/P3.kts`: calcula la transpuesta de una matriz representada como una lista de listas mediante una función lambda.
- `problemas/P4.kts`: elimina de una lista los elementos indicados en otra lista mediante una función lambda.
