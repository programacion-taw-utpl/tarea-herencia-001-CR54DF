/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la_empresa;

import paquete_personal.Ejecutivo;
import paquete_personal.Trabajador;

/**
 *
 * @author crsyhian
 */
public class Empresa {
     private String nombre;
    private String siglas;
    private String ciudad;
    Trabajador[] trabajadores;
    Ejecutivo[] ejecutivos;

    public Empresa(String n, String s, String c, Trabajador[] tr, Ejecutivo[] ej) {
        establecer_Nombre(n);
        establecer_Siglas(s);
        establecer_Ciudad(c);
        establecer_Trabajadores(tr);
        establecer_Ejecutivos(ej);
    }

    public String obtener_Nombre() {
        return nombre;
    }

    public void establecer_Nombre(String n) {
        nombre = n;
    }

    public String obtener_Siglas() {
        return siglas;
    }

    public void establecer_Siglas(String s) {
        siglas = s;
    }

    public String obtener_Ciudad() {
        return ciudad;
    }

    public void establecer_Ciudad(String c) {
        ciudad = c;
    }

    public Trabajador[] obtener_Trabajadores() {
        return trabajadores;
    }

    public void establecer_Trabajadores(Trabajador[] tr) {
        trabajadores = tr;
    }

    public Ejecutivo[] obtener_Ejecutivos() {
        return ejecutivos;
    }

    public void establecer_Ejecutivos(Ejecutivo[] ej) {
        ejecutivos = ej;
    }

    @Override
    public String toString() {
        String c= String.format("Empresa: %s\n"
                + "Siglas: %s\n"
                + "Ciudad: %s\n",
                obtener_Nombre(),
                obtener_Siglas(),
                obtener_Ciudad()
        );
        return c;
    }

}
    

