Algoritmo seleccionarAlumnoClaseAleatorio
	
	Definir listaAlumnos Como Cadena
    Definir numAlumnos Como Entero
    Definir alumnoSeleccionado Como Entero
    
	
    listaAlumnos = ["Alumno"]
    numAlumnos = Longitud(listaAlumnos)
	
    Escribir "Listado de alumnos:"
    Para i <- 1 Hasta 19 Con Paso 1 Hacer
        Escribir i, ".", listaAlumnos [i-1]
    FinPara
	
    Escribir "Pulsa cualquier tecla para seleccionar un alumno al azar."
    Leer alumnoSeleccionado
	
    alumnoSeleccionado = Azar(numAlumnos)
    Escribir "El alumno seleccionado es: " alumnoSeleccionado
FinAlgoritmo
