package Ejercicios;

import java.util.Scanner;

public class ejercicio1 {
	
    public static void main(String[] args) {
	
	int[] enteros;
	enteros = new int [5];
	enteros[0] = 19;
	enteros[0] = 11;
	enteros[0] = 24;
	enteros[0] = 30;
	enteros[0] = 40;
	
	//Referencias
	System.out.println(enteros);
	
	int a[], b[] = null, c[], d[], e[];
	a = new int[5];
	System.out.println(a);
	System.out.println(a[0]);
	a[1]= 11;
	System.out.println(b);
	b = a;
	System.out.println(b);
	System.out.println("Fin");
	}

}
	