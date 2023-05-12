public class Principal {
    public static void main(String args[]){
        Item imoveis[] = new Item[200];

        for (int i = 0; i < imoveis.length; i++) {
            if (i % 2 == 0) {
                imoveis[i] = new ImovelNovo(new Endereco("Rua 1", 1, "Bairro 1", "Cidade 1", "Estado 1"), 1000);
            } else {
                imoveis[i] = new ImovelVelho(new Endereco("Rua 2", 2, "Bairro 2", "Cidade 2", "Estado 2"), 2000);
            }
        }

        for (int i = 0; i < imoveis.length; i++) {
            imoveis[i].calcularValorImovel();
        }
    }
}
