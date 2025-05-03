# 📌 Sistema de Logs com Decorator

Em sistemas empresariais, a criação de logs é essencial para depuração e auditoria. Muitas aplicações precisam de diferentes tipos de logs, como:

* logs no **console**
* logs em **arquivos**
* logs em um **servidor remoto**
* logs **criptografados** (para segurança)

O problema é que, se tentarmos criar subclasses para cada tipo de log, teremos algo assim:

✅ `LogConsole`  
✅ `LogArquivo`  
✅ `LogServidor`  
✅ `LogArquivoCriptografado`  
✅ `LogServidorCriptografado`  

Isso rapidamente se tornaria **difícil de manter** conforme mais combinações fossem adicionadas.

---

## 🎯 Objetivo

Criar um sistema de logging flexível usando o padrão **Decorator**, permitindo que diferentes funcionalidades sejam adicionadas dinamicamente, sem precisar criar múltiplas subclasses.

---

## ✅ O que foi implementado

1. Uma **interface base `Logger`** que define o método `log(String message)`.
2. Um **logger concreto `ConsoleLogger`** que imprime mensagens no console.
3. Uma **classe abstrata `LoggerDecorator`** que implementa `Logger` e serve de base para decoradores.
4. Um **decorador `FileLogger`** que adiciona uma informação simulando o salvamento em arquivo.
5. Um **decorador `LoggerCompleto`** que adiciona um timestamp e mensagem contextual.
6. Um **`Main`** que demonstra como encadear os decoradores.

---

## 🔁 Fluxo de execução

```java
Logger console = new ConsoleLogger();
Logger file = new FileLogger(console);
Logger completo = new LoggerCompleto(file);

completo.log("Sistema iniciado com sucesso.");
```

### Resultado no console:

```
[ARQUIVO] teste.txt foi salvo no diretorio do projeto
[2025-05-03 20:12:10] Execução da rotina de desenvolvimento
Sistema iniciado com sucesso.
```

---

## 🧩 Benefícios do padrão Decorator

* Adição de funcionalidades sem alterar classes existentes.
* Combinação flexível de comportamentos.
* Maior manutenção e escalabilidade no sistema de logs.

