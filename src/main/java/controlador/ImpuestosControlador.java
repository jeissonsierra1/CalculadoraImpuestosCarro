/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import modelo.ImpuestosModelo;
import vista.ImpuestosVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author sierr
 */
public class ImpuestosControlador {
    
    private ImpuestosVista vista;
    private ImpuestosModelo modelo;

    public ImpuestosControlador(ImpuestosVista vista, ImpuestosModelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        
        // Botón
        this.vista.getCalcular().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularImpuesto();
            }
        });
    }

    private void  calcularImpuesto() {
        
       
        String tipoUso = (String) vista.getTipoUso().getSelectedItem(); 
        int fabricacion = Integer.parseInt(vista.getFabricacion().getText());
        double cilindraje = Double.parseDouble(vista.getCilindraje().getText());
        double avaluo = Double.parseDouble(vista.getAvaluo().getText());
        
        
           // Llamamos al método 
        double impuesto = modelo.calcularImpuesto(tipoUso, fabricacion, cilindraje, avaluo);    
        
           // Mostrar el resultado en la vista
          vista.getResultado().setText(String.format("%.2f", impuesto)); 
    }
    
}
