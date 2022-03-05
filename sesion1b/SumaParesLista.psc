Proceso SumaParesLista
	
	// Definimos N entero y lo leemos del usuario
	Definir N Como Entero;
	
	Imprimir "Dame el tamaño de la lista:";
	Leer N;
	
	// Definimos una lista de enteros de tamaño N
	Definir lista Como Entero;
	Dimension lista[N];
	
	Definir i Como Entero;
	
	// Recorremos un iterando que representa el índice
	// en la lista, desde el primero (0), hasta el últomo (N - 1)
	Para i <- 0 Hasta N - 1 Con Paso 1 Hacer
		// Pedimos el valor de la lista en la posición i
		Imprimir "Posición " i ":";
		Leer lista[i];
	FinPara
	
	// Definimos una suma entera dónde acumularemos los valores pares
	// de la lista
	Definir suma Como Entero;
	
	suma <- 0;
	
	// Recorremos la lista por índices del 0 al N - 1
	Para i <- 0 Hasta N - 1 Con Paso 1 Hacer
		// Determinamos si el valor en la lista en la posición i
		// es par, entonces lo sumamos a nuestro acumulador de suma
		Si lista[i] Mod 2 = 0 Entonces
			suma <- suma + lista[i];
		FinSi
	FinPara
	
	Imprimir "Suma es: " suma;
	
FinProceso
