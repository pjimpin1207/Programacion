Algoritmo ParoImpar2
	leer num
	resultado = parImpar(num)
	Escribir "El número es " resultado "."
FinAlgoritmo

Funcion resultado = parImpar (num)
	Si num MOD 2=0
		resultado = "par"
	SiNo
		resultado = "impar"
	FinSi 
FinFuncion
	