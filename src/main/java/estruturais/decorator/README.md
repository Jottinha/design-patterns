# Decorator

## Problema

Um sistema de logs precisa de combinações flexíveis: log no console, em arquivo, com timestamp, criptografado. Criar uma subclasse para cada combinação leva à explosão: `LogConsole`, `LogArquivo`, `LogConsoleArquivo`, `LogArquivoCriptografado`... Com N destinos e M funcionalidades extras, o número de classes cresce como N × M.

## Solução com o padrão

`LoggerDecorator` envolve qualquer `Logger` e adiciona comportamento antes ou depois de delegar a chamada. Decoradores são empilhados em tempo de execução — nenhuma subclasse nova é necessária para novas combinações.

## Estrutura

| Classe | Papel |
|---|---|
| `Logger` | Interface — `void log(String message)` |
| `ConsoleLogger` | Componente concreto — imprime no console |
| `LoggerDecorator` | Decorador abstrato — delega ao `Logger` interno |
| `FileLogger` | Decorador — adiciona informação de arquivo |
| `LoggerCompleto` | Decorador — adiciona timestamp |
| `Antes` | Demonstra a explosão de subclasses |

## Como executar

```bash
javac -d target/classes src/main/java/estruturais/decorator/*.java
java -cp target/classes estruturais.decorator.Teste
```

## Saída esperada

```
=== PROBLEMA (sem o padrao) ===
>> Cada combinacao exige uma nova subclasse:
[CONSOLE] Sistema iniciado
[ARQUIVO] Sistema iniciado
...

=== SOLUCAO (Decorator) ===
[ARQUIVO] teste.txt foi salvo no diretorio do projeto
[2026-01-01 12:00:00] Execucao da rotina de desenvolvimento
Sistema iniciado com sucesso.
```
