/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import javax.swing.JOptionPane;

/**
 *
 * @author manolete919
 */
public class Vehiculo {
    
    private int noAsiento;
    private String color;

    public Vehiculo(int noAsiento, String color) {
        this.noAsiento = noAsiento;
        this.color = color;
    }

    public Vehiculo(int noAsiento) {
        this.noAsiento = noAsiento;
    }

    public Vehiculo(String color) {
        this.color = color;
    }

    public Vehiculo() {
        
        
    }
    

    public int getNoAsiento() {
        return noAsiento;
    }

    public void setNoAsiento(int noAsiento) {
        this.noAsiento = noAsiento;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
