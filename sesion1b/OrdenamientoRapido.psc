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

Proceso OrdenamientoRapido
	
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
	
	Ordenar(lista, 0, N - 1);
	
	// Imprimimos la lista, ahora ordenada
    PARA i <- 0 HASTA N - 1 CON PASO 1 HACER
        IMPRIMIR lista[i];
    FIN PARA
	
FinProceso
