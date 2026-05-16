package estruturais.facade;

public class ServicoDeDespacho {
    public void despachar(String produto, String endereco) {
        System.out.println("[Despacho] Enviando " + produto + " para " + endereco);
    }
}
