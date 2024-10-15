Algoritmo tablademultiplicar
	Definir numero1 Como Entero
	Definir i Como Entero
	Definir resultado Como Entero
	
	Escribir "Introduzca un número por el que quieras hacer la tabla de multiplicar"
	Leer numero1
	
	Para i = 0 Hasta 10 Con Paso 1
		resultado = numero1 * i
		Escribir numero1 " * ", i, " = ", resultado
	FinPara
	
FinAlgoritmo
