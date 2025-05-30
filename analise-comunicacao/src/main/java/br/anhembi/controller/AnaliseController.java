package br.anhembi.controller;

import br.anhembi.dto.TransacaoDTO;
import br.anhembi.model.Transacao;
import br.anhembi.service.AnaliseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/analise")
public class AnaliseController {

    private final AnaliseService service;

    public AnaliseController(AnaliseService service) {
        this.service = service;
    }

    @PostMapping
    public List<Transacao> analisar(@RequestBody TransacaoDTO dto) {
        return service.analisarTransacao(dto);
    }
}
