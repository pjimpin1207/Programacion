Algoritmo trianguloss
	Definir lado1 Como Real
	Definir lado2 Como Real
	Definir lado3 Como Real
	
	Escribir "Introduzca el lado 1"
	Leer lado1
	Escribir "Introduzca el lado 2"
	Leer lado2
	Escribir "Introduzca el lado 3"
	Leer lado3
	
	
Si (lado1 + lado2 > lado3) Y (lado1 + lado3 > lado2) Y (lado2 + lado3 > lado1) Entonces
		Si lado1 = lado2 Y lado2 = lado3 Entonces
		Escribir "Es un triángulo equilátero"
	SiNo
		Si (lado1 = lado2) o (lado2 = lado3) o (lado1 = lado3) Entonces
			Escribir "Es un triángulo isósceles"
		SiNo
			Escribir "Es un triángulo escaleno"
		FinSi
	FinSi
SiNo
	Escribir "Las longitudes no forman un triángulo"
FinSi
	
FinAlgoritmo
