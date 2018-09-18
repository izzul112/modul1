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
public class LuasPermukaanBola {
  public static void main(String[] args)
  {
      Scanner scan = new Scanner(System.in);
      double lp, r ;
      System.out.println("Masukkan Jari-jari : ");
       r = scan.nextDouble();
      lp =  4*3.14*r*r;
      System.out.println("Luas Permukaan Bola : "+lp);
      
  }
}
