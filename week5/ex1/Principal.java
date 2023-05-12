

/* No método main da classe Principal, crie um único array de CartaoWeb. Insira
de forma alternada, instâncias dos três tipos de cartões neste array. Em
seguida, use um laço de repetição para exibir as mensagens dos cartões,
chamando o método retornarMensagem(String remetente) dos objetos,
utilizando como argumento o seu nome para remetente. Utilize os métodos
da classe Scanner para interação com o usuário.*/

public class Principal {
    public static void main(String[] args) {
        
        Cartao cartoes[] = new Cartao[6];

        cartoes[0] = new CartaoNatal("João");
        cartoes[1] = new CartaoAniversario("Maria");
        cartoes[2] = new CartaoDiaDosNamorados("José");
        cartoes[3] = new CartaoNatal("Pedro");
        cartoes[4] = new CartaoAniversario("Ana");
        cartoes[5] = new CartaoDiaDosNamorados("Paulo");

        for (int i = 0; i < cartoes.length; i++) {
            System.out.println(cartoes[i].retornaMesagem("Eu"));
        }
    }
}
