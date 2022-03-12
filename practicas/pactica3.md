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

    Módulo I - Práctica 2

    Profesor: Alan Badillo Salas

    << Integrantes >>

    [[Nombre Completo]]
    [[Correo Electrónico]]

    << Fecha >>

    [ALGORITMO/PSEUDOCÓDIGO MODIFICADO]

    [[Algoritmo/Pseudocódigo Final]]

    [[Capturas de pantalla del funcionamiento]]

    [RESPUESTAS A PREGUNTAS]

    [[Tabla con las listas antes y después de cada cambio]]

    [[Respuestas de las preguntas]]

    <<Conclusiones>>
    

---

## Descripción

* [40 puntos] Comenta cada línea el pseudocódigo explicando su funcionamiento en general y en particular.
* [40 puntos] Modifica el pseudocódigo para imprimir la tabla de las listas con las siguientes columnas: 
    - Los valores de `l` y `r`
    - La lista antes de la partición de `l` a `r`
    - El índice de partición
    - La lista antes de ordenar de `l` a `indice_particion - 1`
    - La lista antes de ordenar de `indice_particion + 1` a `r`
    - La lista después de ordenar de `indice_particion + 1` a `r`
* [20 puntos] Explica cómo funciona el algoritmo con tus propias palabras. Y responde las siguientes preguntas.
    - ¿Cómo funciona el subproceso `Intercambiar(lista_entrada, i, j)`?
        * ¿Qué representa `i`?
        * ¿Qué representa `j`?
        * ¿Qué hace el subproceso sobre `lista_entrada`?
    - ¿Cómo funciona el subproceso `indice_menor <- Particion(lista_entrada, l, r)`?
        * ¿Qué representa `indice_menor`?
        * ¿Qué representa `l`?
        * ¿Qué representa `r`?
        * ¿Qué hace el subproceso sobre `lista_entrada`?
    - ¿Cómo funciona el subproceso `Ordenar(lista_entrada, l, r)`?
        * ¿Qué representa `l`?
        * ¿Qué representa `indice_particion`?
        * ¿Qué representa `r`?
        * ¿Qué hace el subproceso sobre `lista_entrada`?

---

> Pseudocódigo | **Ordenamiento Rápido**

    # ORDENAMIENTO RÁPIDO

    SUBPROCESO Intercambiar (lista_entrada, i, j)
        
        DEFINIR temporal COMO ENTERO;
        
        temporal <- lista_entrada[i];
        lista_entrada[i] <- lista_entrada[j];
        lista_entrada[j] <- temporal;
        
    FIN SUBPROCESO

    SUBPROCESO indice_menor <- Particion (lista_entrada, l, r)
        
        DEFINIR pivote COMO ENTERO;
        
        pivote <- lista_entrada[r];
        
        IMPRIMIR "Particion (" l " " pivote " " r ")";
        
        DEFINIR k COMO ENTERO;
        
        DEFINIR indice_menor COMO ENTERO;
        
        indice_menor <- l - 1;
        
        PARA k <- l HASTA r - 1 CON PASO 1 HACER
            SI lista_entrada[k] < pivote ENTONCES
                indice_menor <- indice_menor + 1;
                Intercambiar(lista_entrada, indice_menor, k);
            FIN SI
        FIN PARA
        
        indice_menor <- indice_menor + 1;
        
        Intercambiar(lista_entrada, indice_menor, r);
        
    FIN SUBPROCESO

    SUBPROCESO Ordenar (lista_entrada, l, r)
        
        SI l < r ENTONCES
            
            IMPRIMIR "ORDENAR (" l " " r ")"; 
            
            DEFINIR indice_particion COMO ENTERO;
            
            indice_particion <- Particion(lista_entrada, l, r);
            
            IMPRIMIR l " " indice_particion " " r; 
            
            Ordenar(lista_entrada, l, indice_particion - 1);
            Ordenar(lista_entrada, indice_particion + 1, r);
            
        FIN SI
        
    FIN SUBPROCESO
        
    DEFINIR N COMO ENTERO;
    
    IMPRIMIR "Dame el tamaño de la lista a ordenar:";
    LEER N;
    
    DEFINIR lista COMO ENTERO;
    DIMENSION lista[N];
    
    DEFINIR i COMO ENTERO;
    
    PARA i <- 0 HASTA N - 1 CON PASO 1 HACER
        IMPRIMIR "Dame el valor de la lista en la posición " i ":";
        LEER lista[i];
    FIN PARA
    
    Ordenar(lista, 0, N - 1);
    
    PARA i <- 0 HASTA N - 1 CON PASO 1 HACER
        IMPRIMIR lista[i];
    FIN PARA