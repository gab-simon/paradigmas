//Faça um programa em Java que leia os valores do peso e da altura de pessoas,
//  enquanto não for digitado o número -1, conte e escreva quantas pessoas estão acima do peso.
//  A condição (peso /(altura*altura)) <= 25 diz que a pessoa está no peso normal.

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o peso e a altura de uma pessoa, ou -1 para sair");
        int weight = sc.nextInt();
        int height = sc.nextInt();
        int result = 0;

        while (weight != -1 || height != -1) {
            if ((weight / (height * height)) <= 25) {
                result++;
            }
            System.out.println("peso");
            weight = sc.nextInt();
            System.out.println("altura");
            height = sc.nextInt();
        }

        System.out.println(result);
    }
}
