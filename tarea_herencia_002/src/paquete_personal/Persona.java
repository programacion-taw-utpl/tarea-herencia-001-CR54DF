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

    private String nombres;
    private String apellidos;
    private int edad;
    private int cedula;

    public Persona(String n, String a, int e, int c) {

        establecer_Nombres(n);
        establecer_Apellidos(a);
        establecer_Edad(e);
        establecer_Cedula(c);

    }

    public String obtener_Nombres() {
        return nombres;
    }

    public void establecer_Nombres(String n) {
        n = nombres;
    }

    public String obtener_Apellidos() {
        return apellidos;
    }

    public void establecer_Apellidos(String a) {
        a = apellidos;
    }

    public int obtener_Edad() {
        return edad;
    }

    public void establecer_Edad(int e) {
        e = edad;
    }

    public int obtener_Cedula() {
        return cedula;
    }

    public void establecer_Cedula(int c) {
        c = cedula;
    }

    @Override
    public String toString() {
        String c = String.format("%s %s\n"
                + "%d años de edad\n"
                + "CI:%s\n",obtener_Nombres(),
                obtener_Apellidos(),
                obtener_Edad(),
                obtener_Cedula());
        return c;

    }

}
