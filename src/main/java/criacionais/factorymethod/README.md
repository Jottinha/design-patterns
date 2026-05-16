# Factory Method

## Problema

`ServicoDeNotificacao` decide qual notificador criar usando um `switch` no canal (`"email"`, `"sms"`, `"push"`). Adicionar um novo canal (ex: WhatsApp) obriga a editar essa classe — viola o Princípio Aberto/Fechado. O cliente também fica acoplado aos tipos concretos.

## Solução com o padrão

Cada canal tem sua própria `FabricaDeNotificadores` que sabe como criar o `Notificador` correto. O cliente trabalha apenas com a abstração. Adicionar WhatsApp significa criar `FabricaWhatsApp` — sem tocar no código existente.

## Estrutura

| Classe | Papel |
|---|---|
| `Notificador` | Interface produto — `void enviar(String mensagem)` |
| `EmailNotificador`, `SmsNotificador`, `PushNotificador` | Produtos concretos |
| `FabricaDeNotificadores` | Criador abstrato — factory method `criar()` + template method `notificar()` |
| `FabricaEmail`, `FabricaSms`, `FabricaPush` | Criadores concretos |
| `Antes` | Demonstra o switch acoplado |

## Como executar

```bash
javac -d target/classes src/main/java/criacionais/factorymethod/*.java
java -cp target/classes criacionais.factorymethod.Teste
```

## Saída esperada

```
=== PROBLEMA (sem o padrao) ===
[EMAIL] Enviando: Seu pedido foi confirmado
[SMS] Enviando: Seu pedido foi confirmado
>> Para adicionar 'whatsapp', e preciso editar esta classe.

=== SOLUCAO (Factory Method) ===
[EMAIL] Enviando: Seu pedido foi confirmado
[SMS] Enviando: Seu pedido foi confirmado
[PUSH] Enviando: Seu pedido foi confirmado
>> Novo canal: crie FabricaWhatsApp sem tocar no codigo existente.
```
