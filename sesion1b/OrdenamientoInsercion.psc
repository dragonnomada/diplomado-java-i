Proceso OrdenamientoInsercion
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
		
    FINPARA
	
    // COMIENZA ORDENAMIENTO POR INSERCIÓN
	
    DEFINIR valor COMO ENTERO;
    DEFINIR posicion COMO ENTERO;
	
    DEFINIR j COMO ENTERO;
    DEFINIR k COMO ENTERO;
	
    // Recorremos cada índice en la lista
    PARA i <- 0 HASTA N - 1 CON PASO 1 HACER
		
        // Buscamos la posición dónde insertar el valor del `i-ésimo` elemento
        valor <- lista[i];
        posicion <- i;
		
        // Comenzamos a buscar un valor mayor a nuestro valor actual
        PARA j <- 0 HASTA i - 1 CON PASO 1 HACER
			
            // Si hay un valor anterior más grande y no es el primero encontrado, entonces
            SI lista[j] >= valor Y posicion > j ENTONCES
				
                // actualizamos la posición donde se debería insertar
                posicion <- j;
				
            FINSI
			
        FINPARA
		
        // Recorremos los elementos a la derecha, desde nuestra posición actual,
        // hasta la posición donde se debería insertar
        PARA k <- i HASTA posicion + 1 CON PASO -1 HACER
			
            // Recorremos el valor a la derecha
            lista[k] = lista[k - 1];
			
        FINPARA
		
        // Insertamos el valor actual en la posición que le corresponde
        lista[posicion] = valor;
		
    FINPARA
	
	// Imprimimos la lista, ahora ordenada
    PARA i <- 0 HASTA N - 1 CON PASO 1 HACER
		
        IMPRIMIR lista[i];
		
    FINPARA
	
	Imprimir Aleatorio(0, 10);
FinProceso
