public class Data {
    public int dia;
    public int mes;
    public int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int setDia(int dia) {
        if (dia > 0 && dia <= 31) {
            this.dia = dia;
        }
        return dia;
    }

    public int getDia() {
        return dia;
    }

    public int setMes(int mes) {
        if (mes > 0 && mes <= 12) {
            this.mes = mes;
        }
        return mes;
    }

    public int getMes() {
        return mes;
    }

    public int setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        }
        return ano;
    }

    public int getAno() {
        return ano;
    }

    public int ajustarData(int dia, int mes, int ano) {
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

    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}
