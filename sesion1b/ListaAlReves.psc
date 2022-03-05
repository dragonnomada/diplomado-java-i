Proceso ListaAlReves
	
	Definir lista Como Entero;
	Dimension lista[10];
	
	Definir i Como Entero;
	
	Para i <- 0 Hasta 9 Con Paso 1 Hacer
		Imprimir "Posición " i ":";
		Leer lista[i];
	FinPara
	
	Para i <- 9 Hasta 0 Con Paso -1 Hacer
		Imprimir lista[i];
	FinPara
	
	Imprimir "Otra forma:";
	
	Para i <- 0 Hasta 9 Con Paso 1 Hacer
		Imprimir lista[9 - i];
	FinPara
	
FinProceso
