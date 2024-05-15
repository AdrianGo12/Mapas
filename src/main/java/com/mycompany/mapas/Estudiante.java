/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapas;

/**
 *
 * @author AdrianGomezFabregat-
 */
public class Estudiante {
    private String nombre;
    private String dni;
    private double calificacion;
    public Estudiante(String d, String n, double c) {
        this.dni = d;
        this.nombre = n;
        this.calificacion = c;
    }
    public String getDni() {
        return this.dni;
    }
    public String getNombre() {
        return this.nombre;
    }
    public double getCalificacion() {
        return this.calificacion;
    }
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
 
    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", calificacion=" + calificacion + '}';
    }
}