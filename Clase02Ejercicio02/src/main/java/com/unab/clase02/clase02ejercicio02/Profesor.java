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
public class Profesor extends Persona {

    private String Titulo;
    private String Dedicacion;

    public Profesor(String Nombre, String Direccion, String FechaNac, String Genero, int edad, String Titulo, String Dedicacion) {
     
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.FechaNac = FechaNac;
        this.Genero = Genero;
        this.Edad = edad;
        this.Titulo = Titulo;
        this.Dedicacion = Dedicacion;
        
    }

    

    @Override
    public String toString() {
       return "Profesor{" + "Nombre=" + Nombre + ", Direccion=" + Direccion + ", FechaNac=" + FechaNac + ", Genero=" + Genero + ", Edad=" + Edad  + "Titulo=" + Titulo + ", Dedicacion=" + Dedicacion + '}';
    }

}
