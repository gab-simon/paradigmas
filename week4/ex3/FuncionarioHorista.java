package week4.ex3;

public class FuncionarioHorista extends Funcionario {
    private double valorHora;
    private int horasTrabalhadas;

    public FuncionarioHorista(String nome, int idade, Data dataContratacao, boolean estrangeiro, double horasTrabalhadas, int horasTrabalhadas) {
        super(nome, idade, dataContratacao, estrangeiro);
        this.setHorasTrabalhadas(horasTrabalhadas);
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if (valorHora > 0) {
            this.valorHora = valorHora;
        }
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        if (horasTrabalhadas > 0) {
            this.horasTrabalhadas = horasTrabalhadas;
        }
    }

    public double calcularSalarioAnual() {
        return horasTrabalhadas * horasTrabalhadas;
    }

    public String toString() {
        return "Nome: " + getNome() + " | Idade: " + getIdade() + " | Data de contratação: " + getDataContratacao() + " | Estrangeiro: " + getEstrangeiro() + " | Valor da hora: " + getValorHora() + " | Horas trabalhadas: " + getHorasTrabalhadas();
    }
}