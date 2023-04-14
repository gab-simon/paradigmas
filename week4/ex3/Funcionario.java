public class Funcionario {
    protected String nome;
    protected int idade;
    protected Data dataContratacao;
    protected boolean estrangeiro;

    public Funcionario(String nome, int idade, Data dataContratacao, boolean estrangeiro) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setDataContratacao(dataContratacao);
        this.estrangeiro = estrangeiro;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setEstrangeiro(boolean estrangeiro) {
        this.estrangeiro = estrangeiro;
    }

    public boolean getEstrangeiro() {
        return estrangeiro;
    }

    public void setDataContratacao(Data dataContratacao) {
        if (dataContratacao != null) {
            this.dataContratacao = dataContratacao;
        }
    }

    public Data getDataContratacao() {
        return dataContratacao;
    }

    public double calcularSalarioAnual() {
        return 0;
    }

    public String getData() {
        return dataContratacao.toString();
    }
}
