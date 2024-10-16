package br.com.victor.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporada;
    private boolean ativa;
    private int episodioPorTemporada;
    private int minutosPorEpisodio;

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos(){
        return temporada * episodioPorTemporada + minutosPorEpisodio;
    }
}
