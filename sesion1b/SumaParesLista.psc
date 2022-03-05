Proceso SumaParesLista
	
	// Definimos N entero y lo leemos del usuario
	Definir N Como Entero;
	
	Imprimir "Dame el tama�o de la lista:";
	Leer N;
	
	// Definimos una lista de enteros de tama�o N
	Definir lista Como Entero;
	Dimension lista[N];
	
	Definir i Como Entero;
	
	// Recorremos un iterando que representa el �ndice
	// en la lista, desde el primero (0), hasta el �ltomo (N - 1)
	Para i <- 0 Hasta N - 1 Con Paso 1 Hacer
		// Pedimos el valor de la lista en la posici�n i
		Imprimir "Posici�n " i ":";
		Leer lista[i];
	FinPara
	
	// Definimos una suma entera d�nde acumularemos los valores pares
	// de la lista
	Definir suma Como Entero;
	
	suma <- 0;
	
	// Recorremos la lista por �ndices del 0 al N - 1
	Para i <- 0 Hasta N - 1 Con Paso 1 Hacer
		// Determinamos si el valor en la lista en la posici�n i
		// es par, entonces lo sumamos a nuestro acumulador de suma
		Si lista[i] Mod 2 = 0 Entonces
			suma <- suma + lista[i];
		FinSi
	FinPara
	
	Imprimir "Suma es: " suma;
	
FinProceso
