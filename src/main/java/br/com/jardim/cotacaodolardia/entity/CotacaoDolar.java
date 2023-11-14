package br.com.jardim.cotacaodolardia.entity;


public class CotacaoDolar {


    private String cotacaoCompra;
    private String cotacaoVenda;

    private String dataHoraCotacao;

    public CotacaoDolar() {
    }

    public String getCotacaoCompra() {
        return cotacaoCompra;
    }

    public void setCotacaoCompra(String cotacaoCompra) {
        this.cotacaoCompra = cotacaoCompra;
    }

    public String getCotacaoVenda() {
        return cotacaoVenda;
    }

    public void setCotacaoVenda(String cotacaoVenda) {
        this.cotacaoVenda = cotacaoVenda;
    }

    public String getDataHoraCotacao() {
        return dataHoraCotacao;
    }

    public void setDataHoraCotacao(String dataHoraCotacao) {
        this.dataHoraCotacao = dataHoraCotacao;
    }
}
