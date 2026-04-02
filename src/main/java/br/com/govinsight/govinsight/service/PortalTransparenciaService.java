package br.com.govinsight.govinsight.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.govinsight.govinsight.entity.DespesaEntity;
import br.com.govinsight.govinsight.repository.DespesaRepository;

import dto.DespesaResponseDTO;
import dto.DespesaResumoDTO;
import dto.StatusResponseDTO;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PortalTransparenciaService {

    private final RestTemplate restTemplate;

    @Value("${portal.transparencia.base-url}")
    private String baseUrl;

    @Value("${portal.transparencia.api-key}")
    private String apiKey;

    public List<DespesaResponseDTO> buscarDespesas(int ano, int funcao, int pagina) {

        String url = baseUrl + "/api-de-dados/despesas/por-funcional-programatica"
                + "?ano=" + ano
                + "&funcao=" + funcao
                + "&pagina=" + pagina;

        HttpHeaders headers = new HttpHeaders();
        headers.set("chave-api-dados", apiKey);
        headers.set("accept", "*/*");

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<List<DespesaResponseDTO>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<List<DespesaResponseDTO>>() {}
        );

        return response.getBody();
    }

    private double converterValor(String valor) {
    if (valor == null || valor.isEmpty()) {
        return 0;
    }

    valor = valor.replace(".", "").replace(",", ".");

    return Double.parseDouble(valor);
}

    public DespesaResumoDTO gerarResumo(int ano, int funcao, int pagina) {

    List<DespesaResponseDTO> despesas = buscarDespesas(ano, funcao, pagina);

    double totalEmpenhado = 0;
    double totalLiquidado = 0;
    double totalPago = 0;

    for (DespesaResponseDTO d : despesas) {

        totalEmpenhado += converterValor(d.getEmpenhado());
        totalLiquidado += converterValor(d.getLiquidado());
        totalPago += converterValor(d.getPago());
    }

    return new DespesaResumoDTO(totalEmpenhado, totalLiquidado, totalPago);
}
public StatusResponseDTO obterStatusSistema() {
    return new StatusResponseDTO(
            "GovInsight",
            "online",
            "1.0.0",
            LocalDateTime.now().toString()
    );
}

private final DespesaRepository repository;

public PortalTransparenciaService(RestTemplate restTemplate, DespesaRepository repository) {
    this.restTemplate = restTemplate;
    this.repository = repository;
}
public void salvarDespesas(int ano, int funcao, int pagina) {

    List<DespesaResponseDTO> despesas = buscarDespesas(ano, funcao, pagina);

    for (DespesaResponseDTO d : despesas) {

        DespesaEntity entity = new DespesaEntity(
                d.getAno(),
                d.getFuncao(),
                d.getPrograma(),
                d.getAcao(),
                converterValor(d.getEmpenhado()),
                converterValor(d.getLiquidado()),
                converterValor(d.getPago())
        );

        repository.save(entity);
    }
    
}




}
