package trabajos;

import java.util.Scanner;

public class Trabajo3 {

   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.println("ingrese tres numeros");

       int num1 = scanner.nextInt();
       int num2 = scanner.nextInt();
       int num3 = scanner.nextInt();

        if (num1>num2 && num1> num3) {
            System.out.println("el primer numero es mayor que el segundo y el tercero");
        }else {
            if (num2>num1 && num2>num3 ) {
                System.out.println("el segundo numero es mayor qu el primero y tercero");
            }else {
                if (num3>num1 && num3>num2) {
                    System.out.println("El tercer numero es mayor que el segundo y primero");
                }
            }
            }
        }


   }



