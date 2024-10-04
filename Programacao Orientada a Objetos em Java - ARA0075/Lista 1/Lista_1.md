Parte I - QUESTÕES DISCURSIVAS
1. O que é encapsulamento em POO e por que é importante? Dê um exemplo de
  encapsulamento em Java.

2. Cite as principais características da Programação Orientada a Objetos.
   
3. Qual a diferença entre classes e objetos em POO?
   
4. Explique a diferença entre herança e polimorfismo em POO.
   
5. Explique qual a importância da Programação Orientada a Objetos no desenvolvimento
de Software.

Parte II – Aplicando os Pilares de POO em Java
HERANÇA

1. Desenvolva uma classe Animal com os atributos nome e idade. Em seguida, crie as classes
  Cachorro, Gato e Passaro que herdam de Animal e acrescentam um atributo específico de
  cada classe (raca para Cachorro, corPelo para Gato e tipoBico para Passaro).

2. Elabore uma classe Pessoa com os atributos nome e idade. Em seguida, crie as classes
  Funcionario e Cliente que herdam de Pessoa e acrescentam um atributo específico de cada
  classe (salario para Funcionario e codigo para Cliente).

3. Crie uma classe Conta com os atributos número e saldo. Em seguida, crie as classes
  ContaCorrente e ContaPoupanca que herdam de Conta e acrescentam um atributo
  específico de cada classe (limite para ContaCorrente e taxaRendimento para
  ContaPoupanca).

ENCAPSULAMENTO

4. Desenvolva uma classe Carro que possui dois atributos privados modelo e ano,
  encapsulados. Os métodos set validam os valores atribuídos, garantindo que o modelo não
  seja nulo e que o ano seja maior do que 1900.

5. Elabore em Java uma classe ContaBancaria que possui dois atributos privados saldo e
  limite encapsulados com métodos get e set. Os métodos set validam os valores atribuídos,
  garantindo que o saldo não seja negativo e que o limite seja maior do que zero.

POLIMORFISMO

6. Desenvolva em Java uma classe Animal com um método emitirSom. As classes Cachorro,
  Gato e Cavalo estendem a classe Animal e sobrescrevem o método emitirSom para que seja
  executado de forma diferente em cada uma dessas classes.

        POO COMPLETO: ABSTRAÇÃO, ENCAPSULAMENTO, HERANÇA E POLIMORFISMO

7. A classe Pessoa é a classe base que contém informações comuns a todos os objetos do
  tipo pessoa. A classe Aluno herda da classe Pessoa e adiciona uma propriedade matricula. A
  classe Professor também herda da classe Pessoa e adiciona uma propriedade disciplina.
  Ambas as classes filhas sobrescrevem o método exibirDados para exibir informações
  adicionais específicas de cada classe.
