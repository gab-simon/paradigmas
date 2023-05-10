public class Servico implements InterfaceLoja {
    private String formato;
    private String duracao;

    public Servico(String formato, String duracao) {
        this.setFormato(formato);
        this.setDuracao(duracao);
    }

    public void setFormato(String formato) {
        if (formato != null) {
            this.formato = formato;
        }
    }

    public String getFormato() {
        return formato;
    }

    public void setDuracao(String duracao) {
        if (duracao != null) {
            this.duracao = duracao;
        }
    }

    public String getDuracao() {
        return duracao;
    }

    public String venda() {
        return "Venda de serviço";
    }

    public String acionarGarantia() {
        return "Garantia acionada";
    }
}