package br.com.victor.screenmatch.modelos;

import br.com.victor.screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor(){
        return diretor;
    }

    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;

    }

    public String toString(){
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
