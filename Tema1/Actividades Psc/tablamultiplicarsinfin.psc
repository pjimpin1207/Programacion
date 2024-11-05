Algoritmo sin_titulo
	Definir numero1 Como Entero
	Definir i Como Entero
	Definir resultado Como Entero
	
	
	
	Mientras numero1 <> "salir" Hacer
		Escribir "Introduzca un número para realizar la tabla o salir para acabar"
		Leer numero1 
	Si numero1 = "salir" Entonces
		Escribir "Has salido del programa"
	SiNo
		num = ConvertirANumero(entrada)
	FinSi
	
	Para i = 0 Hasta 10 Con Paso 1
		resultado = numero1 * i
		Escribir numero1 " * ", i, " = ", resultado
	FinPara
	
	FinMientras
	
FinAlgoritmo
