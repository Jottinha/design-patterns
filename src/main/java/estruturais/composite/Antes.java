package estruturais.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Problema: o calculador precisa distinguir arquivos de pastas com instanceof,
 * e tratar cada tipo separadamente. Adicionar um novo tipo de no quebra a logica.
 */
public class Antes {

    static class ArquivoSimples {
        String nome;
        long tamanho;

        ArquivoSimples(String nome, long tamanho) {
            this.nome = nome;
            this.tamanho = tamanho;
        }
    }

    static class PastaSimples {
        String nome;
        List<Object> filhos = new ArrayList<>(); // mistura arquivos e pastas como Object

        PastaSimples(String nome) {
            this.nome = nome;
        }
    }

    static long calcularTamanho(Object no) {
        if (no instanceof ArquivoSimples arquivo) {
            return arquivo.tamanho;
        } else if (no instanceof PastaSimples pasta) {
            long total = 0;
            for (Object filho : pasta.filhos) {
                total += calcularTamanho(filho); // recursao manual com instanceof
            }
            return total;
        }
        return 0;
    }

    public static void demonstrar() {
        ArquivoSimples f1 = new ArquivoSimples("readme.txt", 1024);
        ArquivoSimples f2 = new ArquivoSimples("app.jar", 512000);

        PastaSimples sub = new PastaSimples("config");
        sub.filhos.add(new ArquivoSimples("settings.json", 2048));

        PastaSimples raiz = new PastaSimples("projeto");
        raiz.filhos.add(f1);
        raiz.filhos.add(f2);
        raiz.filhos.add(sub);

        System.out.println("Tamanho total: " + calcularTamanho(raiz) + " bytes");
        System.out.println(">> instanceof espalhado; adicionar 'Atalho' quebra o metodo calcularTamanho.");
    }
}
