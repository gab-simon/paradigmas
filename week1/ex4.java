//Faça um programa em Java que calcule e imprima a soma dos 10 primeiros múltiplos de 3.

public class ex4 {
    public static void main(String arg[]){
        int sum = 0;
        int number = 3;
        int count = 0;

        while (count < 10) {
            sum += number;
            number += 3;
            count++;
        }

        System.out.println(sum);
    }
}
