# DECORATOR

O padrão de projeto Decorator permite adicionar comportamentos a um objeto dinamicamente, ou seja, o objeto receberá comportamentos e valores diferentes em tempo de **execução**.
Para entender como isso funciona, vamos ver um problema em que podemos usar esse padrão de projeto.

## Problema

Imagine que você está criando um sistema para uma pizzaria em que, ao fazer o pedido de uma pizza, o cliente pode escolher coberturas extras como Pepperoni, queijo e cogumelo. Obviamente, cada cobertura tem um valor diferente que deve ser adicionado ao valor total da pizza, e na descrição do pedido deve conter qual é a cobertura extra escolhida.

Sem o padrão Decorator, você criaria uma subclasse da classe pizza para representar cada cobertura extra que pode ser adicionada:

<div>
  <img  src="https://github.com/Jottinha/design-patterns/assets/69482936/9db07bb7-49cf-41ee-88b2-e1f2a92611bd" page"  width="600"  height="300">
</div>

Porém, sabemos que nem sempre o cliente vai escolher apenas uma cobertura extra. Dessa forma seriamos obrigados a criar subclasses para combinação de cobertura que o cliente decida acrescentar no pedido, observe como seu código ficaria complexo e difícil de dar manutenção.

<div>
  <img  src="https://github.com/Jottinha/design-patterns/assets/69482936/9e216200-c694-4795-87ab-49e64473beca" page"  width="600"  height="300">
</div>

Abaixo, observe agora como ficaria meu codigo principal (main):

<div>
  <img  src="https://github.com/Jottinha/design-patterns/assets/69482936/7cc806ae-ee1e-4580-b9f7-61155f5a2cb7" page"  width="600"  height="300">
</div>

Para cada recheio estamos declarando uma nova subclasse e isso iria escalar de uma forma problematica com a adição de novos recheios.

Agora, imagine que peçam para você colocar também uma cobertura extra de bacon.

Você teria que criar subclasses para cada combinação da nova cobertura:
- bacon e pepperoni
- bacon e queijo
- bacon e cogumelo
- bacon, cogumelo e queijo
- ...

Percebe a complexidade e dificuldade que esse código ficará conforme o projeto for crescendo e novas coberturas extras sejam implementadas?

## Como o Decorator resolve esse problema?

Primeiro precisamos definir um objeto principal que nós queremos que tenha comportamentos a mais conforme for rodando o programa, esse objeto no nosso cenário é a "Pizza comum", sem recheio.

<div>
  <img  src="https://github.com/Jottinha/design-patterns/assets/69482936/5e1cdee4-942a-4431-844f-bb37f9ba83ed" page"  width="600"  height="300">
</div>
(Criamos uma interface para ficar padronizado os metodos que toda pizza deve ter, descrição e valor).

<p></p> 
Agora precisamos criar uma clase decorator para servir como base para todos os recheios que forem adicionados, nomeamos essa classe como PizzaDecorator.
<div>
  <img  src="https://github.com/Jottinha/design-patterns/assets/69482936/f6b7191e-afd3-4470-aef1-6307b715d5d4" page"  width="600"  height="300">
</div>

Agora criaremos recheios que serão representado com subclasses da **PizzaDecorator**.

<div>
  <img  src="https://github.com/Jottinha/design-patterns/assets/69482936/95f1b802-bb1f-4fd5-8d2b-ab3e0309201a" page"  width="600"  height="300">
</div>

Dessa forma quando tiver mais de um recheio na pizza seu codigo ficará menos complexo e mais facil de ser implementado.

Vamos ver na pratica?

Observe meu codigo principal(Main):

<div>
  <img  src="https://github.com/Jottinha/design-patterns/assets/69482936/40fd16bc-5c5d-4a4c-9cdf-eadf48748bbf" page"  width="600"  height="250">
</div>

Usando esse padrão você adiciona uma cobertura na pizza no mesmo objeto que recebeu a "Pizza comum".

Dessa forma o valor e a descrição da pizza será adicionado de forma dinamica:

<div>
  <img  src="https://github.com/Jottinha/design-patterns/assets/69482936/d91f6863-31a5-4110-b90e-88636696a253" page"  width="600"  height="150">
</div>

Mas e se o cliente decidir colocar mais de um recheio? Precisamos criar novas combinações igual anteriormente? 
Não! Você não precisa criar uma classe para cada cobinação.

<div>
  <img  src="https://github.com/Jottinha/design-patterns/assets/69482936/1c30a9bc-c2ed-4a9d-b9fd-a4b206b78b5f" page"  width="600"  height="250">
</div>

Basta adicionar tudo no mesmo objeto criado no principio.
A descrição e o custo da pizza vão ser adicionados de forma dinamica.

<div>
  <img  src="https://github.com/Jottinha/design-patterns/assets/69482936/08e3d160-e46c-4996-8a85-2844fe9bf051" page"  width="600"  height="150">
</div>

Dessa forma, nosso projeto conseguira acrescentar funcionalidades ao objeto durante a execução.
Sem contar que o codigo continuará simples e facil de implementar novas funcionalidades com o tempo.

Caso queira entender melhor e testar no codigo faz clone do projeto.

... 

🏗️🏗️🏗️ Em construção
