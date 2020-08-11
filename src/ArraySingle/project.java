/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraySingle;

import javax.swing.JOptionPane;

/**
 *
 * @author XtenZ
 */
public class project {
    public static void main(String[] args) {
        
    
    int angka[] = new int[3];
        angka[0] = 1;
        angka[1] = 5;
        angka[2] = 7;
        
        String nama[] = {"Arif", "Maulana", "Hadi"};
        
        String namaTeman[] = new String[3];
        for(int i=0; i<namaTeman.length; i++){
            namaTeman[i] = JOptionPane.showInputDialog(null, "inputkan nama Mahasiswa ke "+i);
            System.out.println(namaTeman[i]);
        }
        
       
        
        
        for(int i=0; i<angka.length; i++){
            System.out.println(angka[i]);
        }
        
        for(int i=0; i<nama.length; i++){
            System.out.println(nama[i]);
        }
        String cariNama = JOptionPane.showInputDialog(null, "Cari Nama Mahasiswa ");
        
        for(int i=0; i<namaTeman.length; i++){
            if(namaTeman[i].equals(cariNama)){
                JOptionPane.showMessageDialog(null, "Nama Yang Anda Cari Adalah "+cariNama+" ada pada index ke "+i);
            }
        }
        
    }
}
