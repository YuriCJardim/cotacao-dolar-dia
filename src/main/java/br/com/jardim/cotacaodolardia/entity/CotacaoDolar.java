package br.com.jardim.cotacaodolardia.entity;


import java.util.Date;
import java.util.Objects;


public class CotacaoDolar{


    private Long id;
    private Date dataCotacao;
    private double cotacaoCompra;
    private double cotacaoVenda;

    public CotacaoDolar(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataCotacao() {
        return dataCotacao;
    }

    public void setDataCotacao(Date dataCotacao) {
        this.dataCotacao = dataCotacao;
    }

    public double getCotacaoCompra() {
        return cotacaoCompra;
    }

    public void setCotacaoCompra(double cotacaoCompra) {
        this.cotacaoCompra = cotacaoCompra;
    }

    public double getCotacaoVenda() {
        return cotacaoVenda;
    }

    public void setCotacaoVenda(double cotacaoVenda) {
        this.cotacaoVenda = cotacaoVenda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CotacaoDolar that = (CotacaoDolar) o;
        return Double.compare(that.cotacaoCompra, cotacaoCompra) == 0 && Double.compare(that.cotacaoVenda, cotacaoVenda) == 0 && Objects.equals(id, that.id) && Objects.equals(dataCotacao, that.dataCotacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataCotacao, cotacaoCompra, cotacaoVenda);
    }
}
