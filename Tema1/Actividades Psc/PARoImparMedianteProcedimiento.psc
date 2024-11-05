Algoritmo PARoImparMedianteProcedimiento
		Definir num Como Entero
		
		Escribir "Introduzca un numero"
		Leer num
		
		esPar(num)
FinAlgoritmo

Función EsPar (num)
Si num MOD 2 = 0 Entonces
	Escribir "El número ", num " es par."
Sino
	Escribir "El número ", num " es impar."
FinSi
FinFunción
