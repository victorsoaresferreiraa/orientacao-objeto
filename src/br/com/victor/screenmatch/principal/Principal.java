package br.com.victor.screenmatch.principal;

import br.com.victor.screenmatch.calculo.CalculadoraTempo;
import br.com.victor.screenmatch.modelos.Filme;
import br.com.victor.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Exterminador do futuro");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibiFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        System.out.println(meuFilme.mediaDasAvaliacao());
        // meuFilme.somaDasAvaliacoes = 10;

        Serie Batman = new Serie();
        Batman.setNome("Batman cavaleiro das trevas");
        Batman.setTemporada(10);
        Batman.setEpisodioPorTemporada(12);
        System.out.println(Batman.getNome());
        System.out.println(Batman.getTemporada());

        Filme Superman = new Filme();
        Superman.setNome("Superman");
        //Superman

        CalculadoraTempo calculadora = new CalculadoraTempo();
        //calculadora.inclui(meuFilme);
        //System.out.println(calculadora.getTempoTotal());



    }
}