//Faça um programa em Java que leia números 
// inteiros enquanto não for digitado o número -1, e calcule e imprima a soma destes números.
import java.util.Scanner;

public class ex3 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;

        while (number != -1) {
            sum += number;
            number = sc.nextInt();
        }

        System.out.println(sum);
    }
}
