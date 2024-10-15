Algoritmo PARoImpar
	Definir num Como Entero
	Definir tipodenumero Como Logico
	
	Escribir "Introduzca un numero"
	Leer num
	
	tipodenumero = esPar(num)
	Si tipodenumero = Verdadero Entonces
		Escribir "El número ", num " es par."
	SiNo 
		Escribir "El número ", num " es impar."
	FinSi
FinAlgoritmo


	Función tipodenumero = EsPar (num)
    Si num MOD 2 = 0 Entonces
        tipodenumero = Verdadero
    Sino
        tipodenumero = Falso
    FinSi
	FinFunción