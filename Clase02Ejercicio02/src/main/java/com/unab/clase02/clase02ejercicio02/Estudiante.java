/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.clase02.clase02ejercicio02;

/**
 *
 * @author iris recinos
 */
public class Estudiante extends Profesor {

    private final int Matricula;
    private final String Carrera;

    Estudiante(String Nombre, String Direccion, String FechaNac, String Genero, int edad, int Matricula, String Carrera) {

        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.FechaNac = FechaNac;
        this.Genero = Genero;
        this.Edad = edad;
        this.Matricula = Matricula;
        this.Carrera = Carrera;

    }

    @Override
    public String toString() {
        return "Estudiante{" + "Nombre=" + Nombre + ", Direccion=" + Direccion + ", FechaNac=" + FechaNac + ", Genero=" + Genero + ", Edad=" + Edad + "Matricula=" + Matricula + ", Carrera=" + Carrera + '}';
    }

}
