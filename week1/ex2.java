// Construa um programa em Java que leia um número inteiro e diga se ele é par ou ímpar.

import java.util.Scanner;

public class ex2 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }
    }
}
