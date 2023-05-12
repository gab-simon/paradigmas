package week6.ex3;

public class Monitores implements Comparable<Monitores> {
    public String nome;
    public String matricula;
    public String codigoDisciplina;

    public Monitores(String nome, String matricula, String codigoDisciplina) {
        this.nome = nome;
        this.matricula = matricula;
        this.codigoDisciplina = codigoDisciplina;
    }

    @Override
    public int compareTo(Monitores m) {
        return this.nome.compareTo(m.nome);
    }
}
