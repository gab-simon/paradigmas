// Construa um programa em Java que leia um número e diga se ele é positivo.
import java.util.Scanner;
public class ex1 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("positvo");
        } else {
            System.out.println("negativo");
        }
    }
}