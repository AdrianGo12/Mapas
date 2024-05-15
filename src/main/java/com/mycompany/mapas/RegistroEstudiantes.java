/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapas;
import java.util.HashMap;
/**
 *
 * @author AdrianGomezFabregat-
 */
public class RegistroEstudiantes {
    private HashMap<String, Estudiante> estudiantes;
    public RegistroEstudiantes() {
        estudiantes = new HashMap<>();
    }
    public boolean agregarEstudiante(String dni, String nombre, double nota) {
        Estudiante nuevo = new Estudiante(dni, nombre, nota);
        if (estudiantes.containsKey(dni)) {
            System.out.println("Este estudiante ya esiste.");
        } else {
            estudiantes.put(dni, nuevo);
            return true;
        }
        return false;
    }
    public boolean eliminarEstudiante(String dni) {
        if (estudiantes.containsKey(dni)) {
            estudiantes.remove(dni);
            return true;
        } else {
            System.out.println("Este estudiante no existe.");
        }
        return false;
    }
    public boolean actualizarCalificacion(String dni, double nuevaNota) {
        if (estudiantes.containsKey(dni)) {
            estudiantes.get(dni).setCalificacion(nuevaNota);
            return true;
        } else {
            System.out.println("Este estudiante no existe, no se puede actualizar nota.");
        }
        return false;
    }
    public void mostrarEstudiante() {
        for (Estudiante e : estudiantes.values()) {
            System.out.println(e);
        }
    }
}
