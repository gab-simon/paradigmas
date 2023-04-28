import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("João", 1000);
        Empregado empregado1 = new Empregado("Maria", 2000);
        Empregado empregado2 = new Empregado("José", 3000);

        Collection<Empregado> c = new TreeSet<Empregado>();

        c.add(empregado);
        c.add(empregado1);
        c.add(empregado2);

        for (Empregado emp : c) {
            System.out.println(emp.getNome() + " " + emp.getSalario());
        }
    }
}
