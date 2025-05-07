package Arreglos;

import java.util.Scanner;

public class ArregloNumeroMayor {
    public static void main(String[] args) {
        int [] a=new int[5];
        Scanner teclado=new Scanner(System.in);
        System.out.println("ingrese 5 enteros de numero");
        for (int i=0; i<a.length; i++){
            a[i]= teclado.nextInt();
        }
        int max=0;
        for (int i=1; i<a.length; i++){
            max=(a[max]>a[i])? max:i;
        }
        System.out.println("a=: "+a[max]);
    }
}
