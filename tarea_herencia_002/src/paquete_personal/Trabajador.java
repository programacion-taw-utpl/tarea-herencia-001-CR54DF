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
public class Trabajador extends Persona {

    private int costo_seguro;
    public int horas_trabajadas;
    public int costo_por_hora;

    public Trabajador(String n, String a, int e, int c, double cosS, int h, double cosH) {
        super(n, a, e, c);
        establecer_Costo_seguro(cosS);
        establecer_Horas_trabajadas(h);
        establecer_Costo_por_hora(cosH);

    }

    public double obtener_Costo_seguro() {
        return costo_seguro;
    }

    public void establecer_Costo_seguro(double cosS) {
        cosS = costo_seguro;
    }

    public int obtener_Horas_trabajadas() {
        return horas_trabajadas;
    }

    public void establecer_Horas_trabajadas(int h) {
        h = horas_trabajadas;
    }

    public double obtener_Costo_por_hora() {
        return costo_por_hora;
    }

    public void establecer_Costo_por_hora(double cosH) {
        cosH = costo_por_hora;
    }

    public double obtener_sueldo() {
        double sueldo = (obtener_Horas_trabajadas() * obtener_Costo_por_hora()) + obtener_Costo_seguro();
        return sueldo;
    }

    @Override
    public String toString() {
        String c = String.format("%s"
                + "\n\t\tSeguro: $%.0f\n"
                + "\t\tHoras Trabajadas: %dh\n"
                + "\t\tValor por hora: $%.0f\n"
                + "\t\tSueldo: $%.0f",
                super.toString(),
                obtener_Costo_seguro(),
                obtener_Horas_trabajadas(),
                obtener_Costo_por_hora(),
                obtener_sueldo()
        );;
        return c;
    }

}
