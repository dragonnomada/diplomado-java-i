Proceso LeerLista
	
	Definir N Como Entero;
	
	Imprimir "Dame el tama�o de la lista:";
	Leer N;
	
	// Define una variable de tipo entero
	Definir lista Como Entero;
	// Convierte la variable en una lista de enteros de tama�o N
	Dimension lista[N];
	
	Definir i Como Entero;
	
	Para i <- 0 Hasta N - 1 Con Paso 1 Hacer
		Imprimir "Posici�n " i ": ";
		Leer lista[i];
	FinPara
	
	// TODO: SUMAR LO N�MEROS PARES DE LA LISTA
	
FinProceso
