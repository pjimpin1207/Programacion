package Ejercicio9;

import java.io.RandomAccessFile;

public class Main {

    private static final String FILE_PATH = "ejercicio9.dat";

    public static void main(String[] args) {
        try {
            // 1. Crear o recrear el fichero
            RandomFileUtils.recreateFile(FILE_PATH);

            // 2. Escribir "defg" con RandomAccessFile
            try (RandomAccessFile raf = new RandomAccessFile(FILE_PATH, "rw")) {
                RandomFileUtils.writeString(raf, "defg");
            }

            // 3. Leer e imprimir contenido
            System.out.println("Contenido tras escribir 'defg': "
                    + RandomFileUtils.readAll(FILE_PATH));

            // 4. Añadir "abc" al principio y "hij" al final
            RandomFileUtils.insertAtBeginAndEnd(FILE_PATH, "abc", "hij");
            System.out.println("Tras insertar prefijo y sufijo: "
                    + RandomFileUtils.readAll(FILE_PATH));

            // 5. Sustituir vocales por '*'
            RandomFileUtils.replaceVowels(FILE_PATH);
            System.out.println("Tras reemplazar vocales: "
                    + RandomFileUtils.readAll(FILE_PATH));

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
