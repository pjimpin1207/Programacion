package Ejercicio7.Maquinaria;

import tema4.Ejercicio7.Personal.Mecanicos;

public class Locomotoras {

    private String matricula;
    private int potencia;
    private int antiguedad;
    private Mecanicos mecanicoAsig;

    public Locomotoras(String matricula, int potencia, int antiguedad, Mecanicos mecanicoAsig) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.antiguedad = antiguedad;
        this.mecanicoAsig = mecanicoAsig;
    }
}