package br.anhembi.dto;

public class TransacaoDTO {

    private Double valor;
    private String horario;
    private String date; // formato: yyyy-MM-dd

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
