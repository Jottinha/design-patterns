package estruturais.bridge;

/**
 * Problema: com 2 formatos (PDF, CSV) e 2 destinos (Tela, Email), precisamos de 4 subclasses.
 * Um terceiro formato geraria mais 2; um terceiro destino, mais 3. Crescimento N*M.
 */
public class Antes {

    abstract static class RelatorioBase {
        abstract void gerar();
    }

    static class RelatorioPdfTela extends RelatorioBase {
        @Override
        void gerar() { System.out.println("[PDF -> Tela] Gerando relatorio"); }
    }

    static class RelatorioPdfEmail extends RelatorioBase {
        @Override
        void gerar() { System.out.println("[PDF -> Email] Gerando relatorio"); }
    }

    static class RelatorioCsvTela extends RelatorioBase {
        @Override
        void gerar() { System.out.println("[CSV -> Tela] Gerando relatorio"); }
    }

    static class RelatorioCsvEmail extends RelatorioBase {
        @Override
        void gerar() { System.out.println("[CSV -> Email] Gerando relatorio"); }
    }

    // Adicionar formato XML exigiria: RelatorioXmlTela, RelatorioXmlEmail...
    // Adicionar destino Slack exigiria: RelatorioPdfSlack, RelatorioCsvSlack, RelatorioXmlSlack...

    public static void demonstrar() {
        new RelatorioPdfTela().gerar();
        new RelatorioPdfEmail().gerar();
        new RelatorioCsvTela().gerar();
        new RelatorioCsvEmail().gerar();
        System.out.println(">> 4 subclasses para 2x2; com 3x3 seriam 9 subclasses.");
    }
}
