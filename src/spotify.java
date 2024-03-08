import java.sql.SQLInvalidAuthorizationSpecException;

public class spotify {
    public class Usuario {
        private String nome;
        private String email;
        private String tipodePlano;

        public Usuario(String nome, String email, String tipodePlano) {
            this.nome = nome;
            this.email = email;
            this.tipodePlano = tipodePlano;
        }

        public String getNome() {
            return nome;
        }

        public String getEmail() {
            return email;
        }

        public String getTipodePlano() {
            return tipodePlano;
        }

        public Usuario() {
            //Sem parâmetro
        }

    }

    public class Musica {
        private String nome;
        private String duracao;

        public Musica(String nome, String duracao) {
            this.nome = nome;
            this.duracao = duracao;
        }

        public String getNome() {
            return nome;
        }

        public String getDuracao() {
            return duracao;
        }

        public Musica() {
            //Sem parâmetro
        }
    }

    public class Playlist {
        private String nome;
        private String duracao;
        private String quantMusicas;

        public Playlist(String nome, String duracao, String quantMusicas) {
            this.nome = nome;
            this.duracao = duracao;
            this.quantMusicas = quantMusicas;
        }

        public String getNome() {
            return nome;
        }

        public String getDuracao() {
            return duracao;
        }

        public String getQuantMusicas() {
            return quantMusicas;
        }

        public Playlist() {
            //Sem parâmetro
        }
    }

    public class Biblioteca {
        private String quantPlaylists;
        private String artistas;
        private String recentes;

        public Biblioteca(String quantPlaylists, String artistas, String recentes) {
            this.quantPlaylists = quantPlaylists;
            this.artistas = artistas;
            this.recentes = recentes;
        }

        public String getQuantPlaylists() {
            return quantPlaylists;
        }

        public String getArtistas() {
            return artistas;
        }

        public String getRecentes() {
            return recentes;
        }

        public Biblioteca() {
           //Sem parâmetro
        }

    }

    public class Artista {
        private String nome;
        private String musica;
        private String visualizacoes;
        private String lucro;

        public Artista(String nome, String musica, String visualizacoes, String lucro) {
            this.nome = nome;
            this.musica = musica;
            this.visualizacoes = visualizacoes;
            this.lucro = lucro;
        }

        public String getNome() {
            return nome;
        }

        public String getMusica() {
            return musica;
        }

        public String getVisualizacoes() {
            return visualizacoes;
        }

        public String getLucro() {
            return lucro;
        }

        public Artista() {
            //Sem parâmetro
        }
    }

}
