package Arreglos;

import java.util.Scanner;

public class numerosArrays {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int [] numero=new int[10];
        System.out.println("ingrese 10 numeros enteros");
        for (int i=0;i<10;i++){
            System.out.println("numero "+(i+1)+":");
            numero[i]=teclado.nextInt();
        }
        System.out.println("los numeros en orden alterado son");
        for (int i=0; i<5; i++){
            System.out.println(numero[9-i]);
            System.out.println(numero[i]);
        }
    }
}
