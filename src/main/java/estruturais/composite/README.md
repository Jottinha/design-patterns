# Composite

## Problema

Um sistema de arquivos precisa calcular o tamanho de pastas aninhadas. Sem o padrão, o código usa `instanceof` para distinguir `ArquivoSimples` de `PastaSimples` e mantém listas separadas por tipo. Adicionar um novo tipo de nó (ex: `Atalho`) quebra o método de cálculo.

## Solução com o padrão

`ComponenteDoSistema` é a interface comum para `Arquivo` (folha) e `Pasta` (composto). `Pasta.getTamanhoEmBytes()` soma os filhos recursivamente sem `instanceof` — qualquer novo tipo que implemente a interface funciona automaticamente.

## Estrutura

| Classe | Papel |
|---|---|
| `ComponenteDoSistema` | Interface — `getNome()`, `getTamanhoEmBytes()`, `exibir(int nivel)` |
| `Arquivo` | Folha — tamanho fixo |
| `Pasta` | Composto — agrega filhos, delega `getTamanhoEmBytes()` recursivamente |
| `Antes` | Demonstra o `instanceof` com listas separadas |

## Como executar

```bash
javac -d target/classes src/main/java/estruturais/composite/*.java
java -cp target/classes estruturais.composite.Teste
```

## Saída esperada

```
=== PROBLEMA (sem o padrao) ===
Tamanho total: 515072 bytes
>> instanceof espalhado; adicionar 'Atalho' quebra o metodo calcularTamanho.

=== SOLUCAO (Composite) ===
[projeto] (515584 bytes)
  - readme.txt (1024 bytes)
  - app.jar (512000 bytes)
  [config] (2560 bytes)
    - settings.json (2048 bytes)
    - db.properties (512 bytes)

Tamanho total: 515584 bytes
>> Arquivos e pastas tratados uniformemente; sem instanceof.
```
