/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4.ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        //Crear objetos
        ContadorObjetos obj1 = new ContadorObjetos();
        ContadorObjetos obj2 = new ContadorObjetos();
        ContadorObjetos obj3 = new ContadorObjetos();

         // Mostrar objetos
        ContadorObjetos.mostrarTotalObjetos();

        // Crear más objetos
        ContadorObjetos obj4 = new ContadorObjetos();
        ContadorObjetos obj5 = new ContadorObjetos();

        // Mostrar otra vez el número total de objetos creados
        ContadorObjetos.mostrarTotalObjetos(); 
    }
}

