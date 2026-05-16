# Builder

## Problema

Criar um `Relatorio` exige um construtor com 6 parâmetros, a maioria opcional. O chamador precisa passar `null` para campos não usados e saber a ordem exata dos argumentos — `new RelatorioSemBuilder("Vendas", null, "corpo", null, true, false)`. Com o tempo, adicionar um campo novo quebra todas as chamadas existentes.

## Solução com o padrão

O Builder constrói o objeto passo a passo com métodos nomeados e encadeáveis (`comCabecalho()`, `comTabela()`). Apenas os campos obrigatórios vão no construtor do Builder. O método `construir()` retorna o produto final imutável.

## Estrutura

| Classe | Papel |
|---|---|
| `Relatorio` | Produto — campos `final`, construído apenas pelo Builder |
| `RelatorioBuilder` | Builder — métodos fluentes, `construir()` ao final |
| `Antes` | Demonstra o construtor telescópico com nulls |

## Como executar

```bash
javac -d target/classes src/main/java/criacionais/builder/*.java
java -cp target/classes criacionais.builder.Teste
```

## Saída esperada

```
=== PROBLEMA (sem o padrao) ===
Relatorio{titulo='Vendas', cabecalho='null', corpo='Dados de vendas', ...}
>> Leitura confusa: o que significa o 5o e 6o argumento?

=== SOLUCAO (Builder) ===
Relatorio{titulo='Vendas', corpo='Dados de vendas', [TABELA]}
Relatorio{titulo='Estoque', cabecalho='Q1 2026', corpo='Dados de estoque', rodape='Confidencial', [GRAFICO]}
>> Cada campo nomeado, sem nulls, leitura fluente.
```
