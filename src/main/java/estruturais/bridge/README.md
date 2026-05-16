# Bridge

## Problema

Com 2 formatos (PDF, CSV) e 2 destinos (Tela, E-mail), precisamos de 4 subclasses. Adicionar um terceiro formato exige 2 novas subclasses; um terceiro destino, mais 3. O número cresce como **N × M** — explosão combinatória garantida.

## Solução com o padrão

O Bridge separa a **abstração** (tipo de relatório) da **implementação** (formato de exportação). Cada dimensão pode variar independentemente. Com 3 relatórios e 3 formatos, são 3 + 3 = 6 classes, não 9.

## Estrutura

| Classe | Papel |
|---|---|
| `Exportador` | Implementação — `void exportar(String conteudo)` |
| `ExportadorPdf`, `ExportadorCsv` | Implementações concretas |
| `Relatorio` | Abstração — tem um `Exportador`, define `gerar()` |
| `RelatorioDeVendas`, `RelatorioDeEstoque` | Abstrações refinadas |
| `Antes` | Demonstra as 4 subclasses com stubs da explosão |

## Como executar

```bash
javac -d target/classes src/main/java/estruturais/bridge/*.java
java -cp target/classes estruturais.bridge.Teste
```

## Saída esperada

```
=== PROBLEMA (sem o padrao) ===
[PDF -> Tela] Gerando relatorio
[PDF -> Email] Gerando relatorio
[CSV -> Tela] Gerando relatorio
[CSV -> Email] Gerando relatorio
>> 4 subclasses para 2x2; com 3x3 seriam 9 subclasses.

=== SOLUCAO (Bridge) ===
[PDF] Relatorio de Vendas: total=R$15.000, itens=320
[CSV] Relatorio de Vendas: total=R$15.000, itens=320
[PDF] Relatorio de Estoque: produtos=85, criticos=3
[CSV] Relatorio de Estoque: produtos=85, criticos=3
>> Novo formato XML: apenas ExportadorXml. Novo relatorio: apenas nova subclasse de Relatorio.
```
