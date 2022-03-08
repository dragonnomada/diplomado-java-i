Proceso OrdenamientoBurbuja
	DEFINIR N COMO ENTERO;
    
    IMPRIMIR "Dame el tama�o de la lista a ordenar:";
    LEER N;
	
    DEFINIR lista COMO ENTERO;
    DIMENSION lista[N];
	
    DEFINIR i COMO ENTERO;
	
    // Capturamos el valor de cada posici�n en la lista
    PARA i <- 0 HASTA N - 1 CON PASO 1 HACER
		
        IMPRIMIR "Dame el valor de la lista en la posici�n " i ":";
        LEER lista[i];
		
    FINPARA
	
	// COMIENZA ORDENAMIENTO BURBUJA
	
    DEFINIR burbuja_actual COMO ENTERO;
    DEFINIR burbuja_siguiente COMO ENTERO;
	
    DEFINIR j COMO ENTERO;
	
    // Iteramos N veces, en cada una aseguramos la burbuja m�s grande al final
    PARA i <- 0 HASTA N - 1 CON PASO 1 HACER
		
        // Recorremos cada pareja (actual y siguiente)
        // desde `0` hasta `N - 2` (las parejas ser�n [0, 1], [1, 2], ..., [N-2, N-1])
        PARA j <- 0 HASTA N - 2 CON PASO 1 HACER
			
            // Recuperamos el valor de la burbuja actual y la siguiente
            burbuja_actual = lista[j];
            burbuja_siguiente = lista[j + 1];
			
            // Comprobamos si la burbuja actual es mayor a la siguiente
            SI burbuja_actual > burbuja_siguiente ENTONCES
				
                // Intercambiamos las burbujas en la lista
                lista[j] = burbuja_siguiente;
                lista[j + 1] = burbuja_actual;
				
            FINSI
			
        FINPARA
		
    FINPARA
	
	// Imprimimos la lista, ahora ordenada
    PARA i <- 0 HASTA N - 1 CON PASO 1 HACER
		
        IMPRIMIR lista[i];
		
    FINPARA
FinProceso
