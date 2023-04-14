public class Principal {
    public static void main(String[] args) {
        Data dataContratacao = new Data(1, 1, 2019);
        FuncionarioMensalista funcionarioMensalista = new FuncionarioMensalista("João", 20, dataContratacao, false, 1000);
        FuncionarioMensalistaBonus funcionarioMensalistaBonus = new FuncionarioMensalistaBonus("Maria", 30, dataContratacao, true, 2000, 100);
        System.out.println(funcionarioMensalista.toString());
        System.out.println(funcionarioMensalistaBonus.toString());
    }
}
