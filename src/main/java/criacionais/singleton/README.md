# Singleton

## Problema

Em uma aplicação, componentes diferentes criam suas próprias instâncias de `ConfiguracaoSemSingleton`. Cada instância tem seu próprio estado: uma pode ter `ambiente=desenvolvimento` enquanto outra mantém `ambiente=producao`. Isso causa comportamentos inconsistentes e dificulta a centralização de configurações.

## Solução com o padrão

O Singleton garante que apenas **uma instância** de uma classe existe em toda a aplicação. O construtor é privado e o acesso é feito através de um método estático `getInstance()`. Usando `volatile` + double-checked locking, a solução é segura para ambientes multi-thread.

## Estrutura

| Classe | Papel |
|---|---|
| `ConfiguracaoApp` | Singleton — construtor privado, `getInstance()` com double-checked locking |
| `Antes` | Demonstra o problema com instâncias independentes |

## Como executar

```bash
javac -d target/classes src/main/java/criacionais/singleton/*.java
java -cp target/classes criacionais.singleton.Teste
```

## Saída esperada

```
=== PROBLEMA (sem o padrao) ===
config1.ambiente = desenvolvimento
config2.ambiente = producao
Mesma instancia? false
>> Estados inconsistentes: cada parte do sistema tem sua propria configuracao.

=== SOLUCAO (Singleton) ===
config1.ambiente = desenvolvimento
config2.ambiente = desenvolvimento
Mesma instancia? true
>> Uma unica instancia compartilhada em toda a aplicacao.
```
