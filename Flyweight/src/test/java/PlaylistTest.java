
import org.example.Playlist;
import org.example.EpisodioFactory;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlaylistTest {
    @Test
    public void deveRetornarPlayList() {
            Playlist playlist1 = new Playlist();
        playlist1.adicionarEpisodio("A Mansão Assombrada", "1h55min", "Terror");
        playlist1.adicionarEpisodio("A Chama Eterna do Amor", "1h02min", "Romance");
        playlist1.adicionarEpisodio("Pesadelo na Rua Elm", "1h43min", "Terror");
        playlist1.adicionarEpisodio("Herói de Ação: A Vingança", "1h55min", "Ação");
        playlist1.adicionarEpisodio("Dança das Sombras", "1h54min", "Ação");

        Playlist playlist2 = new Playlist();
        playlist2.adicionarEpisodio("Jornada pelo Desconhecido", "1h15min", "Aventura");
        playlist2.adicionarEpisodio("Fantasmas do Passado", "2h13min", "Terror");
        playlist2.adicionarEpisodio("A Chama Eterna do Amor", "2h02min", "Romance");
        playlist2.adicionarEpisodio("Amor Eterno", "3h36min", "Romance");
        playlist2.adicionarEpisodio("A Noite dos Mortos-Vivos", "1h57min", "Terror");


            assertEquals(9, EpisodioFactory.getTotalEpisodios()); //
        }

}
