package week2.ex1;

public class Principal {
    public static void main(String[] args) {
        Pessoa grace = new Pessoa("Grace Hopper", 0, 9, 12, 1906);
        Pessoa ada = new Pessoa("Ada Lovelace", 0, 10, 12, 1815);

        System.out.println(grace.retornarNome() + " " + grace.calcularIdade());
        System.out.println(ada.retornarNome() + " " + ada.calcularIdade());
    }
}
