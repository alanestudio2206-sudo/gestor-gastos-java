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
dejar el texto: "CONTROL PERSONAL DE GASTOS".
~~~~
## Conclusión individual

**Lopez Cruz Alan:**


¿Qué diferencia encontré entre commit y push?
El commit guarda mis cambios en mi compu, y el push los sube a GitHub para que mi compañero los vea.

¿Por qué debe hacerse pull antes de modificar archivos?
Para no trabajar con una versión vieja y evitar conflictos con lo que ya subió mi compañero.

¿Para qué sirve trabajar en ramas?
Para que cada quien haga su parte sin afectar el código del otro hasta que esté listo.

¿Qué ocasionó el conflicto?
Mi compañero y yo modificamos la misma línea del título del programa, cada uno con un texto diferente.

¿Cómo decidí qué código conservar?
Nos pusimos de acuerdo y combinamos ambas ideas en un solo texto.

¿Qué aporté personalmente al programa?
Hice el registro de gastos con sus validaciones y el método para mostrar la lista completa.

**[Nombre de tu compañero]:**

¿Qué diferencia encontró entre commit y push?

¿Por qué debe hacerse pull antes de modificar archivos?

¿Para qué sirve trabajar en ramas?

¿Qué ocasionó el conflicto?

¿Cómo decidió qué código conservar?

¿Qué aportó personalmente al programa?