public abstract class Cartao {
    protected String destinatario;

    public Cartao(String destinatario) {
        this.destinatario = destinatario;
    }

    public abstract String retornaMesagem(String remetente);
}
