package br.com.victor.screenmatch.calculo;

import br.com.victor.screenmatch.modelos.Filme;
import br.com.victor.screenmatch.modelos.Titulo;

public class CalculadoraTempo {
    private int tempoTotal;

//    public int getTempoTotal() {
//        return tempoTotal;
//    }
//
//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//
//    }

    public void inlui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
