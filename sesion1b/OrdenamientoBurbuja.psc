Proceso OrdenamientoBurbuja
	
	Definir N Como Entero;
	
	Imprimir "Dame el tamaño de la lista:";
	Leer N;
	
	Definir lista Como Entero;
	Dimension lista[N];
	
	Definir i Como Entero;
	
	Para i <- 0 Hasta N - 1 Con Paso 1 Hacer
		Imprimir i ": ";
		Leer lista[i];
	FinPara
	
	// Método de la Burbuja
	Definir j Como Entero;
	Definir burbuja_izquierda Como Entero;
	Definir burbuja_derecha Como Entero;
	
	Para i <- 1 Hasta N Con Paso 1 Hacer
		
		Para j <- 0 Hasta N - 2 Con Paso 1 Hacer
			
			burbuja_izquierda <- lista[j];
			burbuja_derecha <- lista[j + 1];
			
			Si burbuja_izquierda > burbuja_derecha Entonces
				lista[j] <- burbuja_derecha;
				lista[j + 1] <- burbuja_izquierda;
			FinSi
			
		FinPara
		
	FinPara
	
	Imprimir "Lista Ordenada:";
	
	Para i <- 0 Hasta N - 1 Con Paso 1 Hacer
		Imprimir lista[i];
	FinPara
	
FinProceso
