package criacionais.factorymethod;

public class Teste {
    public static void main(String[] args) {
        System.out.println("=== PROBLEMA (sem o padrao) ===");
        Antes.demonstrar();

        System.out.println("\n=== SOLUCAO (Factory Method) ===");
        FabricaDeNotificadores[] fabricas = {
            new FabricaEmail(),
            new FabricaSms(),
            new FabricaPush()
        };

        for (FabricaDeNotificadores fabrica : fabricas) {
            fabrica.notificar("Seu pedido foi confirmado");
        }
        System.out.println(">> Novo canal: crie FabricaWhatsApp sem tocar no codigo existente.");
    }
}
