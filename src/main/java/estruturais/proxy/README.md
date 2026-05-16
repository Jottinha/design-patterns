# Proxy

## Problema

Um sistema cria objetos `ImagemReal` (carregamento do disco no construtor) para todos os itens de uma lista, mesmo que apenas parte deles seja exibida. O custo de I/O é pago sempre, independentemente do uso real.

## Solução com o padrão

`ProxyDeImagem` tem a mesma interface `Imagem` que `ImagemReal`, mas carrega o disco apenas no primeiro `exibir()`. O cliente não percebe a diferença — só as imagens realmente exibidas causam I/O.

## Estrutura

| Classe | Papel |
|---|---|
| `Imagem` | Interface — `void exibir()` |
| `ImagemReal` | Sujeito real — carrega do disco no construtor |
| `ProxyDeImagem` | Proxy virtual — instancia `ImagemReal` lazily na primeira exibição |
| `Antes` | Demonstra o carregamento eager de todas as imagens |

## Como executar

```bash
javac -d target/classes src/main/java/estruturais/proxy/*.java
java -cp target/classes estruturais.proxy.Teste
```

## Saída esperada

```
=== PROBLEMA (sem o padrao) ===
Criando lista de 5 imagens:
[DISCO] Carregando foto1.jpg...
[DISCO] Carregando foto2.jpg...
[DISCO] Carregando foto3.jpg...
[DISCO] Carregando foto4.jpg...
[DISCO] Carregando foto5.jpg...
>> 3 imagens foram carregadas do disco sem necessidade.

=== SOLUCAO (Proxy) ===
Criando lista de 5 proxies (sem carregar nada):

Exibindo apenas as 2 primeiras:
[DISCO] Carregando foto1.jpg...
[TELA] Exibindo foto1.jpg
[DISCO] Carregando foto2.jpg...
[TELA] Exibindo foto2.jpg
>> Apenas 2 imagens foram carregadas — exatamente as exibidas.
```
