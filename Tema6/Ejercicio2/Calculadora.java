package Ejercicio2;

import java.util.Scanner;


    public class Calculadora {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double a = 0, b = 0, resultado = 0;
            String opciones;

            System.out.println("Introduce números positivos, que no sean 0");
            System.out.println("Operaciones disponibles: +, -, *, /, raiz, valorabs, logaritmo, funcionexp, seno, coseno");
            System.out.println("tangente, arcosen, arcotang, redondeo, Positivo, acumulador, Fibonacci, Mayor, factorial, truncar");
            System.out.println("primos, compuestos, tabla, rango");
            System.out.println("SALIR -> pulse s\n");

            do {
                try {
                    System.out.print("¿Qué deseas calcular? ");
                    opciones = sc.nextLine();

                    if (opciones.equalsIgnoreCase("s")) {
                        System.out.println("fin");
                        break;
                    }

                    if ("+-*/Mayor".contains(opciones)) {
                        System.out.print("Introduce un número: ");
                        a = sc.nextDouble();
                        System.out.print("Introduce otro número: ");
                        b = sc.nextDouble();
                        sc.nextLine();
                    } else if ("rango".contains(opciones)) {
                        // manejo especial dentro del case
                    } else {
                        System.out.print("Introduce un número: ");
                        a = sc.nextDouble();
                        sc.nextLine();
                    }

                    switch (opciones) {
                        case "+" -> resultado = suma(a, b);
                        case "-" -> resultado = resta(a, b);
                        case "*" -> resultado = multiplica(a, b);
                        case "/" -> resultado = division(a, b);
                        case "raiz" -> resultado = Math.sqrt(a);
                        case "valorabs" -> resultado = Math.abs(a);
                        case "logaritmo" -> resultado = Math.log(a);
                        case "funcionexp" -> resultado = Math.exp(a);
                        case "seno" -> resultado = Math.sin(a);
                        case "coseno" -> resultado = Math.cos(a);
                        case "tangente" -> resultado = Math.tan(a);
                        case "arcosen" -> resultado = Math.asin(a);
                        case "arcotang" -> resultado = Math.atan(a);
                        case "redondeo" -> resultado = Math.round(a);
                        case "acumulador" -> resultado = acumulador(a);
                        case "primos" -> System.out.println(esPrimo((int) a));
                        case "compuestos" -> System.out.println("Compuestos menores que " + a + ": " + compuestoMenor(a));
                        case "Fibonacci" -> hastaFibonacci((int) a);
                        case "Positivo" -> System.out.println(esPositivo(a));
                        case "Mayor" -> {
                            System.out.println("Es mayor: " + esMayor(a, b));
                            resultado = 0;
                        }
                        case "factorial" -> System.out.println(a + "!: " + factorial(a));
                        case "truncar" -> resultado = truncar(a);
                        case "tabla" -> {
                            for (int i = 1; i <= a; i++) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print(j);
                                }
                                System.out.println();
                            }
                        }
                        case "rango" -> {
                            double x = Math.random() * 100 + 1;
                            double y = Math.random() * 100 + 1;
                            int abajo = (int) Math.min(x, y);
                            int arriba = (int) Math.max(x, y);
                            System.out.println("[" + abajo + ", " + arriba + "]");
                        }
                        default -> resultado = 0;
                    }

                    if (resultado != 0) {
                        System.out.println("Resultado: " + resultado);
                    }

                } catch (Exception ex) {
                    System.out.println("Se ha producido un error: " + ex.getMessage());
                    ex.printStackTrace();
                    sc.nextLine(); // limpiar buffer
                    continue;
                }
            } while (true);
            sc.close();
        }

        public static double suma(double a, double b) throws Exception {
            return a + b;
        }

        public static double resta(double a, double b) throws Exception {
            return a - b;
        }

        public static double multiplica(double a, double b) throws Exception {
            return a * b;
        }

        public static double division(double a, double b) throws ArithmeticException {
            if (b == 0) throw new ArithmeticException("División por cero no permitida.");
            return a / b;
        }

        public static double acumulador(double a) throws Exception {
            double suma = 0;
            for (double i = 0; i <= 10; i += 0.87) {
                suma += Math.E * a;
            }
            return suma;
        }

        public static void hastaFibonacci(int a) throws Exception {
            int uno = 0, dos = 1, siguiente;
            while (uno < a) {
                System.out.print(uno + " ");
                siguiente = uno + dos;
                uno = dos;
                dos = siguiente;
            }
            System.out.println();
        }

        public static double esMayor(double a, double b) throws Exception {
            return a > b ? a : b;
        }

        public static boolean esPositivo(double a) throws Exception {
            return a >= 0;
        }

        public static double factorial(double a) throws Exception {
            if (a < 0) throw new IllegalArgumentException("No se puede calcular factorial de un número negativo.");
            double resultado = 1;
            for (int i = 2; i <= (int) a; i++) {
                resultado *= i;
            }
            return resultado;
        }

        public static double truncar(double a) throws Exception {
            return Math.floor(a);
        }

        public static double compuestoMenor(double a) throws Exception {
            int contador = 0;
            for (int i = 4; i <= a; i++) {
                if (!esPrimo(i)) contador++;
            }
            return contador;
        }

        public static boolean esPrimo(int a) throws Exception {
            if (a < 2) return false;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) return false;
            }
            return true;
        }
    }
