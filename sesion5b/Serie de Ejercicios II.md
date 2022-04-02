# Serie de Ejercicios II

![Logo CIC](../notas/figuras/logo.png)

    Diplomado de Java - Módulo I
    Departamento de Diplomados y Extensión Profesional
    Centro de Investigación en Cómputo
    Instituto Politécnico Nacional

---

[![Alan Badillo Salas](https://avatars.githubusercontent.com/u/79223578?s=40&v=4 "Alan Badillo Salas")](https://github.com/dragonnomada) Por [Alan Badillo Salas](https://github.com/dragonnomada)

---

## Buscar el menor elemento de una lista

1. Crea una lista de decimales `ArrayList<Double>`
   1. Lee los valores desde el usuario, tanto el número de elementos, como los valores.
2. Busca el menor elemento de la lista e imprime el valor y su índice

## Buscar y eliminar un elemento de una lista

1. Crea una lista de decimales `ArrayList<Double>`
    1. Lee los valores desde el usuario, tanto el número de elementos, como los valores.
2. Solicita al usuario un elemento de la lista
   1. Determina si el elemento existe
   2. Imprime el índice del elemento si es que existe dentro de la lista
   3. Elimina el elemento de la lista en ese índice

## Intercambiar dos elementos de una lista

1. Crea una lista de decimales `ArrayList<Double>`
    1. Lee los valores desde el usuario, tanto el número de elementos, como los valores.
2. Solicita al usuario los índices de dos elementos
   1. Intercambia los valores de la lista en esos índices
   2. Imprime la lista intercambiada

## Ordenar una lista

1. Crea una lista de decimales `ArrayList<Double>`
    1. Lee los valores desde el usuario, tanto el número de elementos, como los valores.
2. Ordena la lista con el algoritmo descrito.

> Algoritmo de Ordenamiento

    ALGORITMO:
    
    1. Crear una lista vacía `ArrayList<Double>` llamada la lista final
    2. Mientras la lista original tenga elementos
        2.1 Buscar el elemento menor de la lista original (índice y valor)
        2.2 Agregar el elemento menor en la lista final
        2.3 Eliminar el elemento menor de la lista original
    3. Imprimir la lista final que es la lista ya ordenada