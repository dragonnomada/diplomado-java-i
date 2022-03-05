Proceso SumaLista
	
	DEFINIR lista COMO entero;
	DIMENSION lista[5];
	
	lista[0] <- 2;
	lista[1] <- 6;
	lista[2] <- 5;
	lista[3] <- 3;
	lista[4] <- 1;
	
	DEFINIR suma COMO entero;
	
	suma <- 0;
	
	DEFINIR i COMO entero;
	
	PARA i <- 0 HASTA 4 CON PASO 1 ENTONCES
		suma <- suma + lista[i];
	FINPARA
	
	IMPRIMIR "La suma es: " suma;
	
FinProceso
