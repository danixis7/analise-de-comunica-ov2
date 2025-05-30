package br.anhembi.service;

import br.anhembi.dto.TransacaoDTO;
import br.anhembi.model.Transacao;
import br.anhembi.repository.TransacaoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AnaliseService {

    private final TransacaoRepository repository;

    public AnaliseService(TransacaoRepository repository) {
        this.repository = repository;
    }

    public List<Transacao> analisarTransacao(TransacaoDTO dto) {
        LocalDate data = LocalDate.parse(dto.getHorario());
        return repository.findTransacoesSuspeitas(data, dto.getValor());
    }
}
