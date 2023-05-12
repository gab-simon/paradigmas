public class ImovelNovo extends Item {
    public ImovelNovo(Endereco endereco, int preco) {
        super(endereco, preco);
    }

    @Override
    public void calcularValorImovel() {
        System.out.println("Valor do imóvel novo: " + this.preco);
    }
    
}
