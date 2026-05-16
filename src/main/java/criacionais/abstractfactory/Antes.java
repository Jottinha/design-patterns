package criacionais.abstractfactory;

/**
 * Problema: a tela conhece os tipos concretos de cada tema. Adicionar um terceiro
 * tema (ex: "alto contraste") exige modificar a classe Tela em varios pontos.
 */
public class Antes {

    static class TelaComIf {
        public void renderizar(String tema) {
            if (tema.equals("claro")) {
                System.out.println("[Botao-Claro] renderizando");
                System.out.println("[CaixaDeTexto-Clara] renderizando");
            } else if (tema.equals("escuro")) {
                System.out.println("[Botao-Escuro] renderizando");
                System.out.println("[CaixaDeTexto-Escura] renderizando");
            } else {
                throw new IllegalArgumentException("Tema desconhecido: " + tema);
            }
        }
    }

    public static void demonstrar() {
        TelaComIf tela = new TelaComIf();
        tela.renderizar("claro");
        tela.renderizar("escuro");
        System.out.println(">> Novo tema exige modificar TelaComIf — viola Open/Closed.");
    }
}
