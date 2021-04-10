package Clase3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String args []){
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int num = input.nextInt();

        int doble = retornaDoble(num);
        System.out.println("El numero doble es " + doble );


    }
    public static int retornaDoble (int num){
        return num * 2;
    }

}

