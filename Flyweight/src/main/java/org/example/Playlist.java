package org.example;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Episodio> episodios = new ArrayList<>();
    public void adicionarEpisodio(String nome, String duracao, String genero){
        Episodio episodio = EpisodioFactory.getEpisodio(nome, duracao, genero);
        episodios.add(episodio);
    }
}