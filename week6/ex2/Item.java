public abstract class Item {
    public Endereco endereco;   
    public int preco;

    public Item(Endereco endereco, int preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    public abstract void calcularValorImovel();
}
