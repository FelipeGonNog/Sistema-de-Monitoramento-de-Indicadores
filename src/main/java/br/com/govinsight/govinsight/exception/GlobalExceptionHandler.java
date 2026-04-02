package br.com.govinsight.govinsight.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseEntity<dto.ErrorResponseDTO> handleMissingParams(MissingServletRequestParameterException ex) {
        dto.ErrorResponseDTO erro = new dto.ErrorResponseDTO(
                HttpStatus.BAD_REQUEST.value(),
                "Parâmetro obrigatório ausente",
                "O parâmetro '" + ex.getParameterName() + "' é obrigatório.",
                LocalDateTime.now().toString()
        );

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erro);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<dto.ErrorResponseDTO> handleRuntimeException(RuntimeException ex) {
        dto.ErrorResponseDTO erro = new dto.ErrorResponseDTO(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "Erro interno no sistema",
                ex.getMessage(),
                LocalDateTime.now().toString()
        );

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(erro);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<dto.ErrorResponseDTO> handleGenericException(Exception ex) {
        dto.ErrorResponseDTO erro = new dto.ErrorResponseDTO(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "Erro inesperado",
                ex.getMessage(),
                LocalDateTime.now().toString()
        );

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(erro);
    }
}