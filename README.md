# Gestor Semanal de Gastos

## Integrantes
- Lopez Cruz Alan - Estudiante A
- [Nombre de tu compañero] - Estudiante B

## Responsabilidades de cada integrante

**Estudiante A:**
- Registro de gastos con validación de categoría y monto.
- Visualización de la lista de gastos registrados.

**Estudiante B:**
- Cálculo del gasto total.
- Identificación del gasto mayor.
- Cálculo de total por categoría.
- Resumen semanal (total, promedio, gasto mayor).

## Instrucciones para ejecutar el programa

1. Clonar el repositorio: `git clone [URL del repo]`
2. Abrir el proyecto en IntelliJ IDEA.
3. Ejecutar la clase `Main.java`.
4. Seguir el menú interactivo para registrar y consultar gastos.

## Métodos implementados

- `registrarGasto()` — solicita concepto, categoría y monto; valida los datos.
- `mostrarGastos()` — despliega todos los gastos registrados.
- `calcularTotal()` — suma el monto de todos los gastos.
- `obtenerPosicionGastoMayor()` — identifica la posición del gasto más alto.
- `calcularTotalPorCategoria()` — suma los gastos de una categoría específica.
- `mostrarResumen()` — muestra número de gastos, total, promedio y gasto mayor.

## Conflicto encontrado y forma de resolverlo

Al modificar ambos la misma línea del título del programa en ramas distintas
(`titulo-estudiante-a` y `titulo-estudiante-b`), Git no pudo fusionar
automáticamente los cambios. Se resolvió editando manualmente el archivo en
conflicto, eliminando las marcas `<<<<<<<`, `=======` y `>>>>>>>`, y acordando
dejar el texto: "SISTEMA PERSONAL DE CONTROL DE GASTOS".

## Conclusión individual

**Lopez Cruz Alan:**

¿Qué diferencia encontró entre commit y push?

¿Por qué debe hacerse pull antes de modificar archivos?

¿Para qué sirve trabajar en ramas?

¿Qué ocasionó el conflicto?

¿Cómo decidió qué código conservar?

¿Qué aportó personalmente al programa?

**[Nombre de tu compañero]:**

¿Qué diferencia encontró entre commit y push?

¿Por qué debe hacerse pull antes de modificar archivos?

¿Para qué sirve trabajar en ramas?

¿Qué ocasionó el conflicto?

¿Cómo decidió qué código conservar?

¿Qué aportó personalmente al programa?