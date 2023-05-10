import java.util.ArrayList;

public class Principal {
    public static void main (String[] args) {
        // colecao ArrayList<Loja>

        ArrayList<InterfaceLoja> lojas = new ArrayList<InterfaceLoja>();

        Celular.add(new ProdutoEletronico("Apple", 1.5f, "Apple"));
        Televisao.add(new Servico("Digital", "1 hora"));

        for (InterfaceLoja loja : lojas) {
            System.out.println(loja.venda());
            System.out.println(loja.acionarGarantia());
        }
    }
}