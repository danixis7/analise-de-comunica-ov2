package br.anhembi.repository;

import br.anhembi.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {

    @Query("SELECT t FROM Transacao t WHERE t.data = :data AND ABS(t.valor - :valor) <= 100")
    List<Transacao> findTransacoesSuspeitas(LocalDate data, Double valor);
}
