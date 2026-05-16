# Facade

## Problema

Finalizar uma compra exige chamar `ServicoDeEstoque`, `AutorizadorDePagamento` e `ServicoDeDespacho` na ordem correta, verificando o resultado de cada etapa. Sem o padrão, cada tela ou controller do sistema repete essa orquestração — acoplamento alto e manutenção difícil.

## Solução com o padrão

`FachadaDeCompra` encapsula toda a orquestração em um único método `finalizarCompra()`. O cliente não conhece os subsistemas internos. Mudar a ordem ou adicionar uma etapa (ex: enviar e-mail de confirmação) afeta apenas a fachada.

## Estrutura

| Classe | Papel |
|---|---|
| `ServicoDeEstoque` | Subsistema — verifica disponibilidade |
| `AutorizadorDePagamento` | Subsistema — processa pagamento |
| `ServicoDeDespacho` | Subsistema — despacha o pedido |
| `FachadaDeCompra` | Fachada — orquestra os 3 subsistemas |
| `Antes` | Demonstra a orquestração manual espalhada |

## Como executar

```bash
javac -d target/classes src/main/java/estruturais/facade/*.java
java -cp target/classes estruturais.facade.Teste
```

## Saída esperada

```
=== PROBLEMA (sem o padrao) ===
[Estoque] Verificando: Notebook
[Pagamento] Processando: R$ 3500.0
[Despacho] Enviando Notebook para Rua das Flores, 10
>> Cada tela repete essa orquestracao de 3 subsistemas.

=== SOLUCAO (Facade) ===
[Estoque] Verificando: Notebook
[Pagamento] Processando: R$ 3500.0
[Despacho] Enviando Notebook para Rua das Flores, 10
[Compra] Finalizada com sucesso!
>> Um unico metodo oculta a complexidade dos 3 subsistemas.
```
