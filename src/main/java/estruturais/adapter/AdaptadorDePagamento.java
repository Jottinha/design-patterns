package estruturais.adapter;

public class AdaptadorDePagamento implements ProcessadorDePagamento {

    private static final double TAXA_BRL_PARA_EUR = 0.18;
    private final PagadorEuropeu pagadorEuropeu;

    public AdaptadorDePagamento(PagadorEuropeu pagadorEuropeu) {
        this.pagadorEuropeu = pagadorEuropeu;
    }

    @Override
    public void processarPagamento(String destinatario, double valorEmReais) {
        double valorEmEuros = valorEmReais * TAXA_BRL_PARA_EUR;
        pagadorEuropeu.fazerPagamento(destinatario, valorEmEuros);
    }
}
