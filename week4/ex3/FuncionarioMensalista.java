package week4.ex3;

public class FuncionarioMensalista extends Funcionario {
    private double salarioMensal;

    public FuncionarioMensalista(String nome, int idade, Data dataContratacao, boolean estrangeiro, double salarioMensal) {
        super(nome, idade, dataContratacao, estrangeiro);
        this.setSalarioMensal(salarioMensal);
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal > 0) {
            this.salarioMensal = salarioMensal;
        }
    }

    public double calcularSalarioMensal() {
        return salarioMensal;
    }

    public String toString() {
        return "Nome: " + getNome() + " | Idade: " + getIdade() + " | Data de contratação: " + getDataContratacao() + " | Estrangeiro: " + getEstrangeiro() + " | Salário mensal: " + getSalarioMensal();
    }

    final public double calcularSalarioAnual() {
        return salarioMensal * 12;
    }
}