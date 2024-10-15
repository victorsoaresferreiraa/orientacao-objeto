public class Filme {
    String nome;
    int anoDeLancamento;
    boolean inlcuidoNoPlano;
    double somaDasAvaliacoes;
    int totaldeavaliacoes;
    int duracaoEmMinutos;

    void exibiFichaTecnica(){
        System.out.println("Nome do filme  " + nome);
        System.out.println("Ano de lançamento  " + anoDeLancamento);


    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totaldeavaliacoes++;
    }

    double mediaDasAvaliacao(){
        return somaDasAvaliacoes / totaldeavaliacoes;
    }
}
