package estruturais.adapter;

public class PagadorEuropeu {
    public void fazerPagamento(String recipiente, double amountEuros) {
        System.out.println("[EU-PAY] Pagando " + amountEuros + " EUR para " + recipiente);
    }
}
