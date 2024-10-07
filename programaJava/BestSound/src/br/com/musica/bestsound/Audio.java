package br.com.musica.bestsound;

import br.com.calculos.bestsound.Favoritavel;

public class Audio implements Favoritavel {
    private String titulo;  // Corrigido para seguir padrão de nome de variável
    private double duracao;
    private int totalReproducao;
    private int curtidas;
    private int classificacao;  // Corrigido erro de digitação

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public void setTotalReproducao(int totalReproducao) {
        this.totalReproducao = totalReproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getClassificacao() {  // Corrigido nome do método
        return classificacao;
    }

    public void setClassificacao(int classificacao) {  // Corrigido nome do método
        this.classificacao = classificacao;
    }

    @Override
    public int getFavorito() {
        // Aqui você pode adicionar a lógica para o "favorito"
        return 0;  // Retorno de exemplo
    }

    public void curte() {
        this.curtidas++;
    }

    public void reproduz() {
        this.totalReproducao++;
    }
}
