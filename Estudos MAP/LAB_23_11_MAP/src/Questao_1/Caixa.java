package Questao_1;

public class Caixa {

    public static final double TAXA = 6.0;
    public static final double DESCONTO = 0.10;
    public static final double NADA = 0.0;
    public static final int ZERO_PRODUTOS = 0;


    public double calc (double preco, int quantidade_produto, boolean clienteFiel ) {

        if ( quantidade_produto <= ZERO_PRODUTOS) {return NADA;}

        double precoTotal = preco * quantidade_produto;

        if ( clienteFiel ) {
            double precoComdesconto = preco * quantidade_produto - (preco * quantidade_produto * DESCONTO);
            return precoComdesconto + TAXA;
        }
        return precoTotal + TAXA;
    }

    private String formatarTotal(double preco, int quantidade_produto, boolean clienteFiel) {
        return " Total : R$ " + calc(preco, quantidade_produto, clienteFiel);
    }

    public String tela(double preco, int quantidade_produto, boolean clienteFiel) {
        return formatarTotal(preco, quantidade_produto, clienteFiel);
    }

    public String arquivo(double preco, int quantidade_produto, boolean clienteFiel) {
        return formatarTotal(preco, quantidade_produto, clienteFiel);
    }
}
