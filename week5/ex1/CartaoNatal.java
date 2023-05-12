public class CartaoNatal extends Cartao {

    public CartaoNatal(String destinatario) {
        super(destinatario);
    }

    public String retornaMesagem(String remetente) {
        return "Para: " + destinatario + "\nDe: " + remetente + "\nFeliz Natal!";
    }
}
