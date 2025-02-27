/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import controlador.ImpuestosControlador;
import modelo.ImpuestosModelo;
import vista.ImpuestosVista;

/**
 *
 * @author sierr
 */
public class Main { public static void main(String[] args) {
       
    
    ImpuestosVista vista = new ImpuestosVista();
        ImpuestosModelo modelo = new ImpuestosModelo();
        new ImpuestosControlador(vista, modelo);
        
        vista.setVisible(true);
    
    
    }
    
}
