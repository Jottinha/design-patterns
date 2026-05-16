package estruturais.facade;

public class Teste {
    public static void main(String[] args) {
        System.out.println("=== PROBLEMA (sem o padrao) ===");
        Antes.demonstrar();

        System.out.println("\n=== SOLUCAO (Facade) ===");
        FachadaDeCompra fachada = new FachadaDeCompra();
        fachada.finalizarCompra("Notebook", 3500.0, "Rua das Flores, 10");
        System.out.println(">> Um unico metodo oculta a complexidade dos 3 subsistemas.");
    }
}
