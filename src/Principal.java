public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome =  "Exterminador do Futuro";
        meuFilme.anoDeLancamento = 1700;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibiFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        System.out.println((meuFilme.mediaDasAvaliacao()));
    }
}