SubProceso indice_menor <- MenorIndice ( lista_entrada, N )
	
	Definir valor_menor Como Entero;
	
	valor_menor <- lista_entrada[0];
	
	Definir indice_menor Como Entero;
	
	indice_menor <- 0;
	
	Definir i Como Entero;
		
	Para i <- 0 Hasta N - 1 Con Paso 1 Hacer
		Si lista_entrada[i] < valor_menor Entonces
			valor_menor <- lista_entrada[i];
			indice_menor <- i;
		FinSi
	FinPara
	
Fin SubProceso


SubProceso CopiarLista ( lista_entrada, lista_salida, N )
	
	Definir i Como Entero;
	
	Para i <- 0 Hasta N - 1 Hacer
		lista_salida[i] <- lista_entrada[i];
	FinPara
	
FinSubProceso

SubProceso OrdernarLista ( lista_entrada, lista_salida, N )
	
	// 1. lista_copiada <- CopiarLista(lista_entrada, N)
	Definir lista_copiada Como Entero;
	Dimension lista_copiada[N];
	
	CopiarLista(lista_entrada, lista_copiada, N);
	
	// 2. Definir la lista_ordena del mismo tamaño que lista_entrada
	//Definir lista_ordenada Como Entero;
	//Dimension lista_ordenada[N];
	
	// 3. i <- 0
	Definir i Como Entero;
	i <- 0;
	
	// 4. M <- N
	Definir M Como Entero;
	M <- N;
	
	Definir indice_menor Como Entero;
	Definir valor_menor Como Entero;
	
	// 5. MIENTRAS i < N HACER
	Mientras i < N Hacer
		// 5.1 indice_menor <- MenorIndice(lista_copiada, M)
		indice_menor <- MenorIndice(lista_copiada, M);
		// 5.2 valor_menor <- lista_copiada[indice_menor]
		valor_menor <- lista_copiada[indice_menor];
		// 5.3 lista_ordenada[i] <- valor_menor
		lista_salida[i] <- valor_menor;
		// 5.4 lista_copiada[indice_menor] <- lista_copiada[M - 1]
		lista_copiada[indice_menor] <- lista_copiada[M - 1];
		// 5.6 i <- i + 1
		i <- i + 1;
		// 5.7 M <- M - 1
		M <- M - 1;
	FinMientras
	
Fin SubProceso

Proceso BusquedaExtremos
	
	Definir lista Como Entero;
	Dimension lista[10];
	
	lista[0] <- 5;
	lista[1] <- 4;
	lista[2] <- 6;
	lista[3] <- 3;
	lista[4] <- 7;
	lista[5] <- 2;
	lista[6] <- 8;
	lista[7] <- 1;
	lista[8] <- 9;
	lista[9] <- 3;
	
	Definir lista_ordenada Como Entero;
	Dimension  lista_ordenada[10];
	
	OrdernarLista(lista, lista_ordenada, 10);
	
	//Definir i Como Entero;
	
	//Para i <- 0 Hasta 9 Con Paso 1 Hacer
	//	Imprimir i ": " lista_ordenada[i];
	//FinPara
	
	Definir valor_menor Como Entero;
	Definir valor_mayor Como Entero;
	
	valor_menor <- lista_ordenada[0];
	valor_mayor <- lista_ordenada[9];
	
	Imprimir "Menor: " valor_menor;
	Imprimir "Mayor: " valor_mayor;
	
FinProceso







