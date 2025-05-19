package Ejercicio9;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class RandomFileUtils {

    // Crea un fichero nuevo o borra el anterior si ya exístia
    public static void recreateFile(String path) throws IOException {
        File f = new File(path);
        if (f.exists()) Files.delete(f.toPath());
        if (!f.createNewFile()) throw new IOException("No se pudo crear el fichero " + path);
    }

    /** Escribe una cadena completa en la posición actual del RandomAccessFile. */
    public static void writeString(RandomAccessFile raf, String s) throws IOException {
        raf.write(s.getBytes());
    }

    /** Lee todo el fichero y lo devuelve como String. */
    public static String readAll(String path) throws IOException {
        return Files.readString(new File(path).toPath());
    }

    /**
     * Inserta una cadena al principio y otra al final usando un temporal.
     * Es más sencillo (y seguro) que desplazar bytes dentro del mismo fichero.
     */
    public static void insertAtBeginAndEnd(String path, String prefix, String suffix) throws IOException {
        File original = new File(path);
        File temp     = new File(path + ".tmp");

        try (RandomAccessFile in = new RandomAccessFile(original, "r");
             RandomAccessFile out = new RandomAccessFile(temp,     "rw")) {

            out.write(prefix.getBytes());
            // copiar todo el contenido original
            byte[] buffer = new byte[8192];
            int n;
            while ((n = in.read(buffer)) != -1) out.write(buffer, 0, n);
            out.write(suffix.getBytes());
        }

        // Sustituir el original por el temporal
        Files.move(temp.toPath(), original.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    /** Reemplaza todas las vocales (mayúsculas/minúsculas) por '*'. */
    public static void replaceVowels(String path) throws IOException {
        String content = readAll(path).replaceAll("(?i)[aeiouáéíóúü]", "*");
        Files.writeString(new File(path).toPath(), content);
    }
}
