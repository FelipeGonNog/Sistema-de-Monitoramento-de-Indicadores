package dto;

public class DespesaResumoDTO {

    private double totalEmpenhado;
    private double totalLiquidado;
    private double totalPago;

    public DespesaResumoDTO(double totalEmpenhado, double totalLiquidado, double totalPago) {
        this.totalEmpenhado = totalEmpenhado;
        this.totalLiquidado = totalLiquidado;
        this.totalPago = totalPago;
    }

    public double getTotalEmpenhado() {
        return totalEmpenhado;
    }

    public double getTotalLiquidado() {
        return totalLiquidado;
    }

    public double getTotalPago() {
        return totalPago;
    }
}