//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("----- USUÁRIO ----");
        spotify.Usuario usuario = new spotify().new Usuario("Rafael Freitas, Matheus Giaretta, Lucas Utrabo, Felipe Freitas", "grupodospadrins@gmail.com", "Premium");

        System.out.println("Nome do usuário: " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Tipo de Plano: " + usuario.getTipodePlano());

        System.out.println("----- MÚSICA -----");
        spotify.Musica musica = new spotify().new Musica("Lets go 4", "10:41");
        spotify.Musica musica2 = new spotify().new Musica("Deixa alagar", "3:23");

        System.out.println("Nome música 1: " + musica.getNome());
        System.out.println("Duração música 1: " + musica.getDuracao());
        System.out.println("Nome música 2: " + musica2.getNome());
        System.out.println("Duração música 2: " + musica2.getDuracao());

        System.out.println("----- PLAYLIST -----");
        spotify.Playlist playlist = new spotify().new Playlist("Finja que você está numa edit do Chico Moedas", "7h8min", "178");
        spotify.Playlist playlist2 = new spotify().new Playlist("FUNK LACTEA", "7h26min", "166");

        System.out.println("Nome da playlist 1: " + playlist.getNome());
        System.out.println("Duração da playlist 1 : " + playlist.getDuracao());
        System.out.println("Quantidade de músicas 1: " + playlist.getQuantMusicas());
        System.out.println("Nome da playlist 2: " + playlist2.getNome());
        System.out.println("Duração da playlist 2 : " + playlist2.getDuracao());
        System.out.println("Quantidade de músicas 2: " + playlist2.getQuantMusicas());

        System.out.println("----- BIBLIOTECA -----");
        spotify.Biblioteca biblioteca = new spotify().new Biblioteca("15 playlists", "MC IG, Poze do Rodo, Matuê, Travis Scott, 21 Savage, Costa Gold", "Finja que você está numa edit do Chico Moedas");

        System.out.println("Quantidade de playlists: " + biblioteca.getQuantPlaylists());
        System.out.println("Artistas: " + biblioteca.getArtistas());
        System.out.println("Playlist recente: " + biblioteca.getRecentes());

        System.out.println("----- ARTISTA -----");
        spotify.Artista artista = new spotify().new Artista("MC IG", "Lets go 4", "220.103.697", "U$ 735.000");

        System.out.println("Nome: " + artista.getNome());
        System.out.println("Música: " + artista.getMusica());
        System.out.println("Visualizações: " + artista.getVisualizacoes());
        System.out.println("Lucro: " + artista.getLucro());
    }
}