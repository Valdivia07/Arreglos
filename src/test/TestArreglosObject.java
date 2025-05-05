package test;

import domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
        /*Persona personas[] =new Persona[2];
        personas[0]=new Persona("mama");
        personas[1]=new Persona("karla");
        System.out.println("personas[0] = " + personas[0]);
        System.out.println("personas[1] = " + personas[1]);
        for (int i=0; i<personas.length;i++){
            System.out.println(personas[i]);
        }*/
        String frutas[][]={{"Naranja","Limon"},{"Fresa","Zarzamora","Mora"}};
        for (int ren=0; ren< frutas.length; ren++){
            for (int col=0; col<frutas[ren].length;col++){
                System.out.println("frutas = " + ren+"-"+col+":"+frutas[ren][col]);
            }
        }
    }
}
