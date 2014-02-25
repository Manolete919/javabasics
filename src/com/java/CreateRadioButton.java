/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author manolete919
 */
public class CreateRadioButton extends JFrame implements ActionListener {

    ButtonGroup buttonGroup = new ButtonGroup();

    public CreateRadioButton() {

        JFrame frame = new JFrame("Creating a JRadioButton Component");

        JRadioButton verde, rojo, negro;


        //definir, panel, donde voy a poner mis componentes
        JPanel panel = new JPanel();

        verde = new JRadioButton("Verde");
        verde.addActionListener(this);

        rojo = new JRadioButton("Rojo");
        rojo.addActionListener(this);
        
        rojo.setSelected(true);
        negro = new JRadioButton("Negro");
        negro.addActionListener(this);
        
        buttonGroup.add(verde);

        buttonGroup.add(rojo);
        buttonGroup.add(negro);

        //agregar componentes
        panel.add(verde);
        panel.add(rojo);
        panel.add(negro);

        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

    }

    public static void main(String[] args) {


        new CreateRadioButton();




    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
        
        JOptionPane.showMessageDialog(this,  "El color seleccionado es: "+ e.getActionCommand().toString());

    }
}
