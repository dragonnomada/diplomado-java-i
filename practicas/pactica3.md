# PRÁCTICA 3

![Logo CIC](../notas/figuras/logo.png)

    Diplomado de Java - Módulo I
    Departamento de Diplomados y Extensión Profesional
    Centro de Investigación en Cómputo
    Instituto Politécnico Nacional

---

[![Alan Badillo Salas](https://avatars.githubusercontent.com/u/79223578?s=40&v=4 "Alan Badillo Salas")](https://github.com/dragonnomada) Por [Alan Badillo Salas](https://github.com/dragonnomada)

---

## Introducción

Está práctica puede hacerse individual o en equipo de máximo **tres** integrantes.

Deberán crear una carpeta llamada `practica3` que anexe este documento, el documento de reporte de la práctica con el formato descrito abajo.

> Formato del reporte

    [PORTADA]

    << Título >>

    Diplomado de Java - Módulo I
    Departamento de Diplomados y Extensión Profesional
    Centro de Investigación en Cómputo
    Instituto Politécnico Nacional

    Módulo I - Práctica 3

    Profesor: Alan Badillo Salas

    << Integrantes >>

    [[Nombre Completo]]
    [[Correo Electrónico]]

    << Fecha >>

    [[DESARROLLO]]

    [[PSEUDOCÓDIGO]]

    [[CÓDIGO JAVA]]

    [[CAPTURAS DE PANTALLA COMPILACIÓN]]

    [[CAPTURAS DE PANTALLA EJECUCIÓN]]

    <<Conclusiones>>
    

---

## Descripción

* [20 puntos] Describe el método de **Ordenamiento Burbuja**.
* [40 puntos] Implementa el pseudocódigo en código Java.
* [20 puntos] Comenta cada línea del código Java.
* [20 puntos] Compila y ejecuta el código, captura pantalla de dichos procesos.

---

> Pseudocódigo | **Ordenamiento Burbuja**

    # ORDENAMIENTO BURBUJA

    DEFINIR N COMO ENTERO;

    IMPRIMIR "Dame el tamaño de la lista a ordenar:";
    LEER N;

    DEFINIR lista COMO ENTERO;
    DIMENSION lista[N];

    DEFINIR i COMO ENTERO;

    // Capturamos el valor de cada posición en la lista
    PARA i <- 0 HASTA N - 1 CON PASO 1 HACER
        IMPRIMIR "Dame el valor de la lista en la posición " i ":";
        LEER lista[i];
    FIN PARA

    // COMIENZA ORDENAMIENTO BURBUJA

    DEFINIR burbuja_actual COMO ENTERO;
    DEFINIR burbuja_siguiente COMO ENTERO;

    DEFINIR j COMO ENTERO;

    // Iteramos N veces, en cada una aseguramos la burbuja más grande al final
    PARA i <- 0 HASTA N - 1 CON PASO 1 HACER

        // Recorremos cada pareja (actual y siguiente)
        // desde `0` hasta `N - 2` (las parejas serán [0, 1], [1, 2], ..., [N-2, N-1])
        PARA j <- 0 HASTA N - 2 CON PASO 1 HACER

            // Recuperamos el valor de la burbuja actual y la siguiente
            burbuja_actual = lista[j];
            burbuja_siguiente = lista[j + 1];
        
            // Comprobamos si la burbuja actual es mayor a la siguiente
            SI burbuja_actual > burbuja_siguiente ENTONCES
                // Intercambiamos las burbujas en la lista
                lista[j] = burbuja_siguiente;
                lista[j + 1] = burbuja_actual;
            FIN SI

        FIN PARA

    FIN PARA

    // Imprimimos la lista, ahora ordenada
    PARA i <- 0 HASTA N - 1 CON PASO 1 HACER

        IMPRIMIR lista[i];

    FIN PARA