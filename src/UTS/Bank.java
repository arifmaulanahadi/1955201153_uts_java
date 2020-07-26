/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author XtenZ
 */
public class Bank {
      private String getTanggal() {  
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }  
     
    private String getWaktu() {  
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");  
        Date date = new Date();  
        return dateFormat.format(date);  
    } 

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       Bank tgl = new Bank();     
       int Saldo = 999999999;
       int saldo = 0;
       int menu;
       int pilih;
       
        for (String i = "Y"; i.equals("Y")||i.equals("y"); )
        {
        
        System.out.println("======================================");
        System.out.println("||           SELAMAT DATANNG        ||");
        System.out.println("||           DIBANK MONOPOLY        ||");
        System.out.println("======================================");
        System.out.println("|           PILIH SALAH SATU         |");
        System.out.println("|         DARI MENU BERIKUT INI      |");
        System.out.println("|                 |                  |");
        System.out.println("|1. Tarik Tunai   |  2. Setor Tunai  |");
        System.out.println("|                 |                  |");
        System.out.println("======================================");      

        menu = scan.nextInt();
        switch (menu){
            case 1:
        System.out.print("Masukan nominal : ");
        pilih = scan.nextInt();
        saldo = Saldo - pilih;
        
            System.out.println("=====================================");
            System.out.println("||          Bank Monopoly           ||");
            System.out.println("======================================");
            System.out.println(" Tarik Tunai : " +pilih                );
            System.out.println(" Saldo       : " +saldo                );
            System.out.println("======================================");
            System.out.println("||            Terima Kasih          ||");
            System.out.println("||                                  ||");
            System.out.println("||         " +tgl.getTanggal() + " " +tgl.getWaktu()+"      ||"); 
            System.out.println("======================================");
                break;
                
            case 2:
                System.out.print("Masukan nominal : ");
        pilih = scan.nextInt();
        saldo = Saldo + pilih;
        
            System.out.println("=====================================");
            System.out.println("||          Bank Monopoly           ||");
            System.out.println("======================================");
            System.out.println(" Setor Tunai : " +pilih                );
            System.out.println(" Saldo       : " +saldo                );
            System.out.println("======================================");
            System.out.println("||            Terima Kasih          ||");
            System.out.println("||                                  ||");
            System.out.println("||         " +tgl.getTanggal() + " " +tgl.getWaktu()+"      ||"); 
            System.out.println("======================================");
            break;
            default:
            System.out.println("Menu yang anda pilih tidak ada");        
            break;
            
            }
            
            System.out.print("Transaksi Lagi? [Y/T] : ");
            i = scan.next();
            
                
    }
  }  
}
