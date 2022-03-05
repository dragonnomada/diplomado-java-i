Proceso MientrasSuma50
	
	Definir N Como Entero;
	
	Imprimir "Dame el tamaño de la lista:";
	Leer N;
	
	Definir lista Como Entero;
	Dimension lista[N];
	
	Definir i Como Entero;
	
	Para i <- 0 Hasta N - 1 Con Paso 1 Hacer
		Imprimir "Posición: " i;
		Leer lista[i];
	FinPara
	
	Definir suma Como Entero;
	
	suma <- 0;
	
	i <- 0;
	
	Mientras suma < 50 Y i < N Hacer
		suma <- suma + lista[i];
		i <- i + 1;
	FinMientras
	
	Imprimir "Total: " i;
	Imprimir "Suma: " suma;
FinProceso
