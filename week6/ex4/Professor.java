package week6.ex4;

public class Professor implements Comparable<Professor> {
    public String nome;
    public String matricula;

    public Professor(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public int compareTo(Professor p) {
        return this.nome.compareTo(p.nome);
    }
}
