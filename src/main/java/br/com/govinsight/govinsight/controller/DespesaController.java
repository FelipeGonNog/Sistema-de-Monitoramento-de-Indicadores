package br.com.govinsight.govinsight.controller;

import br.com.govinsight.govinsight.service.PortalTransparenciaService;
import dto.DespesaResponseDTO;
import dto.DespesaResumoDTO;
import dto.StatusResponseDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DespesaController {

    private final PortalTransparenciaService portalTransparenciaService;

    public DespesaController(PortalTransparenciaService portalTransparenciaService) {
        this.portalTransparenciaService = portalTransparenciaService;
    }

    @GetMapping("/despesas")
    public List<DespesaResponseDTO> buscarDespesas(
            @RequestParam int ano,
            @RequestParam int funcao,
            @RequestParam int pagina
    ) {
        return portalTransparenciaService.buscarDespesas(ano, funcao, pagina);
    }
    @GetMapping("/resumo-despesas")
    public DespesaResumoDTO resumoDespesas(
        @RequestParam int ano,
        @RequestParam int funcao,
        @RequestParam int pagina
    ){
        return portalTransparenciaService.gerarResumo(ano, funcao, pagina);
    }
    @GetMapping("/status")
    public StatusResponseDTO status(){
        return portalTransparenciaService.obterStatusSistema();
    }

    @PostMapping("/despesas/salvar")
public String salvarDespesas(
        @RequestParam int ano,
        @RequestParam int funcao,
        @RequestParam int pagina
) {
    portalTransparenciaService.salvarDespesas(ano, funcao, pagina);
    return "Dados salvos com sucesso!";
}



    }
    




 
    
