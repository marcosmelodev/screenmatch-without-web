package br.com.alura.screenmatchpt.screenmatchpt.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodio (@JsonAlias("Title") String titulo,
                             @JsonAlias("Episodio") Integer numero,
                             @JsonAlias("imdbRating") String avaliacao,
                             @JsonAlias("Released") String dataLancamento){

}
