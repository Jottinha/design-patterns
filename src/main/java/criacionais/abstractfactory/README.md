# Abstract Factory

## Problema

`TelaComIf` usa `if (tema.equals("claro"))` para instanciar diretamente `BotaoClaro`, `CaixaDeTextoClara`, etc. Adicionar um terceiro tema exige editar a classe `Tela` em vários pontos. Diferentes partes da tela podem acidentalmente misturar componentes de temas distintos.

## Solução com o padrão

`FabricaDeUI` é a fábrica abstrata que garante que todos os componentes criados pertencem ao mesmo tema. `Tela` recebe uma `FabricaDeUI` no construtor e nunca conhece os tipos concretos. Adicionar o tema "Alto Contraste" significa criar `FabricaTemaAltoContraste` — sem tocar em `Tela`.

## Estrutura

| Classe | Papel |
|---|---|
| `FabricaDeUI` | Fábrica abstrata — `criarBotao()`, `criarCaixa()` |
| `FabricaTemaClaro`, `FabricaTemaEscuro` | Fábricas concretas por tema |
| `Botao`, `CaixaDeTexto` | Interfaces de produto |
| `BotaoClaro`, `BotaoEscuro`, `CaixaDeTextoClara`, `CaixaDeTextoEscura` | Produtos concretos |
| `Tela` | Cliente — recebe `FabricaDeUI` via construtor |
| `Antes` | Demonstra o `if` acoplado aos tipos concretos |

## Como executar

```bash
javac -d target/classes src/main/java/criacionais/abstractfactory/*.java
java -cp target/classes criacionais.abstractfactory.Teste
```

## Saída esperada

```
=== PROBLEMA (sem o padrao) ===
[Botao-Claro] renderizando
[CaixaDeTexto-Clara] renderizando
[Botao-Escuro] renderizando
[CaixaDeTexto-Escura] renderizando
>> Novo tema exige modificar TelaComIf — viola Open/Closed.

=== SOLUCAO (Abstract Factory) ===
-- Tema Claro:
[Botao-Claro] renderizando
[CaixaDeTexto-Clara] renderizando
-- Tema Escuro:
[Botao-Escuro] renderizando
[CaixaDeTexto-Escura] renderizando
>> Novo tema: implemente FabricaDeUI sem tocar em Tela.
```
