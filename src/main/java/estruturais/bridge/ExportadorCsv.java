package estruturais.bridge;

public class ExportadorCsv implements Exportador {
    @Override
    public void exportar(String conteudo) {
        System.out.println("[CSV] " + conteudo);
    }
}
