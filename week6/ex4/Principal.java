package week6.ex4;

import java.util.LinkedList;
import java.util.Scanner;

public class Principal {
    public static void main(String args[]){
        LinkedList<Professor> professores = new LinkedList<Professor>();

        professores.add(new Professor("João", "123"));
        professores.add(new Professor("Maria", "456"));
        professores.add(new Professor("José", "789"));
        professores.add(new Professor("Ana", "123"));

        Scanner s = new Scanner(System.in);
        System.out.println("Digite a matricula do professor: ");
        String matricula = s.nextLine();

        for (Professor p : professores) {
            if (p.matricula.equals(matricula)) {
                System.out.println("Professor encontrado: " + p.nome);
                professores.remove(p);
                return;
            }
        }

        System.out.println("Professor não encontrado");
    }
}
