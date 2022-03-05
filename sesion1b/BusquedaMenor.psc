Proceso BusquedaMenor
	
	Definir lista Como Entero;
	Dimension lista[5];
	
	lista[0] <- 4;
	lista[1] <- 2;
	lista[2] <- 1;
	lista[3] <- 5;
	lista[4] <- 3;
	
	Definir minimo Como Entero;
	
	minimo <- lista[0];
	
	Definir i Como Entero;
	
	Para i <- 0 Hasta 4 Con Paso 1 Hacer
		Si lista[i] < minimo Entonces
			minimo <- lista[i];
		FinSi
	FinPara
	
	Imprimir "Mínimo: " minimo;
	
FinProceso
