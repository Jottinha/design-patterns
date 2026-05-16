# Prototype

## Problema

Copiar um objeto manualmente exige repetir cada atribuição de campo. Se um novo campo for adicionado à classe (ex: `double opacidade`), o código de cópia precisa ser atualizado em todos os pontos — e é fácil esquecer. O bug é silencioso: o campo omitido recebe valor padrão zero/null.

## Solução com o padrão

Cada objeto sabe como clonar a si mesmo através da interface `Clonavel`. O copy constructor interno garante que todos os campos sejam copiados. Adicionar um campo à classe significa atualizar apenas o construtor privado — o código cliente não muda.

## Estrutura

| Classe | Papel |
|---|---|
| `Clonavel` | Interface — `Clonavel clonar()` |
| `Circulo`, `Retangulo` | Implementam `Clonavel` com copy constructor privado |
| `Antes` | Demonstra a cópia manual com campo esquecido |

## Como executar

```bash
javac -d target/classes src/main/java/criacionais/prototype/*.java
java -cp target/classes criacionais.prototype.Teste
```

## Saída esperada

```
=== PROBLEMA (sem o padrao) ===
Original: tipo=Circulo, tamanho=100
Copia:    tipo=Circulo, tamanho=0
>> tamanho da copia e 0 — campo esquecido na copia manual.

=== SOLUCAO (Prototype) ===
Original: Circulo{cor='azul', raio=100, x=50, y=50}
Copia:    Circulo{cor='vermelho', raio=100, x=60, y=60}
Sao o mesmo objeto? false
>> Todos os campos copiados corretamente; modificar a copia nao afeta o original.
```
