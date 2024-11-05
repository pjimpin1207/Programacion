Algoritmo calculadorasegun
	Definir num1 Como Real
	Definir num2 Como Real
	Definir operacion Como Cadena
	Definir resultado Como Real
	Definir numero3 como real
	
	acumulador = 0
	
	Repetir
		Escribir "Selecciona el tipo de operacion: "
		Escribir "Introduzca 1 para la suma"
		Escribir "Introduzca 2 para la resta"
		Escribir "Introduzca 3 para la division"
		Escribir "Introduzca 4 para la multiplicación"
		Escribir "Introduzca 5 para el acumulador"
		Escribir "Introduzca 6 para el contador"
		Escribir "Introduzca 7 para calcular el MOD"
		Escribir "Introduzca 10 para salir"
		
		Leer operacion
		
		
		
		Segun operacion Hacer
			"1":
				Escribir "Introduce el primer número:"
                Leer num1
                Escribir "Introduce el segundo número:"
                Leer num2
                resultado = num1 + num2
                
			"2":
				Escribir "Introduce el primer número:"
                Leer num1
                Escribir "Introduce el segundo número:"
                Leer num2
                resultado = num1 - num2
                
			"3":
				Escribir "Introduce el primer número:"
                Leer num1
                Escribir "Introduce el segundo número:"
                Leer num2
                resultado = num1 / num2
               
			"4":
				Escribir "Introduce el primer número:"
                Leer num1
                Escribir "Introduce el segundo número:"
                Leer num2
                resultado = num1 * num2
		
			"5":
				esAcumulador
			"6":
				Escribir "Escriba hasta que numero quiere contar"
				leer contar
				numerocontar = 0
				Mientras contar >= numerocontar
					Escribir numerocontar
					Esperar 1 Segundos
					numerocontar = numerocontar + 1
				FinMientras
				Escribir "Has llegado a tu numero"
			"7":
				esMod
				
			"10":
				Escribir "Saliendo de la calculadora. ¡Hasta luego!"
			De Otro Modo:
				Escribir "Opción no valida"
		FinSegun
	Hasta Que operacion = "10"
	Escribir "El resultado es: ", resultado

	
FinAlgoritmo

Funcion esAcumulador
	Definir numero, acumulador Como Real
    acumulador = 0  // Inicializar el acumulador
	
    Escribir "Bienvenido al acumulador"
	
    Escribir "Introduce un número (o 0 para salir):"
    Leer numero
	
    Mientras numero <> 0 Hacer
        acumulador = acumulador + numero  // Sumar el número al acumulador
        Escribir "Acumulador actual: ", acumulador
        
        Escribir "Introduce otro número (o 0 para salir):"
        Leer numero
    Fin Mientras
	
    Escribir "Saliendo del acumulador."
FinFuncion

Funcion esMod
	Definir n, num1, num2, resultado Como Entero
	
    Escribir "¿Cuántos pares de números deseas ingresar?"
    Leer n
	
    Para i Desde 1 Hasta n Hacer
        Escribir "Introduce el primer número:"
        Leer num1
        Escribir "Introduce el segundo número:"
        Leer num2
        
        Si num2 <> 0 Entonces
            resultado = num1 % num2  // Calcular el módulo
            Escribir "El módulo de ", num1, " y ", num2, " es: ", resultado
        Sino
            Escribir "Error: No se puede calcular el módulo con cero."
        FinSi
    Fin Para
	
    Escribir "Operaciones completadas."
FinFuncion
