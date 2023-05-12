public class CartaoDiaDosNamorados extends Cartao {
    
    public CartaoDiaDosNamorados(String destinatario) {
        super(destinatario);
    }

    public String retornaMesagem(String remetente) {
        return "Para: " + destinatario + "\nDe: " + remetente + "\nFeliz dia dos namorados!";
    }
}
