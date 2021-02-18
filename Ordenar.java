
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
public class Ordenar {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Primer Numero");
        int num1 = scn.nextInt();
        System.out.println("Segundo Numero");
        int num2 = scn.nextInt();
        System.out.println("Tercer Numero");
        int num3 = scn.nextInt();
        
        if(num1<num2 && num2<num3){
            System.out.println("Menor a Mayor: "+num1+ ","+num2+ ","+num3);
        }else if(num1<num3 && num3<num2){
            System.out.println("Menor a Mayor: "+num1+ ","+num3+ ","+num2);
        }else if(num2<num1 && num1<num3){
            System.out.println("Menor a Mayor: "+num2+ ","+num1+ ","+num3);   
        }else if(num2<num3 && num3<num1){
            System.out.println("Menor a Mayor: "+num2+ ","+num3+ ","+num1);
        }else if(num3<num1 && num1<num2){
            System.out.println("Menor a Mayor: "+num3+ ","+num1+ ","+num2);
        }else if(num3<num2 && num2<num1){
            System.out.println("Menor a Mayor: "+num3+ ","+num2+ ","+num1);
    }
}
}