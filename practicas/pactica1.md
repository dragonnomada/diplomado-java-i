# PRÁCTICA 1

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

Deberán crear una carpeta llamada `practica1` que anexe este documento, el documento de reporte de la práctica con el formato descrito abajo.

> Formato del reporte

    [PORTADA]

    << Título >>

    Diplomado de Java - Módulo I
    Departamento de Diplomados y Extensión Profesional
    Centro de Investigación en Cómputo
    Instituto Politécnico Nacional

    Módulo I - Práctica 1

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
* [40 puntos] Modifica el pseudocódigo para imprimir la tabla de las listas: 
    - Los valores de `l`, `m` y `r`
    - La lista antes de ordenar la lista de `l` a `m - 1`
    - La lista antes de ordenar la lista de `m` a `r`
    - La lista antes de mezclar la lista de `l`, `m` y `r`
    - La lista después de la mezcla
* [20 puntos] Explica cómo funciona el algoritmo con tus propias palabras. Y responde las siguientes preguntas.
    - ¿Cómo funciona el subproceso `Mezclar(lista_entrada, l, m, r)`?
        * ¿Qué representa `l`?
        * ¿Qué representa `m`?
        * ¿Qué representa `r`?
        * ¿Qué hace el subproceso sobre `lista_entrada`?
    - ¿Cómo funciona el subproceso `Ordenar(lista_entrada, l, r)`?
        * ¿Qué representa `l`?
        * ¿Qué representa `m`?
        * ¿Qué representa `r`?
        * ¿Qué hace el subproceso sobre `lista_entrada`?

---

> Pseudocódigo | **Ordenamiento por Mezcla**

    # ORDENAMIENTO POR MEZCLA

    SUBPROCESO Mezclar (lista_entrada, l, m, r)
	
        IMPRIMIR "MEZCLAR (" l " " m " " r ")";
        
        DEFINIR Nl COMO ENTERO;
        DEFINIR Nr COMO ENTERO;
        
        Nl <- m - l;
        Nr <- r - m + 1;
        
        IMPRIMIR Nl " " Nr;
        
        DEFINIR Ml COMO ENTERO;
        DEFINIR Mr COMO ENTERO;
        
        Ml <- Nl;
        Mr <- Nr;
        
        SI Ml <= 0 ENTONCES
            Ml <- 1;
        FIN SI
        
        SI Mr <= 0 ENTONCES
            Mr <- 1;
        FIN SI
        
        DEFINIR lista_izquierda COMO ENTERO;
        DIMENSION lista_izquierda[Ml];
        
        DEFINIR lista_derecha COMO ENTERO;
        DIMENSION lista_derecha[Mr];
        
        DEFINIR i COMO ENTERO;
        DEFINIR j COMO ENTERO;
        
        PARA i <- 0 HASTA Nl - 1 CON PASO 1 HACER
            lista_izquierda[i] <- lista_entrada[l + i];
        FIN PARA
        
        PARA j <- 0 HASTA Nr - 1 CON PASO 1 HACER
            lista_derecha[j] <- lista_entrada[m + j];
        FIN PARA
        
        DEFINIR k COMO ENTERO;
        
        i <- 0;
        j <- 0;
        k <- l;
        
        MIENTRAS i < Nl Y j < Nr Y k <= r HACER
            SI lista_izquierda[i] <= lista_derecha[j] ENTONCES
                lista_entrada[k] = lista_izquierda[i];
                i <- i + 1;
            SINO
                lista_entrada[k] = lista_derecha[j];
                j <- j + 1;
            FIN SI
            k <- k + 1;
        FIN MIENTRAS
        
        MIENTRAS i < Nl Y k <= r HACER
            lista_entrada[k] = lista_izquierda[i];
            i <- i + 1;
            k <- k + 1;
        FIN MIENTRAS
        
        MIENTRAS j < Nr Y k <= r HACER
            lista_entrada[k] = lista_derecha[j];
            j <- j + 1;
            k <- k + 1;
        FIN MIENTRAS
        
    FIN SUBPROCESO

    SUBPROCESO Ordenar ( lista_entrada, l, r )
        
        SI l < r ENTONCES
            
            DEFINIR m COMO ENTERO;
            
            m <- Redon( (l + r + 1) / 2 );
            
            Imprimir "L: " l " M: " m " R: " r; 
            
            Ordenar(lista_entrada, l, m - 1);
            
            Ordenar(lista_entrada, m, r);
            
            Mezclar(lista_entrada, l, m, r);
            
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