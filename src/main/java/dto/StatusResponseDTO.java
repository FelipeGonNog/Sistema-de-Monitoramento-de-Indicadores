package dto;

public class StatusResponseDTO {

    private String sistema;
    private String status;
    private String versao;
    private String timestamp;

    public StatusResponseDTO(String sistema, String status, String versao, String timestamp) {
        this.sistema = sistema;
        this.status = status;
        this.versao = versao;
        this.timestamp = timestamp;
    }

    public String getSistema() {
        return sistema;
    }

    public String getStatus() {
        return status;
    }

    public String getVersao() {
        return versao;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
