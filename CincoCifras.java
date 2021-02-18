
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis
 */
public class CincoCifras {
     public static void main(String[] args) {
        Scanner Cifra = new Scanner(System.in);
        System.out.println("Numero que permita Invertir Cifras");
        int numero = Cifra.nextInt();
        
        if(numero>9999 & numero<100000){
            
            int a = numero/10000;
            int b = numero - (a*10000);
            int c = b/1000;
            int d = b -(c*1000);
            int e = d /100;
            int f = d - (e*100);
            int g = f /10;
            int h = f - (g*10);
           int i = (f*1000) + (e*100) + (c*10)+a;
        
            System.out.println("numero Invertido"+ i);
        
}
        }
     }
     
