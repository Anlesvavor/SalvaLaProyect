/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;

/**
 *
 * @author LeJesusjar
 */
public class Juego implements Serializable{

    public Juego() {
    }

    public Juego(String nombre, String clasificacion, String notas, String ruta) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.notas = notas;
        this.ruta = ruta;
    }

    String nombre;
    String clasificacion;
    String notas;
    String ruta;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public enum Clasificacion {
        Ce, E, E10, T, M
    }

}
