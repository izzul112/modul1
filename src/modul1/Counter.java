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
public class Counter {
    public static void main(String[] args)
    {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukkan batas bilangan : ");
        int batas = masukan.nextInt();
        int hasil = 0;
        for (int i=1; i<=batas; i++)
            hasil +=1;
        System.out.println("Total Jumlahnya adalah : "+hasil);
    }
}
