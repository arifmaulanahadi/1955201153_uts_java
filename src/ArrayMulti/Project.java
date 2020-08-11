/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayMulti;

/**
 *
 * @author XtenZ
 */
public class Project {
    public static void main(String[] args) {
        
            int no[][] = {{1,5,7},
                                {4,1,7}};
            for(int i=0; i<no.length; i++){
                for(int j=0; j<no[0].length; j++){
                    System.out.println(no[i][j] + " ");
                }
                System.out.println("======================================== ");
            }
            
        
        String nama [][] = {{"1", "Arif"}, {"2", "Hadi"}, {"3", "Maulana"}};
        
            for (int x=0; x<nama.length;x++){
            System.out.println("Absen : "+nama [x] [0]+". "+nama [x] [1]);
   
              System.out.println("");
              System.out.println("===========================");
            
    }
    }
    
}
