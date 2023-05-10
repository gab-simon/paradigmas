public abstract class ProdutoEletronico implements InterfaceLoja {
    private String nomeFabricante;
    private float peso;
    private String Marca;

    public ProdutoEletronico(String nomeFabricante, float peso, String marca) {
        this.setNomeFabricante(nomeFabricante);
        this.setPeso(peso);
        this.setMarca(marca);
    }

    public void setNomeFabricante(String nomeFabricante) {
        if (nomeFabricante != null) {
            this.nomeFabricante = nomeFabricante;
        }
    }

    public String getNomeFabricante() {
        return nomeFabricante;
    }

    public void setPeso(float peso) {
        if (peso >= 0) {
            this.peso = peso;
        }
    }

    public float getPeso() {
        return peso;
    }

    public void setMarca(String marca) {
        if (marca != null) {
            this.Marca = marca;
        }
    }

    public String getMarca() {
        return Marca;
    }

    public String venda() {
        return "Venda de produto eletrônico";
    }

    public String acionarGarantia() {
        return "Garantia acionada";
    }
}