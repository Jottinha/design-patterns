package criacionais.prototype;

/**
 * Problema: copiar um objeto manualmente e fragil. Se um campo novo for adicionado,
 * o codigo de copia precisa ser atualizado em todos os lugares — e facil esquecer.
 */
public class Antes {

    static class Forma {
        String tipo;
        String cor;
        int x;
        int y;
        int tamanho;
        // Imagine que futuramente adicionamos: String borda, double opacidade, etc.
    }

    static class EditorSemPrototype {
        public Forma duplicar(Forma original) {
            Forma copia = new Forma();
            copia.tipo = original.tipo;
            copia.cor = original.cor;
            copia.x = original.x + 10; // offset para nao sobrepor
            copia.y = original.y + 10;
            // copia.tamanho foi esquecido — bug silencioso!
            return copia;
        }
    }

    public static void demonstrar() {
        Forma original = new Forma();
        original.tipo = "Circulo";
        original.cor = "azul";
        original.x = 50;
        original.y = 50;
        original.tamanho = 100;

        EditorSemPrototype editor = new EditorSemPrototype();
        Forma copia = editor.duplicar(original);

        System.out.println("Original: tipo=" + original.tipo + ", tamanho=" + original.tamanho);
        System.out.println("Copia:    tipo=" + copia.tipo    + ", tamanho=" + copia.tamanho);
        System.out.println(">> tamanho da copia e 0 — campo esquecido na copia manual.");
    }
}
