// Faça um programa em Java que leia as 4 notas de 30 alunos da turma
//  e escreva a maior nota de cada aluno e a maior nota da turma.

import java.util.Scanner;

public class ex7 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 2; i++) {
            int max = 0;
            for (int j = 0; j < 4; j++) {
                int note = sc.nextInt();
                if (note > max) {
                    max = note;
                }
                System.out.println("maior do aluno: " + max);
            }
            System.out.println("maior da turma: " + max);
        }
    }
}
