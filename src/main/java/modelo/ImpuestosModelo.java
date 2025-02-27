/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author sierr
 */
public class ImpuestosModelo {
    
    
     public double calcularImpuesto(String tipoUso, int fabricacion, double cilindraje, double avaluo) {
        double impuestoBase = 0;

       // Cálculo según el avalúo con valores vigentes
        if (avaluo <= 54057000) { 
            impuestoBase = avaluo * 0.015; // 1.5%
        } else if (avaluo > 54057000 && avaluo <= 121625000) {
            impuestoBase = avaluo * 0.025; // 2.5%
        } else {
            impuestoBase = avaluo * 0.035; // 3.5%
        }

        // Cálculo para el tipo de uso, Particular-Público
        
        if (tipoUso.equals("Particular")) {
            impuestoBase *= 1;  // Sin cambios
        } else if (tipoUso.equals("Público")) {
            impuestoBase *= 0.8; // 20% descuento para transporte público
        }

        // Descuento por antigüedad
        
        int anioActual = java.time.Year.now().getValue();
        int antigüedad = anioActual - fabricacion;

        if (antigüedad > 10) {
            impuestoBase *= 0.8;  // 20% descuento
        }

        // Ajuste por cilindraje
        if (cilindraje > 2000) {
            impuestoBase += 500;  // Incremento si el cilindraje es mayor a 2000
        }

        return impuestoBase;
    }

}
