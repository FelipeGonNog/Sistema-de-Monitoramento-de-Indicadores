package dto;

public class DespesaResponseDTO {

    private Integer ano;
    private String funcao;
    private String codigoFuncao;
    private String subfuncao;
    private String codigoSubfuncao;
    private String programa;
    private String codigoPrograma;
    private String acao;
    private String codigoAcao;
    private String empenhado;
    private String liquidado;
    private String pago;

    public DespesaResponseDTO() {
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

    public String getCodigoFuncao() {
        return codigoFuncao;
    }

    public void setCodigoFuncao(String codigoFuncao) {
        this.codigoFuncao = codigoFuncao;
    }

    public String getSubfuncao() {
        return subfuncao;
    }

    public void setSubfuncao(String subfuncao) {
        this.subfuncao = subfuncao;
    }

    public String getCodigoSubfuncao() {
        return codigoSubfuncao;
    }

    public void setCodigoSubfuncao(String codigoSubfuncao) {
        this.codigoSubfuncao = codigoSubfuncao;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getCodigoPrograma() {
        return codigoPrograma;
    }

    public void setCodigoPrograma(String codigoPrograma) {
        this.codigoPrograma = codigoPrograma;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getCodigoAcao() {
        return codigoAcao;
    }

    public void setCodigoAcao(String codigoAcao) {
        this.codigoAcao = codigoAcao;
    }

    public String getEmpenhado() {
        return empenhado;
    }

    public void setEmpenhado(String empenhado) {
        this.empenhado = empenhado;
    }

    public String getLiquidado() {
        return liquidado;
    }

    public void setLiquidado(String liquidado) {
        this.liquidado = liquidado;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }
}