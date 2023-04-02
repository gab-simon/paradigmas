package week2.ex3;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoas [] = new Pessoa[2];
        pessoas[0] = new Pessoa("Grace Hopper", 0, 9, 12, 1906);
        pessoas[1] = new Pessoa("Ada Lovelace", 0, 10, 12, 1815);

        System.out.println(pessoas[0].retornarNome() + " " + pessoas[0].calcularIdade());
        System.out.println(pessoas[1].retornarNome() + " " + pessoas[1].calcularIdade());
    }
}
