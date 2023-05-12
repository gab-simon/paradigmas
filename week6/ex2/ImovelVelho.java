public class ImovelVelho extends Item {
    public ImovelVelho(Endereco endereco, int preco) {
        super(endereco, preco);
    }

    @Override
    public void calcularValorImovel() {
        System.out.println("Valor do imóvel velho: " + this.preco);
    }
}
