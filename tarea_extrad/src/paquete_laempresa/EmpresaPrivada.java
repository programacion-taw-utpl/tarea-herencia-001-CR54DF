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
public class EmpresaPrivada extends Empresa {

    private int ventas_mensual_fijo;
    private int numero_sucursales;

    public EmpresaPrivada(String n, String s, String c, int v, int ns, Trabajador trabajadores[]) {
        super(n, s, c, trabajadores);
        establecer_Ventas_mensual_fijo(v);
        establecer_Numero_sucursales(ns);
        establecer_Trabajadores(trabajadores);

    }

    public int obtener_Ventas_mensual_fijo() {
        return ventas_mensual_fijo;
    }

    public void establecer_Ventas_mensual_fijo(int v) {
        v = ventas_mensual_fijo;
    }

    public int obtener_Numero_sucursales() {
        return numero_sucursales;
    }

    public void establecer_Numero_sucursales(int ns) {
        ns = numero_sucursales;
    }

    public Trabajador[] obtener_Arreglo() {
        return trabajadores;

    }

    @Override
    public String toString() {
        String c = "";
        for (int i = 0; i < trabajadores.length; i++) {
            c += trabajadores[i].toString() + "\n";
        }
        return String.format("%s\n"
                + "Ventas:%d\n"
                + "Sucursales:%d\n"
                + "Lista de Trabajadore\n%s",
                super.toString(),
                obtener_Ventas_mensual_fijo(),
                obtener_Numero_sucursales(), c);
    }

}
