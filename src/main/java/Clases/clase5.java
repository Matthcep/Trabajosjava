package Clases;

import java.util.Arrays;
import java.util.Scanner;

public class clase5 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        numeros[0]=2;
        numeros[1]=21;
        numeros[3]=2;
        numeros[4]=2;
        numeros[5]=2;
        numeros[6]=2;

        Scanner scanner = new Scanner(System.in);
        Double[] arreglo = new Double[4];

        System.out.println("Digite la Primera nota");
        arreglo[0]=scanner.nextDouble();
        System.out.println("Digite la Primera nota");
        arreglo[1]=scanner.nextDouble();
        System.out.println("Digite la Primera nota");
        arreglo[2]=scanner.nextDouble();
        System.out.println("Digite la Primera nota");
        arreglo[3]=scanner.nextDouble();

        Arrays.stream(arreglo).forEach(System.out::println);

        System.out.println("El promedio es " + ((arreglo[0] + arreglo[1] + arreglo[2] + arreglo[3]) / arreglo.length));
    }
}
