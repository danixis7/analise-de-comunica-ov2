package br.anhembi.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double valor;

    private LocalDate data;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Double getValor() { return valor; }
    public void setValor(Double valor) { this.valor = valor; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }
}
