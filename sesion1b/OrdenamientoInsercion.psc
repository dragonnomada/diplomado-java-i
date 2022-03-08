Proceso OrdenamientoInsercion
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
	
    // COMIENZA ORDENAMIENTO POR INSERCI�N
	
    DEFINIR valor COMO ENTERO;
    DEFINIR posicion COMO ENTERO;
	
    DEFINIR j COMO ENTERO;
    DEFINIR k COMO ENTERO;
	
    // Recorremos cada �ndice en la lista
    PARA i <- 0 HASTA N - 1 CON PASO 1 HACER
		
        // Buscamos la posici�n d�nde insertar el valor del `i-�simo` elemento
        valor <- lista[i];
        posicion <- i;
		
        // Comenzamos a buscar un valor mayor a nuestro valor actual
        PARA j <- 0 HASTA i - 1 CON PASO 1 HACER
			
            // Si hay un valor anterior m�s grande y no es el primero encontrado, entonces
            SI lista[j] >= valor Y posicion > j ENTONCES
				
                // actualizamos la posici�n donde se deber�a insertar
                posicion <- j;
				
            FINSI
			
        FINPARA
		
        // Recorremos los elementos a la derecha, desde nuestra posici�n actual,
        // hasta la posici�n donde se deber�a insertar
        PARA k <- i HASTA posicion + 1 CON PASO -1 HACER
			
            // Recorremos el valor a la derecha
            lista[k] = lista[k - 1];
			
        FINPARA
		
        // Insertamos el valor actual en la posici�n que le corresponde
        lista[posicion] = valor;
		
    FINPARA
	
	// Imprimimos la lista, ahora ordenada
    PARA i <- 0 HASTA N - 1 CON PASO 1 HACER
		
        IMPRIMIR lista[i];
		
    FINPARA
	
	Imprimir Aleatorio(0, 10);
FinProceso
