/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_laempresa;

import paquete_personal.Trabajador;

/**
 *
 * @author crsyhian
 */
public class Empresa {

    private String nombre;
    private String siglas;
    private String ciudad;
    protected Trabajador trabajadores[];

    // constructor
    public Empresa(String n, String s, String c, Trabajador trabajadores[]) {
        establecer_Nombre(n);
        establecer_Siglas(s);
        establecer_Ciudad(c);
        establecer_Trabajadores(trabajadores);

    }
    // metodos establecer y obtener

    public String obtener_Nombre() {
        return nombre;
    }

    public void establecer_Nombre(String n) {
        n = nombre;
    }

    public String obtener_Siglas() {
        return siglas;
    }

    public void establecer_Siglas(String s) {
        s = siglas;
    }

    public String obtener_Ciudad() {
        return ciudad;
    }

    public void establecer_Ciudad(String c) {
        c = ciudad;
    }

    public Trabajador[] obtener_Trabajadores() {
        return trabajadores;
    }

    public void establecer_Trabajadores(Trabajador[] t) {
        t = trabajadores;
    }

    public String toString() {
        String c = String.format("Empresa:%s\n"
                + "Siglas:%s\n"
                + "Ciudad:%s\n",
                obtener_Nombre(),
                obtener_Siglas(),
                obtener_Ciudad());
        return c;
    }

}
