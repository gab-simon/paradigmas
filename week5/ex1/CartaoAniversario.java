public class CartaoAniversario extends Cartao {
    public CartaoAniversario(String destinatario) {
        super(destinatario);
    }

    public String retornaMesagem(String remetente) {
        return "Para: " + destinatario + "\nDe: " + remetente + "\nFeliz aniversário!";
    }
}
