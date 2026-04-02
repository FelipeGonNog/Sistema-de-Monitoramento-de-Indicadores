package br.com.govinsight.govinsight.entity;

import jakarta.persistence.*;

@Entity
public class DespesaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer ano;
    private String funcao;
    private String programa;
    private String acao;

    private Double empenhado;
    private Double liquidado;
    private Double pago;

    public DespesaEntity() {}

    public DespesaEntity(Integer ano, String funcao, String programa, String acao,
                         Double empenhado, Double liquidado, Double pago) {
        this.ano = ano;
        this.funcao = funcao;
        this.programa = programa;
        this.acao = acao;
        this.empenhado = empenhado;
        this.liquidado = liquidado;
        this.pago = pago;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public Double getEmpenhado() {
        return empenhado;
    }

    public void setEmpenhado(Double empenhado) {
        this.empenhado = empenhado;
    }

    public Double getLiquidado() {
        return liquidado;
    }

    public void setLiquidado(Double liquidado) {
        this.liquidado = liquidado;
    }

    public Double getPago() {
        return pago;
    }

    public void setPago(Double pago) {
        this.pago = pago;
    }

    // getters e setters
}
