package estruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements ComponenteDoSistema {
    private final String nome;
    private final List<ComponenteDoSistema> filhos = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void adicionar(ComponenteDoSistema componente) {
        filhos.add(componente);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public long getTamanhoEmBytes() {
        long total = 0;
        for (ComponenteDoSistema filho : filhos) {
            total += filho.getTamanhoEmBytes();
        }
        return total;
    }

    @Override
    public void exibir(int nivel) {
        System.out.println("  ".repeat(nivel) + "[" + nome + "] (" + getTamanhoEmBytes() + " bytes)");
        for (ComponenteDoSistema filho : filhos) {
            filho.exibir(nivel + 1);
        }
    }
}
