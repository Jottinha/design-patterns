package estruturais.bridge;

public class ExportadorPdf implements Exportador {
    @Override
    public void exportar(String conteudo) {
        System.out.println("[PDF] " + conteudo);
    }
}
