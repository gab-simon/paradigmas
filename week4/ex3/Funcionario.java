package week4.ex1;

public class Funcionario {
    protected String nome;
    protected int idade;
    protected Data dataContratacao;
    protected boolean estrageiro;

    public Funcionario(String nome, int idade, Data dataContratacao, boolean estrangeiro) {
        this.setNome(nome);
        this.setIdade(idade);
        this.dataContratacao = dataContratacao;
        this.estrangeiro = estrangeiro;
    }

    public setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }
    }

    public String getNome() {
        return nome;
    }

    public setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }
    }

    public int getIdade() {
        return idade;
    }

    public setEstrangeiro(boolean estrangeiro) {
        this.estrangeiro = estrangeiro;
    }

    public boolean getEstrangeiro() {
        return estrangeiro;
    }

    public Data getDataContratacao() {
        return dataContratacao;
    }

    public setDataContratacao(Data dataContratacao) {
        if (dataContratacao != null && dataContratacao.ajustarData() > 0) {
            this.dataContratacao = dataContratacao;
        }
    }

    public double calcularSalarioAnual() {
        return 0;
    }
}
