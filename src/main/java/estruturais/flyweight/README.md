# Flyweight

## Problema

Um jogo 2D renderiza 10.000 árvores do tipo "Pinheiro". Sem o padrão, cada `ArvoreCompleta` armazena `tipo`, `textura` e `cor` — dados idênticos repetidos em 10.000 objetos. Com mais tipos e mais árvores, o consumo de memória se torna inviável.

## Solução com o padrão

`TipoDeArvore` armazena o estado intrínseco (nome, textura, cor) e é compartilhado entre todas as árvores do mesmo tipo via `FabricaDeTipos` (cache). `Arvore` armazena apenas o estado extrínseco (posição x, y). 18.000 árvores de 3 tipos usam apenas 3 objetos de tipo.

## Estrutura

| Classe | Papel |
|---|---|
| `TipoDeArvore` | Flyweight — estado intrínseco compartilhado (nome, textura, cor) |
| `FabricaDeTipos` | Fábrica de flyweights — cache `Map<String, TipoDeArvore>` |
| `Arvore` | Contexto — estado extrínseco (x, y) + referência ao tipo |
| `Mapa` | Cliente — gerencia coleção de árvores |
| `Antes` | Demonstra 10.000 objetos com dados duplicados |

## Como executar

```bash
javac -d target/classes src/main/java/estruturais/flyweight/*.java
java -cp target/classes estruturais.flyweight.Teste
```

## Saída esperada

```
=== PROBLEMA (sem o padrao) ===
Arvores criadas: 10000
Objetos distintos: 10000
>> 10.000 copias da mesma textura e cor ocupando memoria desnecessariamente.

=== SOLUCAO (Flyweight) ===
...
Total de arvores no mapa: 18000
TipoDeArvore distintos criados: 3
>> 18.000 arvores compartilham apenas 3 objetos de tipo.
```
