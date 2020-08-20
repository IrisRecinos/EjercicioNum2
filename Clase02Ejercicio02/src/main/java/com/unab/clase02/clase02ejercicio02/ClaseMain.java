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
public class ClaseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Profesor Profe = new  Profesor ("Willian", "El paraiso", "14/11/94","M", 25,"ING","Programador");
        System.out.println(Profe.toString());
        
    Estudiante yo= new Estudiante ("iris ","San Luis","02/08/2002", "F",18, 200,"IngSistemasCompu");
        System.out.println(yo.toString());
    }
    
}
