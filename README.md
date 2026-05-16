# Padroes de Projeto em Java

Guia de referencia pratica e didatica dos principais **Design Patterns** em Java puro.

Cada padrao e apresentado com dois cenarios lado a lado:
- **Antes** — o problema que o padrao resolve (codigo acoplado, explosao de subclasses, etc.)
- **Depois** — a solucao limpa usando o padrao

---

## Criacionais

Padroes que controlam **como os objetos sao criados**.

| Padrao | Problema resolvido |
|---|---|
| [Factory Method](src/main/java/criacionais/factorymethod/README.md) | Criacao acoplada com `switch`/`if` — novo tipo exige editar o cliente |
| [Abstract Factory](src/main/java/criacionais/abstractfactory/README.md) | Familias de objetos relacionados sem garantia de consistencia entre eles |
| [Builder](src/main/java/criacionais/builder/README.md) | Construtores com muitos parametros opcionais e `null`s |
| [Prototype](src/main/java/criacionais/prototype/README.md) | Copia manual de objetos propensa a esquecer campos |
| [Singleton](src/main/java/criacionais/singleton/README.md) | Multiplas instancias de algo que deveria ser unico |

---

## Estruturais

Padroes que definem **como os objetos se compoem e se relacionam**.

| Padrao | Problema resolvido |
|---|---|
| [Adapter](src/main/java/estruturais/adapter/README.md) | Interfaces incompativeis entre sistemas |
| [Bridge](src/main/java/estruturais/bridge/README.md) | Explosao combinatoria de subclasses em duas dimensoes |
| [Composite](src/main/java/estruturais/composite/README.md) | Tratamento diferente de individuos vs grupos com `instanceof` |
| [Decorator](src/main/java/estruturais/decorator/README.md) | Explosao de subclasses para cada combinacao de funcionalidades |
| [Facade](src/main/java/estruturais/facade/README.md) | Orquestracao de multiplos subsistemas repetida em vários lugares |
| [Flyweight](src/main/java/estruturais/flyweight/README.md) | Criacao de muitos objetos com dados identicos duplicados |
| [Proxy](src/main/java/estruturais/proxy/README.md) | Acesso direto sem controle de custo (lazy loading, cache) |

---

## Comportamentais

> **Pendente** — implementacao em desenvolvimento.

Chain of Responsibility, Command, Iterator, Mediator, Memento, Observer, State, Strategy, Template Method, Visitor.

---

## Como executar qualquer padrao

```bash
# Compilar tudo
javac -d target/classes $(find src/main/java -name "*.java")

# Rodar um padrao especifico
java -cp target/classes criacionais.singleton.Teste
java -cp target/classes estruturais.decorator.Teste
```

No Windows (PowerShell):
```powershell
$files = Get-ChildItem src\main\java -Recurse -Filter *.java | % FullName
javac -d target\classes $files
java -cp target\classes criacionais.singleton.Teste
```

---

> *"Aprender nunca e demais — cada linha de codigo nos deixa mais proximos da excelencia."*
