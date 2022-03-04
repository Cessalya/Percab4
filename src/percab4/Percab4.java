/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package percab4;

/**
 *
 * @author LENOVO
 */import java.util.Scanner;
public class Percab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // deklarasi variabel
        String nama;
        int nilai;
        
        Scanner input = new Scanner  (System.in);
        
        System.out.println("Nilai Siswa-Siswi");
        System.out.println("Nama Siswa = ");
        nama = input.nextLine ();
        System.out.println("Nilai = ");
        nilai = input.nextInt();
        
        if (nilai > 90){
            System.out.println("Grade A");
        }
        else if (nilai > 70){
            System.out.println("Grade B");
        }
        else if (nilai < 70){
            System.out.println("Grade F");    
    }
    }
    
}


    
    

