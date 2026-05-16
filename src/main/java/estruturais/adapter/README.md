# Adapter

## Problema

O sistema brasileiro usa `ProcessadorDePagamento` (valores em BRL), mas a biblioteca de pagamento europeia expõe `PagadorEuropeu.fazerPagamento()` (valores em EUR). Sem o Adapter, a conversão BRL→EUR fica inline em cada ponto de uso — repetida, inconsistente e difícil de manter.

## Solução com o padrão

`AdaptadorDePagamento` implementa `ProcessadorDePagamento` e internamente traduz a chamada para `PagadorEuropeu`. O cliente usa apenas a interface conhecida; a conversão fica encapsulada em um único lugar.

## Estrutura

| Classe | Papel |
|---|---|
| `ProcessadorDePagamento` | Interface alvo (esperada pelo cliente) |
| `PagadorEuropeu` | Adaptee — API incompatível da biblioteca externa |
| `AdaptadorDePagamento` | Adapter — implementa a interface alvo, delega ao adaptee |
| `Antes` | Demonstra a conversão inline espalhada |

## Como executar

```bash
javac -d target/classes src/main/java/estruturais/adapter/*.java
java -cp target/classes estruturais.adapter.Teste
```

## Saída esperada

```
=== PROBLEMA (sem o padrao) ===
[EU-PAY] Pagando 90.0 EUR para Fornecedor XYZ
>> Conversao BRL->EUR repetida em cada ponto de uso.

=== SOLUCAO (Adapter) ===
[EU-PAY] Pagando 90.0 EUR para Fornecedor XYZ
[EU-PAY] Pagando 216.0 EUR para Fornecedor ABC
>> Cliente usa apenas ProcessadorDePagamento; conversao encapsulada no adapter.
```
