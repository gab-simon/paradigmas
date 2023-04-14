package week4.ex3;

public class Principal {
    public static void main(String[] args) {
        Data dataContratacao = new Data(1, 1, 2019);
        FuncionarioMensalista funcionarioMensalista = new FuncionarioMensalista("João", 20, dataContratacao, false, 1000);
        System.out.println(FuncionarioMensalista.toString());
    }
}
