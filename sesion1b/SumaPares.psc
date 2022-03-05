Proceso SumaPares
	
	Definir suma Como Entero;
	
	suma <- 0;
	
	Definir i Como Entero;
	
	Para i <- 1 Hasta 100 Con Paso 1 Hacer
		Si i Mod 2 = 0 Entonces
			suma <- suma + i;
		FinSi
	FinPara
	
	Imprimir "2 + 4 + 6 + ... + 98 + 100 = " suma;
	
FinProceso
