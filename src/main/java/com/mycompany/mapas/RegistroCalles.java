/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mapas;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author AdrianGomezFabregat-
 */
public class RegistroCalles {
    private HashMap<Integer, List<String>> mapaCalles;
    public RegistroCalles() {
        mapaCalles = new HashMap<>();
    }
    public void agregarCalle(Integer cod, String calle) {
        if (mapaCalles.containsKey(cod)) {
            mapaCalles.get(cod).add(calle);
        } else {
            List<String> listaCalles = new ArrayList<>();
            listaCalles.add(calle);
            mapaCalles.put(cod, listaCalles);
        }
    }
    public boolean eliminarCalle(Integer cod, String calle) {
        if (mapaCalles.containsKey(cod)) {
            List<String> calles = mapaCalles.get(cod);
            Iterator<String> it = calles.iterator();
            while (it.hasNext()) {
                String siguiente = it.next();
                if (siguiente.equals(calle)) {
                    it.remove();
                    return true;
                }
            }
        }
        return false;
    }
}
