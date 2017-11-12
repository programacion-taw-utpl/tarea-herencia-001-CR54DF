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
    private int horas_trabajadas;
    private int costo_por_hora;

    // constructor 
    public Trabajador(String n, String a, int e, String c, int costs, int h, int costh) {
        super(n, a, e, c);

    }
// metodos estableceer y obtener

    public int obtener_Costo_seguro() {
        return costo_seguro;
    }

    public void establecer_Costo_seguro(int costs) {
        costs = costo_seguro;
    }

    public int obtener_Horas_trabajadas() {
        return horas_trabajadas;
    }

    public void establecer_Horas_trabajadas(int h) {
        h = horas_trabajadas;
    }

    public int obtener_Costo_por_hora() {
        return costo_por_hora;
    }

    public void establecer_Costo_por_hora(int costh) {
        costh = costo_por_hora;
    }

    public int obtener_calcular_sueldo() {
        int obtener_sueldo = 0;
        obtener_sueldo += ((horas_trabajadas * costo_por_hora) + costo_seguro);
        return obtener_sueldo;
    }

    @Override
    public String toString() {
        String c = "";
        return String.format("%s\n"
                + "\tseguro:%d\n"
                + "\tHoras Trabajadas:%d\n"
                + "Valor x Hora:%d\n"
                + "\tSueldo:%d\n", super.toString(),
                obtener_Costo_seguro(),
                obtener_Horas_trabajadas(), obtener_Costo_por_hora(),
                obtener_calcular_sueldo());
    }

}
