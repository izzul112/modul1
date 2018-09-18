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
public class BiodataDiri {
     public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        String siswa, TL, alamat, motto ;
        int NIS,TTL;
        
        System.out.println("Data Siswa");
        System.out.print("Nama Siswa : ");
        siswa = scan.next();
        System.out.print("Nomer NIS : ");
        NIS = scan.nextInt();
        System.out.print("Tempat Lahir : ");
        TL = scan.next();
        System.out.print("Tanggal Lahir : ");
        TTL = scan.nextInt();
        System.out.print("Alamat di Malang : ");
        alamat = scan.next();
        System.out.print("Motto Hidup : ");
        motto = scan.next();
        System.out.println();
        
        System.out.println("Nama Siswa : "+siswa);
        System.out.println("Nome NIS : "+NIS);
        System.out.println("Tempat lahir : "+TL);
        System.out.println("Tanggal lahir : "+TTL);
        System.out.println("Alamat di Malang : "+alamat);
        System.out.println("Motto Hidup : "+motto);
        
        
        
        
        
        
        
        
    }
}
