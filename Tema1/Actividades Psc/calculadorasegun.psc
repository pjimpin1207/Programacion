Algoritmo calculadorasegun
	Definir numero1 Como Real
	Definir numero2 Como Real
	Definir operacion Como Cadena
	Definir resultado Como Real
	Definir numero3 como real
	
	
	Escribir "Selecciona el tipo de operacion: "
	Escribir "suma"
	Escribir "resta"
	Escribir "division"
	Escribir "multiplicación"
	Escribir "raiz"
	Leer operacion
	
	Si operacion = "raiz" Entonces
		Escribir "Introduzca el numero para la raiz"
		Leer numero3
	SiNo 
		Escribir "Introduce el primer número"
		Leer numero1
		Escribir "Introduce el segundo número"
		Leer numero2
	FinSi

	Segun operacion Hacer
		"suma":
			resultado = numero1 + numero2 
		"resta":
			Resultado = numero1 - numero2
		"division":
			resultado = numero1 / numero2
		"multiplicacion":
			resultado = numero1 * numero2
		"raiz": 
			resultado = raiz (numero3)
			
		De Otro Modo:
			Escribir "Ha ocurrido un error"
	FinSegun
	
	Escribir "El resultado es: ", resultado
	
FinAlgoritmo
