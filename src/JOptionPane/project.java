/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOptionPane;

import javax.swing.JOptionPane;

/**
 *
 * @author XtenZ
 */
public class project {
    
    public static void main(String[] args) {
        
        
        
        
        String Nama = JOptionPane.showInputDialog("Masukan Nama Lengkap Anda");
        String Kampus = JOptionPane.showInputDialog("Asal Kampus");
        String Fakultas = JOptionPane.showInputDialog("Fakultas");
        String Prodi = JOptionPane.showInputDialog("Program Study");
        String NIM = JOptionPane.showInputDialog("NIM");
        String IPK = JOptionPane.showInputDialog("Nilai IPK Anda");
        
        JOptionPane.showMessageDialog(null, "Nama Kamu Adalah : " + Nama);
        JOptionPane.showMessageDialog(null, "Asal Kampus : " + Kampus);
        JOptionPane.showMessageDialog(null, "Fakultas : " + Fakultas);
        JOptionPane.showMessageDialog(null, "Program Study : " + Prodi);
        JOptionPane.showMessageDialog(null, "NIM : " + NIM);
        JOptionPane.showMessageDialog(null, "IPK : " + IPK);
        
        

    
    }
    
}
