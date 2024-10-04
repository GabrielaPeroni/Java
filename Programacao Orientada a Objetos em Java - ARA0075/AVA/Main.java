// Questao 1_a
import java.util.Scanner;

public class Main {
  public static class Pessoa{
    private String nome;
    private int idade;
    private double salario;
    
  public String getNome(){
    return nome;
  }
   private void setNome (String nome){
      this.nome = nome;
  }
  //-------------------------------------
  public int getIdade(){
    return idade;
  }
  private void setIdade (int idade){
    this.idade = idade;
  }
  //-------------------------------------
  public double getSalario(){
    return salario;
  }
  private void setSalario (double salario){
    this.salario = salario;
  }
  //-------------------------------------
  public void salarioAnual(double salario){
    double salarioAnual = salario * 12;
    System.out.printf("\nSalario Anual: %.2f", salarioAnual);
  } 
    
  public double reajusteSalario(double salario){
    double reajuste;
    reajuste = (salario * 0.15) + salario;

    System.out.printf("\nSalario reajustado: %.2f", reajuste);
    return reajuste;
  }
    
  public void reajusteAnual(double salario){
    double reajusteAnual = ((salario * 0.15) + salario) * 12;
    System.out.printf("\nSalario reajustado: %.2f", reajusteAnual);
  }
}
    
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    Pessoa pessoa = new Pessoa();
  
    System.out.println("\n-=-Informe os Dados-=-\n\n");
  
    System.out.print("Nome: ");
    pessoa.setNome( ler.next());

    System.out.print("Idade: ");
    pessoa.setIdade( ler.nextInt());

    System.out.print("Salario: ");
    pessoa.setSalario( ler.nextFloat());
  
    System.out.print("\n=------------------------------=");
    System.out.print("\nDigite o input desejado:");
    System.out.print("\n1 - Salario Pré-reajuste");
    System.out.print("\n2 - Salario Pós-reajuste\n\n");

    int num = (ler.nextInt());

    switch(num){
      case 1:
        System.out.printf("\nSalario: %.2f",pessoa.getSalario());
        pessoa.salarioAnual(pessoa.getSalario());

      break;

      case 2:
        pessoa.reajusteSalario(pessoa.getSalario());
        pessoa.reajusteAnual(pessoa.getSalario());
      break;
        
    default:
        System.out.printf("\nOpção inválida");
          break;
    }
  }
}
// Questao 1_b
import java.util.Scanner;

public class Main {
  public static class Tributavel {
    String nome_tributo;
    String tipo;
    double valor;
  }

  public static class GerenciadorDeImpostoDeRenda {
    public String nome;
    public Tributavel[] tributavel_vetor;

    public GerenciadorDeImpostoDeRenda() {
      tributavel_vetor = new Tributavel[3];
    }

    public void adicionar(Tributavel tributavel) {
      for (int i = 0; i < tributavel_vetor.length; i++) {
        if (tributavel_vetor[i] == null) {
          tributavel_vetor[i] = tributavel;
          break;
        }
      }
    }
    
    public double impostoTotal() {
      double impostoTotal = 0;

      for (int i = 0; i < tributavel_vetor.length; i++) {
        if (tributavel_vetor[i] != null) {
          impostoTotal += tributavel_vetor[i].valor;
        }
      }
      return impostoTotal;
    }
  }

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
    
    for (int i = 0; i < 3; i++) {
      Tributavel tributavel = new Tributavel();
      System.out.println("\n");
      
      System.out.printf("Nome: ");
      tributavel.nome_tributo = ler.next();

      System.out.printf("Tipo: ");
      tributavel.tipo = ler.next();

      System.out.printf("Valor: R$");
      tributavel.valor = ler.nextDouble();

      System.out.println("\n------------------------");

      gerenciador.adicionar(tributavel);
    }
    double totalImposto = gerenciador.impostoTotal();
    System.out.println("\nTotal de imposto: R$" + totalImposto);
  }
}
// Questao 2_a
import java.util.Scanner;

//Letra A
public class Main {
  public static interface AreaCalculavel {
    double calculaArea();
  }

  // Letra B
  public static class Quadrado implements AreaCalculavel {
    int lado;

    public Quadrado(int lado) {
      this.lado = lado;
    }

    public double calculaArea() {
      return this.lado * this.lado;
    }
  }

  public static class Retangulo implements AreaCalculavel {
    int base;
    int altura;

    public Retangulo(int base, int altura) {
      this.base = base;
      this.altura = altura;
    }

    public double calculaArea() {
      return this.base * this.altura;
    }
  }

  public static class Circulo implements AreaCalculavel {
    int raio;

    public Circulo(int raio) {
      this.raio = raio;
    }

    public double calculaArea() {
      return this.raio * this.raio * Math.PI;
    }
  }

  // Letra C
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    AreaCalculavel vetor[] = new AreaCalculavel[6];

    for (int i = 0; i < vetor.length; i++) {
      System.out.println("\n\n----------------------------------------");
      System.out.printf("Informe os dados da %dº figura geometrica.\n\n", i + 1);
      System.out.println("1 - Quadrado\n");
      System.out.println("2 - Retângulo\n");
      System.out.println("3 - Círculo\n");
      System.out.printf("\nEscolha:");

      int opcao = ler.nextInt();
      switch (opcao) {
        case 1:
          System.out.println("\n\nInforme dos dados do Quadrado");
          System.out.printf("Lado: ");
          int lado = ler.nextInt();

          vetor[i] = new Quadrado(lado);
          break;

        case 2:
          System.out.println("\n\nInforme dos dados do retangulo ");
          System.out.printf("base: ");
          int base = ler.nextInt();
          System.out.printf("altura: ");
          int altura = ler.nextInt();

          vetor[i] = new Retangulo(base, altura);
          break;

        case 3:
          System.out.println("\n\nInforme dos dados do Circulo");
          System.out.printf("raio: ");
          int raio = ler.nextInt();

          vetor[i] = new Circulo(raio);
          break;

        default:

          i--;
          break;
      }
    }
    for (int i = 0; i < vetor.length; i++) {
      System.out.printf("\nA area da %dº figura geometrica: %.2f\n\n", i + 1, vetor[i].calculaArea());
    }
  }
}
// Questao 3_a
public class Main {
  public static void main(String[] args){
  
    System.out.println("Inicio do main");
    metodo1();
    System.out.println("fim do main");
  }
  static void metodo1(){
    System.out.println("Inicio do metodo1");
    metodo2();
    System.out.println("Fim do metodo1");
  }
    
  static void metodo2(){
    try{
    System.out.println("inicio do metodo2");
    int[] array = new int [10];
    for(int i = 0; i<= 15;i++){
      array[i] = 1;
      System.out.println(i);
    }
    }catch(ArrayIndexOutOfBoundsException error){
      System.out.println("Erro: "+error.getMessage());
    }
    System.out.println("Fim do metodo2");
  }
}
