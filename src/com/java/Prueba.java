/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author manolete919
 */
public class Prueba extends JFrame {

 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        Vehiculo mazda = new Vehiculo("Verde"); //instancia de objeto
        //mazda.setColor("Rojo");
   
        Prueba p = new Prueba();
        p.mostrarMensaje("El color es:" + mazda.getColor());
        
        
    }
    
    public void mostrarMensaje(String mensaje){
        
        JOptionPane.showMessageDialog(this, mensaje);
        
    }
    

}
