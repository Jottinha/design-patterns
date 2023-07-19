# DECORATOR

O padrão de projeto Decorator permite adicionar comportamentos a um objeto dinamicamente, ou seja, o objeto receberá comportamentos e valores diferentes em tempo de execução.
Para entender como isso funciona, vamos ver um problema em que podemos usar esse padrão de projeto.

Problema:

Imagine que você está criando um sistema para uma pizzaria em que, ao fazer o pedido de uma pizza, o cliente pode escolher coberturas extras como Pepperoni, queijo e cogumelo. Obviamente, cada cobertura tem um valor diferente que deve ser adicionado ao valor total da pizza, e na descrição do pedido deve conter qual é a cobertura extra escolhida.

Sem o padrão Decorator, você criaria uma subclasse da classe pizza para representar cada cobertura extra que pode ser adicionada:

![image](https://github.com/Jottinha/design-patterns/assets/69482936/9db07bb7-49cf-41ee-88b2-e1f2a92611bd)

Porém, sabemos que nem sempre o cliente vai escolher apenas uma cobertura extra. Se você criar novas subclasses para cada cobertura que o cliente decida acrescentar no pedido, observe como seu código ficará complexo e difícil de dar manutenção.

![image](https://github.com/Jottinha/design-patterns/assets/69482936/9e216200-c694-4795-87ab-49e64473beca)

Agora, imagine que peçam para você colocar também uma cobertura extra de bacon.

Você teria que criar subclasses para cada combinação de cobertura extra:
- bacon e pepperoni
- bacon e queijo
- bacon e cogumelo
- bacon, cogumelo e queijo
- ...

Percebe a complexidade e dificuldade que esse código pode se tornar conforme o projeto for crescendo e novas coberturas extras sejam implementadas?

## Como o Decorator resolve esse problema?

... 

🏗️🏗️🏗️ Em construção
