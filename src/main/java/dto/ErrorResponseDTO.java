package dto;

public class ErrorResponseDTO {

    private int status;
    private String erro;
    private String mensagem;
    private String timestamp;

    public ErrorResponseDTO(int status, String erro, String mensagem, String timestamp) {
        this.status = status;
        this.erro = erro;
        this.mensagem = mensagem;
        this.timestamp = timestamp;
    }

    public int getStatus() {
        return status;
    }

    public String getErro() {
        return erro;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
