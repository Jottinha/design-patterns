package estruturais.facade;

public class ServicoDeEstoque {
    public boolean verificarDisponibilidade(String produto) {
        System.out.println("[Estoque] Verificando: " + produto);
        return true;
    }
}
