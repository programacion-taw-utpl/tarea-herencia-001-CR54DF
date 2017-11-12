/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_personal;

/**
 *
 * @author crsyhian
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String cedula;

    // contructor
    public Persona(String n, String a, int e, String c) {
        establecer_tNombre(n);
        establecer_Apellido(a);
        establecer_Edad(e);
        establecer_Cedula(c);

    }

    // metodos de  establecer y obtener
    public String obtener_Nombre() {
        return nombre;
    }

    public void establecer_tNombre(String n) {
        n = nombre;
    }

    public String obtener_Apellido() {
        return apellido;
    }

    public void establecer_Apellido(String a) {
        a = apellido;
    }

    public int obtener_Edad() {
        return edad;
    }

    public void establecer_Edad(int e) {
        e = edad;
    }

    public String obtener_Cedula() {
        return cedula;
    }

    public void establecer_Cedula(String c) {
        c = cedula;
    }

    @Override
    public String toString() {
        String c = String.format("\t%s %s\n"
                + "\t%d años de edad\n"
                + "\tCI:%s", obtener_Nombre(),
                obtener_Apellido(),
                obtener_Edad(),
                obtener_Cedula());
        return c;
    }

}
