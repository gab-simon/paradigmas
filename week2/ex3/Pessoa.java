package week2.ex1;

public class Pessoa {
    public String nome;
    public int idade;
    public int dia;
    public int mes;
    public int ano;

    public Pessoa(String nome, int idade, int dia, int mes, int ano) {
        this.nome = nome;
        this.idade = idade;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String retornarNome() {
        return nome;
    }

    public int retornarIdade() {
        return idade;
    }

    public int calcularIdade() {
        return 2023 - ano;
    }
}
