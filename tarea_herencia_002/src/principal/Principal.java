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
        Trabajador t1 = new Trabajador(, "Ana Luisa", "Velez Alcivar", 100, 40, 10, 30, 12903939);
        Trabajador t2 = new Trabajador(100, 50, 10, "Mario Anibal", "Vela Narvaez", 35, 212889);
        Trabajador t3 = new Trabajador(100, 60, 10, "José Luis", "Andrade", 31, 198734);
        Trabajador t4 = new Trabajador(100, 70, 10, "Luis Marcelo", "Bolaños", 38, 567890);
        Trabajador[] trabajadores = new Trabajador[4];
        trabajadores[0] = t1;
        trabajadores[1] = t2;
        trabajadores[2] = t3;
        trabajadores[3] = t4;
        Ejecutivo e1 = new Ejecutivo(1500, "Marco Anibal", "Gomez G", 32, 145678);
        Ejecutivo e2 = new Ejecutivo(1600, "Xavier J", "Arreaga M", 35, 65431);
        Ejecutivo e3 = new Ejecutivo(1700, "José Luis", "Caicedo", 34, 198713);
        Ejecutivo[] ejecutivos = new Ejecutivo[3];
        ejecutivos[0] = e1;
        ejecutivos[1] = e2;
        ejecutivos[2] = e3;

        Empresa_Publica em1 = new Empresa_Publica(10000, "Compra y Venta Ministerio de Educación", "MinEduc", "Quito", trabajadores, ejecutivos);

        System.out.println(em1);

    }

}
