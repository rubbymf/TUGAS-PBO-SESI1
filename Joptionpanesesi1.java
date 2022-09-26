/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author rubby
 */
public class Joptionpane {
    public static void main(String[] args) {
     String nama ="";
        nama = JOptionPane.showInputDialog("Anda Sedang Belajar Apa ?");
        String pesan = ( "belajar " + nama + " sangat mudah");
        JOptionPane.showMessageDialog(null, pesan);        
    }
}
