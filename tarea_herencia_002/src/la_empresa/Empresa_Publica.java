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
public class Empresa_Publica extends Empresa {

    private int ventas_mensual_fijo;

    public Empresa_Publica(String n, String s, String c, Trabajador[] tr, Ejecutivo[] ej, int vtm) {
        super(n, s, c, tr, ej);
        establecer_Ventas_mensual_fijo(vtm);
    }

    public int obtener_Ventas_mensual_fijo() {
        return ventas_mensual_fijo;
    }

    public void establecer_Ventas_mensual_fijo(int ventasm) {
        ventas_mensual_fijo = ventasm;
    }

    private double obtener_monto_total_sueldos() {
        double st = 0;
        double se = 0;

        Trabajador[] arregloT = obtener_Trabajadores();
        Ejecutivo[] arregloE = obtener_Ejecutivos();
        for (int i = 0; i < arregloT.length; i++) {
            st += arregloT[i].obtener_sueldo();
        }
        for (int j = 0; j < arregloE.length; j++) {
            se += arregloE[j].obtener_Sueldo_mensual();
        }

        return st + se;
    }

    private String obtener_estado_empresa() {
        double estado = 0;
        String estado2 = "";
        estado += obtener_Ventas_mensual_fijo() - obtener_monto_total_sueldos();
        if (estado == 0) {
            estado2 += String.format("La empresa mantiene el ESTADO en: %.0f", estado);
        } else if (estado > 0) {
            estado2 += String.format("La empresa tiene una GANANCIA de: %.0f", estado);
        } else if (estado < 0) {
            estado2 += String.format("La empresa tiene una PERDIDA de: %.0f", estado);
        }
        return estado2;
    }

    public String Trabajadores() {
        String cadenaT = "";
        Trabajador[] aT = obtener_Trabajadores();
        for (int i = 0; i < aT.length; i++) {
            cadenaT += "\n\n\t" + (i + 1) + ")"
                    + aT[i].toString();

        }

        return cadenaT;
    }

    public String Ejecutivos() {
        String cadenaE = "";
        Ejecutivo[] aE = obtener_Ejecutivos();
        for (int j = 0; j < aE.length; j++) {
            cadenaE += "\n\n\t" + (j + 1) + ")"
                    + aE[j].toString();

        }

        return cadenaE;
    }

    @Override
    public String toString() {
        String c = String.format("%sVentas: $%d\n"
                + "Lista Trabajadores: %s\n\n"
                + "Lista Ejecutivos: %s\n\n"
                + "Sueldos a pagar por la empresa es: $%.0f\n"
                + "%s\n",
                super.toString(),
                obtener_Ventas_mensual_fijo(),
                Trabajadores(),
                Ejecutivos(),
                obtener_monto_total_sueldos(),
                obtener_estado_empresa());

        return c;
    }

}
