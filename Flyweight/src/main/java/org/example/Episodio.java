package org.example;

public class Episodio {
        String nome;
        String duracao;
        String genero;

        public Episodio (String nome, String duracao, String genero){
            this.nome = nome;
            this.duracao = duracao;
            this.genero = genero;
        }
        public String getNome() {
            return nome;
        }

        public String getDuracao() {
            return duracao;
        }

        public String getGenero() {
            return genero;
        }

}
