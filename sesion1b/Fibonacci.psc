Proceso Fibonacci
	DEFINIR N COMO entero;
	
    IMPRIMIR "Dame N:";
    LEER N;
	
    DEFINIR a COMO entero;
    DEFINIR b COMO entero;
    DEFINIR c COMO entero;
	
    a <- 1;
    b <- 1;
	
    IMPRIMIR a;
    IMPRIMIR b;
	
	DEFINIR i COMO entero;
	
    PARA i <- 3 HASTA N CON PASO 1 ENTONCES
        c <- a + b;
        a <- b;
        b <- c;
        IMPRIMIR c;
    FINPARA
FinProceso
