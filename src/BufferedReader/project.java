/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author XtenZ
 */
public class project {
   public static void main(String[] args) throws IOException {
       
         String nama, Kampus, Fakultas, Prodi;
         int NIM;
         double IPK;

        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Masukan Nama Lengkap Anda: ");
        nama = br.readLine();
        System.out.print("Asal Kampus: ");
        Kampus = br.readLine();
        System.out.print("Fakultas: ");
        Fakultas = br.readLine();
        System.out.print("Program Study: ");
        Prodi = br.readLine();
        System.out.print("NIM: ");
        NIM = br.read();
        System.out.print("IPK: ");
        IPK = br.read();


        System.out.println("Nama kamu adalah " + nama);
        System.out.println("Nama kamu adalah " + Kampus);
        System.out.println("Nama kamu adalah " + Fakultas);
        System.out.println("Nama kamu adalah " + Prodi);
        System.out.println("Nama kamu adalah " + NIM);

    
    }
    
}
