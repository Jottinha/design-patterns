package criacionais.prototype;

public class Teste {
    public static void main(String[] args) {
        System.out.println("=== PROBLEMA (sem o padrao) ===");
        Antes.demonstrar();

        System.out.println("\n=== SOLUCAO (Prototype) ===");
        Circulo original = new Circulo("azul", 100, 50, 50);
        Circulo copia = (Circulo) original.clonar();

        copia.cor = "vermelho";

        System.out.println("Original: " + original);
        System.out.println("Copia:    " + copia);
        System.out.println("Sao o mesmo objeto? " + (original == copia));
        System.out.println(">> Todos os campos copiados corretamente; modificar a copia nao afeta o original.");

        Retangulo ret = new Retangulo("verde", 200, 100, 0, 0);
        Retangulo retCopia = (Retangulo) ret.clonar();
        System.out.println("\nOriginal: " + ret);
        System.out.println("Copia:    " + retCopia);
    }
}
