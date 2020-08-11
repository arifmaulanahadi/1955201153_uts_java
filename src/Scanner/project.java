/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanner;

import java.util.Scanner;

/**
 *
 * @author XtenZ
 */
public class project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  Scanner input=new Scanner(System.in);
  Scanner scan=new Scanner(System.in);
      
        String nLengkap, Fakultas, Prodi, Kampus;
        int NIM;
        double ipk;

        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("        Isi Pertanyaan Berikut        ");
        System.out.println("--------------------------------------");
        System.out.println();
        System.out.println("---Masukkan data anda dengan benar!---");
        System.out.println();
        System.out.print("Nama Lengkap   : ");
        nLengkap=input.nextLine();
        System.out.print("Asal Kampus    : ");
        Kampus=input.nextLine();
        System.out.print("Fakultas       : ");
        Fakultas=input.nextLine();
        System.out.print("Prodi          : ");
        Prodi=input.nextLine();
        System.out.print("NIM            : ");
        NIM=input.nextInt();
        System.out.print("Nilai IPK Anda : ");
        ipk=input.nextDouble();

        System.out.println();
        System.out.println("=============================================");
        System.out.println("  Terima kasih telah mengisinya dengan jujur ");
        System.out.println("=============================================");
        System.out.println("Nama Lengkap   : "+nLengkap);
        System.out.println("Nama Kampus    : "+Kampus);
        System.out.println("Fakultas       : "+Fakultas);
        System.out.println("Program Study  : "+Prodi);
        System.out.println("NIM            : "+NIM);
        System.out.println("IPK            : "+ipk);
        System.out.println("=============================================");
        


    
    }
    
}
