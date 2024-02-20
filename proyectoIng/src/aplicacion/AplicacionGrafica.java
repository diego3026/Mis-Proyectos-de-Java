/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion;

import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class AplicacionGrafica {
    public static void main(String[] args) {
        int admin = JOptionPane.showConfirmDialog(null, "Admin?","Acceso Admin", JOptionPane.OK_OPTION);
        System.out.println(admin);
    }
}
