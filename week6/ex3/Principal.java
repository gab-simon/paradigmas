package week6.ex3;

import java.util.TreeSet;

public class Principal {
    public static void main(String args[]){
        TreeSet<Monitores> monitores = new TreeSet<Monitores>();

        monitores.add(new Monitores("João", "123", "CI1062"));
        monitores.add(new Monitores("Maria", "456", "CI182"));
        monitores.add(new Monitores("José", "789", "CI1062"));
        monitores.add(new Monitores("Ana", "123", "CI182"));

        for (Monitores m : monitores) {
            System.out.println(m.nome + " " + m.matricula + " " + m.codigoDisciplina);
        }
    }
}
