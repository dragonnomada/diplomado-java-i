Proceso BIN_A_DEC
	
	Definir display Como Caracter;
	Dimension display[100];
	
	Definir N Como Entero;
	
	Definir x Como Entero;
	
	x <- 0;
	
	Definir i Como Entero;
	
	i <- 0;
	
	Mientras x <> -1 Hacer
		Leer x;
		display[i] <- ConvertirATexto(x);
		i <- i + 1;
	FinMientras
	
	N <- i - 1;
	
	Imprimir "Se capturaron " N " caracteres";
	
	Para  i <- 0 Hasta N - 1 Con Paso 1 Hacer
		Imprimir display[i];
	FinPara
	
	Definir suma Como Entero;
	
	suma <- 0;
	
	Para i <- 0 Hasta N - 1 Con Paso 1 Hacer
		Si display[i] == '1' Entonces
			suma <- suma + 2^(N - 1 - i);
		FinSi
	FinPara
	
	Imprimir "Dec " suma;
	
FinProceso
