package br.com.victor.screenmatch.excessao;

public class ErrodeConversaodeAnoException extends RuntimeException {
    private String mensagem;

    public ErrodeConversaodeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMensagem(){
        return this.mensagem;
    }
}
