# 📌 Sistema de Logs

Em sistemas empresariais, a criação de logs é essencial para depuração e auditoria. Muitas aplicações precisam de diferentes tipos de logs, como:
- Logs no **console**
- Logs em **arquivos**
- Logs em um **servidor remoto**
- Logs **criptografados** (para segurança)

O problema é que, se tentarmos criar subclasses para cada tipo de log, teremos algo assim:

✅ `LogConsole`  
✅ `LogArquivo`  
✅ `LogServidor`  
✅ `LogArquivoCriptografado`  
✅ `LogServidorCriptografado`

Isso rapidamente se tornaria **difícil de manter** conforme mais combinações fossem adicionadas.

## 🎯 Objetivo

Criar um sistema de logging flexível usando o padrão **Decorator**, permitindo que diferentes funcionalidades sejam adicionadas dinamicamente, sem precisar criar múltiplas subclasses.

---

## 🚀 O que fazer

1. Criar uma **interface base** para representar um logger.
2. Criar uma **implementação concreta** que escreve logs no console.
3. Criar uma **classe base Decorator**, que permite adicionar novos comportamentos sem modificar a estrutura do código existente.
4. Criar um **decorador para salvar logs em arquivos**.
5. Criar um **decorador para criptografar logs antes de salvá-los**.
6. Criar um **programa principal** que permita testar diferentes combinações dos logs.

---
...