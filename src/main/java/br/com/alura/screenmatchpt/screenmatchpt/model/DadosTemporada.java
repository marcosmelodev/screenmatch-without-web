package br.com.alura.screenmatchpt.screenmatchpt.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public record DadosTemporada(@JsonAlias("Season") Integer numero,
                             @JsonAlias("Episodes")List<DadosEpisodio> episodios) {
}
