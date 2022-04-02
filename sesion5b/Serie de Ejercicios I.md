# Serie de Ejercicios I

![Logo CIC](../notas/figuras/logo.png)

    Diplomado de Java - Módulo I
    Departamento de Diplomados y Extensión Profesional
    Centro de Investigación en Cómputo
    Instituto Politécnico Nacional

---

[![Alan Badillo Salas](https://avatars.githubusercontent.com/u/79223578?s=40&v=4 "Alan Badillo Salas")](https://github.com/dragonnomada) Por [Alan Badillo Salas](https://github.com/dragonnomada)

---

## Variables

1. Lee una variable entera desde el usuario y muestra el mensaje: `"Tu variable es: %d y el doble es %d"`
2. Leer dos variables decimales desde el usuario y mostrar su suma.
3. Leer dos `a` y `b` decimales desde el usuario y mostrar `a ^ b`. 

## Condicionales Tradicionales

1. Leer una variable entera y determinar si es par.
2. Leer una variable entera y determinar si es múltiplo de 5 o de 7.
3. Leer una variable decimal y determinar si sus decimales son mayores a 0.5 o menores. 
   1. Por ejemplo `3.8` es mayor pero `3.49` menor (no se considera el entero).

## Iteradores Tradicionales

1. Sumar los primeros 100 números naturales (`1 + 2 + 3 + ... + 99 + 100`).
2. Imprimir la lista de los primeros 100 números naturales poniendo el número y su complemento a 100.
   1. Ejemplo: `1 - 99`, `2 - 98`, `3 - 97`, ..., `99 - 1`, `100 - 0`
3. Sumar los números del 1 al 100 pero sólo si son múltiplos de `3` o `7`.

> Pista

    for (int <iterador> = <valor inicial>; <iterador> < <tamaño>; <iterador>++) {
        ...
    }

## Arreglos

1. Crear un arreglo de enteros de tamaño 5 y poner los números `5, 2, 3, 1, 4` respectivamente.
   1. Imprime el arreglo hacía enfrente (`5 2 3 1 4`)
   2. Imprime el arreglo hacía atrás (`4 1 3 2 5`)
2. Crear un arreglo de tamaño `N` dado por el usuario.
   1. Leer cada posición del arreglo desde el usuario
   2. Sumar todos los valores del arreglo e imprimirlos
3. Crear un arreglo de tamaño `N` dado por el usuario.
   1. Leer cada posición del arreglo desde el usuario
   2. Imprimir el arreglo
   3. Preguntarle al usuario por dos posiciones del arreglo
   4. Intercambiar las dos posiciones
   5. Imprimir el arreglo nuevamente

## listas

1. Crear un `ArrayList<Integer>`
   1. Agregar algunos elementos (al menos 3)
   2. Sumar los elementos de la lista
   3. Preguntarle al usuario cuántos elementos más meter a la lista
   4. Leer cada elemento nuevo y agregarlo a la lista
   5. Volver a sumar los elementos de la lista
   6. Reportar la diferencia entre ambos

## Iteradores de Lista

1. Crear un `ArrayList<Integer>`
   1. Preguntarle al usuario cuántos elementos leer
   2. Leer cada elemento y agregarlo a la lista
   3. Recorrer cada elemento de la lista y sumarlo
   4. Imprimir la suma
   
> Pista

    for (int <elemento> : <lista>) {
        ...
    }

## Ciclos Condicionales

1. Crear una variable decimal `x = 2000.0`
   1. Repetir imprimir `x`
   2. Dividir a `x` entre `1.1`
2. Calcular el interés anual para un monto inicial de `4,600` con interés del `2%` mensual.
   1. Calcular cuántos meses pasarán para que el interés sea equivalente a los `4,600`

## Enumeraciones

1. Crear las siguientes enumeraciones para las cartas
   1. Tipo de carta (`corazones`, `picas`, `trébol` y `diamantes`)
   2. Color de carta (`roja`, `negra`)
   3. Número de carta (`az`, `dos`, `tres`, ..., `diez`, `jocker`, `queen`, `king`)
2. Crear la clase `Carta` que pida un tipo de carta, un color de carta y un número de carta
   1. Generar el método que devuelva un booleano si la carta es posible

> Pista

    No es posible generar una carta negra para corazones y diamantes
    o una carta roja para picas y tréboles

## Condicionales de Selección

1. Pedirle al usuario el tipo, color y número carta
   1. Formar un objeto de la clase `Carta` con esos valores
   2. Usando el `switch` determinar que tipo de carta es e imprimirla
   3. Usando el `switch` determinar que color de carta es e imprimirlo
   4. Usando el `switch` determinar que número de carta es e imprimirlo