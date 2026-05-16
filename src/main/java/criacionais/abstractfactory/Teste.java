package criacionais.abstractfactory;

public class Teste {
    public static void main(String[] args) {
        System.out.println("=== PROBLEMA (sem o padrao) ===");
        Antes.demonstrar();

        System.out.println("\n=== SOLUCAO (Abstract Factory) ===");
        System.out.println("-- Tema Claro:");
        Tela telaClara = new Tela(new FabricaTemaClaro());
        telaClara.renderizar();

        System.out.println("-- Tema Escuro:");
        Tela telaEscura = new Tela(new FabricaTemaEscuro());
        telaEscura.renderizar();

        System.out.println(">> Novo tema: implemente FabricaDeUI sem tocar em Tela.");
    }
}
