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
public class Ejecutivo extends Persona {

    private double sueldo_mensual;

    public Ejecutivo(String n, String a, int e, String c, double sm) {
        super(n, a, e, c);

    }

    public double obtener_Sueldo_mensual() {
        return sueldo_mensual;
    }

    public void establecer_Sueldo_mensual(double sm) {
        sm = sueldo_mensual;
    }

    public String toString() {
        String c = String.format("%s\n"
                + "sueldo:\t\t%.0f\n",
                super.toString(),
                obtener_Sueldo_mensual());
        return c;

    }

}
