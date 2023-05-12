package week5.ex1;

public abstract class Cartao {
    protected String destinatario;

    public Cartao(String destinatario) {
        this.destinatario = destinatario;
    }

    public abstract String retornaMesagem(String remetente);
}
