Algoritmo anyobisiesto
	
	Definir anyo Como real
	
	Escribir "Introduce un año"
	Leer anyo
	
	Si (anyo MOD 4=0) o anyo MOD 100=1 Y (anyo MOD 400=0) Entonces
		Escribir "El año ", anyo " es bisiesto"
	SiNo
		Escribir "El año ", anyo " no es bisiesto"
	FinSi

FinAlgoritmo
