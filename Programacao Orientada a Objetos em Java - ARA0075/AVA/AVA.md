> 1. Gerenciando Classes e Métodos
   
  a) Desenvolva uma classe Pessoa que tenha como atributo nome, idade e salário e possua um método
    para calcular o salário anual da pessoa e um reajuste de 15% no salário mensal. Os atributos devem
    estar encapsulados.
  
  b) Desenvolva um GerenciadorDeImpostoDeRenda, que recebe todos os tributáveis de uma pessoa e
    soma seus valores e inclua nele um método para devolver seu total. Essa classe deve ter um atributo
    para calcular a soma total dos tributos e um método adicionar(Tributavel) que recebe como
    parâmetro um Tributavel e soma os tributos dele ao total. 
    Crie um main para instanciar diversas classes que implementam Tributavel e passar como argumento para um 
    GerenciadorDeImpostoDeRenda.Repare que você não pode passar qualquer tipo de conta para o método adiciona,
    apenas as que implementam Tributavel.

> 2. Interfaces
   
  a) Desenvolva um projeto interfaces e crie a interface AreaCalculavel com o método calculaArea() -
    sem parâmetros e que retorna um double.
  
  b) Deseja-se criar algumas classes que implementam AreaCalculavel:
  
        I. Quadrado: possui um atributo lado.
        II. Retangulo: possui os atributos base e altura.
        III. Circulo: possui o atributo raio.
  
  c) Crie uma classe de Teste. No método main crie um vetor de 6 posições que contém alguns objetos
    do tipo AreaCalculavel. Logo após, percorra esse vetor imprimindo a área de cada objeto.

> 3. Tratamento de Exceção.
   
  a) O código em Java abaixo lança uma exceção (propositalmente) e interrompe sua execução.
    Utilizando o tratamento de exceções, corrija a classe com o objetivo de não parar sua execução.
    
    public static void main(String[] args) { 
      System.out.println("inicio do main");
      metodol():
      System.out.println("fim do main");
    }
    static void metodol() {
      System.out.println("inicio do metodol");
      metodo2();
      System.out.println("fim do metodol");
    }
    static void metodo2() {
      System.out.println("inicio do metodo2");
      int[] array = new int[10];
      for (int i=0; i <= 15; i++) {
        array[1] = 1;
        System.out.println(i);
      }
      System.out.println("fim do metodo2");
    }
  
  Objetivo: Diagnóstico dos conceitos aplicados e Teorização com implementação em Java.
