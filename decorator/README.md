# DECORATOR

O padrão de projeto Decorator permite adicionar comportamentos a um objeto dinamicamente, ou seja, o objeto receberá comportamentos e valores diferentes em tempo de execução.
Para entender como isso funciona, vamos ver um problema em que podemos usar esse padrão de projeto.

Problema:

Imagine que você está criando um sistema para uma pizzaria em que, ao fazer o pedido de uma pizza, o cliente pode escolher coberturas extras como Pepperoni, queijo e cogumelo. Obviamente, cada cobertura tem um valor diferente que deve ser adicionado ao valor total da pizza, e na descrição do pedido deve conter qual é a cobertura extra escolhida.

Sem o padrão Decorator, você criaria uma subclasse da classe pizza para representar cada cobertura extra que pode ser adicionada:

![image](https://github.com/Jottinha/design-patterns/assets/69482936/9db07bb7-49cf-41ee-88b2-e1f2a92611bd)

Porém, sabemos que nem sempre o cliente vai escolher apenas uma cobertura extra. Se você criar novas subclasses para cada cobertura que o cliente decida acrescentar no pedido, observe como seu código ficará complexo e difícil de dar manutenção.

![image](https://github.com/Jottinha/design-patterns/assets/69482936/9e216200-c694-4795-87ab-49e64473beca)

Abaixo, observe agora como ficaria meu main:

![image](https://github.com/Jottinha/design-patterns/assets/69482936/7cc806ae-ee1e-4580-b9f7-61155f5a2cb7)

Para cada rechei estamos declarando uma nova subclasse e isso iria escalar de uma forma problematica com novos recheios.

Imagine que peçam para você colocar também uma cobertura extra de bacon.

Você teria que criar subclasses para cada combinação de cobertura extra:
- bacon e pepperoni
- bacon e queijo
- bacon e cogumelo
- bacon, cogumelo e queijo
- ...

Percebe a complexidade e dificuldade que esse código pode se tornar conforme o projeto for crescendo e novas coberturas extras sejam implementadas?

## Como o Decorator resolve esse problema?

Primeiro precisamos definir um objeto principal que nós queremos que tenha comportamentos a mais conforme for rodando o programa, esse objeto no nosso senario é a Pizza sem recheio.

![image](https://github.com/Jottinha/design-patterns/assets/69482936/5e1cdee4-942a-4431-844f-bb37f9ba83ed)
(Criamos uma interface para ficar padronizado os metodos que toda pizza deve ter, descrição e valor)

Agora precisamos criar uma clase decorator para servir como base para todos os recheios que forem adicionados, nomeamos essa classe como PizzaDecorator.

![image](https://github.com/Jottinha/design-patterns/assets/69482936/f6b7191e-afd3-4470-aef1-6307b715d5d4)

Agora criaremos recheios que irão ser subclasse da PizzaDecorator.

![image](https://github.com/Jottinha/design-patterns/assets/69482936/95f1b802-bb1f-4fd5-8d2b-ab3e0309201a)

Dessa forma quando tiver mais de um recheio na pizza seu codigo ficará menos complexo e mais facil de ser implementado.

Observe meu Main agora:
![image](https://github.com/Jottinha/design-patterns/assets/69482936/40fd16bc-5c5d-4a4c-9cdf-eadf48748bbf)

Usando esse padrão você adicionar uma cobertura na pizza aprovaitando o objeto criado no principio.

Mas e se o cliente decidir colocar mais de um recheio? Sem problema!

Você não precisa criar uma classe para cada cobinação.

![image](https://github.com/Jottinha/design-patterns/assets/69482936/fb0e383a-96a8-4c21-8e6b-06dac66746b9)

Basta adicionar tudo no mesmo objeto criado no principio.

A descrição e o custo da pizza vai mudar e ser adicionado durante a execução do codigo.

![image](https://github.com/Jottinha/design-patterns/assets/69482936/75376816-8d0f-4689-bbba-5260713af3d0)

Dessa forma nosso projeto conseguira acrescentar funcionalidades ao objeto durante a execução, o codigo continuará simples e facil de implementar novas funcionalidade.


Caso queira entender melhor no codigo acesse o codigo que esta junto a esse readme.

... 

🏗️🏗️🏗️ Em construção
