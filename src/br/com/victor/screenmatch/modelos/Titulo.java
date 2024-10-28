package br.com.victor.screenmatch.modelos;

import br.com.victor.screenmatch.excessao.ErrodeConversaodeAnoException;

public class Titulo implements Comparable<Titulo> {
        private String nome;
        private int anoDeLancamento;
        private boolean inlcuidoNoPlano;
        private double somaDasAvaliacoes;
        private int totaldeavaliacoes;
        private int duracaoEmMinutos;

        public int getDuracaoEmMinutos() {
            return duracaoEmMinutos;
        }

        public double getSomaDasAvaliacoes() {
            return somaDasAvaliacoes;
        }

        public boolean isInlcuidoNoPlano() {
            return inlcuidoNoPlano;
        }

        public int getAnoDeLancamento() {
            return anoDeLancamento;
        }

        public String getNome() {
            return nome;
        }

        public int getTotaldeavaliacoes(){
            return totaldeavaliacoes;
        }

        public void setTotaldeavaliacoes(int totaldeavaliacoes) {
            this.totaldeavaliacoes = totaldeavaliacoes;
        }

        public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
            this.somaDasAvaliacoes = somaDasAvaliacoes;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setDuracaoEmMinutos(int duracaoEmMinutos) {
            this.duracaoEmMinutos = duracaoEmMinutos;
        }

        public void setInlcuidoNoPlano(boolean inlcuidoNoPlano) {
            this.inlcuidoNoPlano = inlcuidoNoPlano;
        }

        public void setAnoDeLancamento(int anoDeLancamento) {
            this.anoDeLancamento = anoDeLancamento;
        }

        public void exibiFichaTecnica(){
            System.out.println("Nome do filme  " + nome);
            System.out.println("Ano de lançamento  " + anoDeLancamento);


        }

        public void avalia(double nota){
            somaDasAvaliacoes += nota;
            totaldeavaliacoes++;
        }

        public double mediaDasAvaliacao(){
            return somaDasAvaliacoes / totaldeavaliacoes;
        }


        public Titulo(String nome, int anoDeLancamento){
            this.nome = nome;
            this.anoDeLancamento = anoDeLancamento;
        }

        public Titulo(TituloOmdb meuTituloOmdb) throws ErrodeConversaodeAnoException {
            this.nome = meuTituloOmdb.title();

            if (meuTituloOmdb.year().length() > 4){
                throw new ErrodeConversaodeAnoException("Não consegui converter o ano" +
                        "porque tem mais de 04 caracteres.");

            }

            this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
            this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 2));
        }
    }


