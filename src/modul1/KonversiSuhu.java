/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class KonversiSuhu {
     public static void main(String[] args)
    {
        double r, f, k, c=78;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan suhu dalam dalam celcius 78 ");
        
        r = c*4/5;
        f = c*9/5+32;
        k = c+273;
        
        System.out.println("Hasil dalam Reamur : "+r);
        System.out.println("Hasil dalam fahrenheit: "+f);
        System.out.println("Hasil dalam kelvin: "+k);
    }
}
