package Arreglos;

public class ArregloString {
    public static void main(String[] args) {
        String[][] nombres={{"pedro","juven"},{"carl","lunas"}};
        for (String[] fila:nombres){
            for (String nombre:fila){
                System.out.println(nombre+"\t");
            }
        }
    }
}
