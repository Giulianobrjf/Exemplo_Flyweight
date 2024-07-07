package org.example;
import java.util.Map;
import java.util.HashMap;
public class EpisodioFactory {


        private static Map<String, Episodio> episodios = new HashMap<>();

        public static Episodio getEpisodio(String nome, String duracao, String genero){
            Episodio episodio = episodios.get(nome + genero);
            if (episodio == null) {
                episodio = new Episodio(nome, duracao, genero);
                episodios.put(nome + genero, episodio);
            }
            return episodio;
        }

        public static int getTotalEpisodios() {
            return episodios.size();
    }
}
