public class Empregado implements Comparable<Empregado>{
    protected String nome;
    protected double salario;

    public Empregado(String nome, double salario) {
        this.setNome(nome);
        this.setSalario(salario);
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        }
    }

    public double getSalario() {
        return salario;
    }

    public int compareTo (Empregado emp) {
       if (this.salario < emp.salario )
            return -1;
        else if (this.salario > emp.salario)
            return 1;
        else
            return 0;
    }
}
