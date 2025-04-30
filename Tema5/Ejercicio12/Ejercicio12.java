package Ejercicio12;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio12 {
    public static void main(String[] args) {
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("ent", "Número entero");
        diccionario.put("dec", "Número decimal");
        diccionario.put("cad", "Cadena");
        diccionario.put("log", "Lógico");
        diccionario.put("bucle", "Estructura repetición");

        // Añadir valor duplicado con distinta clave
        diccionario.put("entero", "Número entero");

        // Añadir valor nuevo con clave duplicada
        if (diccionario.containsKey("cad")) {
            System.out.println("La clave 'cad' ya existe. Se actualizará el valor.");
            diccionario.put("cad", "repetido");
        }

        // Obtener el valor de una clave concreta
        System.out.println("Valor de 'log': " + diccionario.get("log"));


        // Intentar añadir un valor null
        diccionario.put("null", null);

    }
}
