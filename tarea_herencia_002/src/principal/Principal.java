/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import la_empresa.Empresa_Publica;
import paquete_personal.Ejecutivo;
import paquete_personal.Trabajador;

/**
 *
 * @author crsyhian
 */
public class Principal {

    public static void main(String[] args) {
        Trabajador t1 = new Trabajador("Ana Luisa", "Velez Alcivar", 100, 40, 10, 30, 12903939);
        Trabajador t2 = new Trabajador("Mario Anibal", "Vela Narvaez", 100, 50, 10, 35, 212889);
        Trabajador t3 = new Trabajador("José Luis", "Andrade", 100, 60, 10, 31, 198734);
        Trabajador t4 = new Trabajador("Luis Marcelo", "Bolaños", 100, 70, 10, 38, 567890);
        Trabajador[] trabajadores = new Trabajador[4];
        trabajadores[0] = t1;
        trabajadores[1] = t2;
        trabajadores[2] = t3;
        trabajadores[3] = t4;
        Ejecutivo e1 = new Ejecutivo("Marco Anibal", "Gomez G", 1500, 32, 145678);
        Ejecutivo e2 = new Ejecutivo("Xavier J", "Arreaga M", 1600, 35, 65431);
        Ejecutivo e3 = new Ejecutivo("José Luis", "Caicedo", 1700, 34, 198713);
        Ejecutivo[] ejecutivos = new Ejecutivo[3];
        ejecutivos[0] = e1;
        ejecutivos[1] = e2;
        ejecutivos[2] = e3;

        Empresa_Publica em1 = new Empresa_Publica("Compra y Venta Ministerio de Educación", "MinEduc", "Quito", trabajadores, ejecutivos, 10000);

        System.out.println(em1);

    }

}
