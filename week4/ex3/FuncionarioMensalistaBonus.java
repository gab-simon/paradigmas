package week4.ex3;

public class FuncionarioMensalistaBonus extends FuncionarioMensalista {
    private double bonus;

    public FuncionarioMensalistaBonus(String nome, int idade, Data dataContratacao, boolean estrangeiro, double salarioMensal, double bonus) {
        super(nome, idade, dataContratacao, estrangeiro, salarioMensal);
        this.setBonus(bonus);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if (bonus > 0) {
            this.bonus = bonus;
        }
    }

    public double calcularSalarioMensal() {
        return super.calcularSalarioMensal() + bonus;
    }

    public String toString() {
        return "Nome: " + getNome() + " | Idade: " + getIdade() + " | Data de contratação: " + getDataContratacao() + " | Estrangeiro: " + getEstrangeiro() + " | Salário mensal: " + getSalarioMensal() + " | Bônus: " + getBonus();
    }
}