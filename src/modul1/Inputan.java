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
public class Inputan {
    public static void main (String[] args)
    {
        Scanner masukan = new Scanner(System.in);
        int a, b;
        System.out.println("Masukkan nilai a : ");
        a = masukan.nextInt();
        System.out.println("Masukkan nilai b : ");
        b = masukan.nextInt();
        System.out.println();
        System.out.println("Nilai Variabel yang ada pada progran : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
    }
}
