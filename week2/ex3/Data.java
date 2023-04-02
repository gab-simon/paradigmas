package week2.ex3;

public class Data {
    public int dia;
    public int mes;
    public int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int ajustarData() {
        if (dia > 31) {
            dia = 1;
            mes++;
        }
        if (mes > 12) {
            mes = 1;
            ano++;
        }
        return dia + mes + ano;
    }

    public String imprimir() {
        return dia + "/" + mes + "/" + ano;
    }
}
