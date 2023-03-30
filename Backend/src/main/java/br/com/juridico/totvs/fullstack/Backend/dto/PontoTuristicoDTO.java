package br.com.juridico.totvs.fullstack.Backend.dto;

import br.com.juridico.totvs.fullstack.Backend.domain.PontoTuristico;

public class PontoTuristicoDTO {
    private Long id;
    private String pais;
    private String cidade;
    private String nome;
    private String estacao;
    private String resumo;

    public PontoTuristicoDTO(Long id, String pais, String cidade, String nome, String estacao, String resumo) {
        this.id = id;
        this.pais = pais;
        this.cidade = cidade;
        this.nome = nome;
        this.estacao = estacao;
        this.resumo = resumo;
    }

public PontoTuristicoDTO(PontoTuristico pontoTuristico){
        this.id = pontoTuristico.getId();
        this.pais = pontoTuristico.getPais();
        this.cidade = pontoTuristico.getCidade();
        this.nome = pontoTuristico.getNome();
        this.estacao = pontoTuristico.getEstacao();
        this.resumo = pontoTuristico.getResumo();
}




}