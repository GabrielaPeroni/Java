/*1. Encapsulamento são elementos no codigo que protegem a aplicação, evitando que partes do codigo sofram acessos indevidos;
   Assim são criados Métodos, que podem ser utilizados por qualquer classe sem impactar o codigo ao todo.

   Exemplo pratico de encapsulamento:
	public int getNum(){
	    return num; }
	public void setNum(int num){
	    this.num = num; }

2. Polimorfismo -> A capacidade de um objeto de diferentes classes responderem aos mesmos metodos, de maneiras unicas.
   Encapsulamento -> Limita acesso a especificos de uma classe, para proteger a integridade dos dados, e facilitar a manutenção do tal.
   Abstração -> Identificar caracteristicas essenciais de um objeto e ignorar redundancias.
   Herança -> Uma classe deriva caracteristicas de outra classe existente.

3. Classes definem um conjunto de atributos e métodos que descrevem um objeto;
   Já objetos, podem ser considerados como instancias de uma classe.

4. Herança permite a criação de uma classe com base em outra classe pré-existente;
   Polimorfismo permite que objetos de diferentes classes interajam com o mesmo metodo, com resultados diferentes.

5. A capacidade de modelar o mundo real de forma modular e precisa, facilitando sua manutenção e reutilização de código;
   POO promove a abstração, o polimorfismo, a herança e o encapsulamento de dados, simplificando o código e facilitando seu entedimento e compartilhamento.*/

// PARTE II
// CÓDIGO 1
import java.util.Scanner;
public class Main {
  public static class Animal {
    String nome;
    int idade;

    public Animal(String nome, int idade) {
      this.nome = nome;
      this.idade = idade;
    }
  }
  public static class Cachorro extends Animal {
    public String raca;

    public Cachorro(String nome, int idade, String raca) {
      super(nome, idade);
      this.raca = raca;
    }
  }
  public static class Gato extends Animal {
    public String corPelo;

    public Gato(String nome, int idade, String corPelo) {
      super(nome, idade);
      this.corPelo = corPelo;
    }
  }
  public static class Passaro extends Animal {
    public String tipoBico;

    public Passaro(String nome, int idade, String tipoBico) {
      super(nome, idade);
      this.tipoBico = tipoBico;
    }
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("--Digite o index desejado--\n");
    System.out.println("1 - Cachorro;\n");
    System.out.println("2 - Gato;\n");
    System.out.println("3 - Passaro;\n");

    System.out.printf("\nInput: ");
    int index = ler.nextInt();

    switch (index) {
      case 1:
        System.out.println("\n--Informe os dados do cachorro--\n\n");

        System.out.printf("Nome: ");
        String nomeCachorro = ler.next();

        System.out.printf("Idade: ");
        int idadeCachorro = ler.nextInt();

        System.out.printf("Raca: ");
        String racaCachorro = ler.next();
     
        Cachorro cachorro = new Cachorro(nomeCachorro, idadeCachorro, racaCachorro);

          System.out.printf("\n\n--CACHORRO--\n");

          System.out.printf("\n\nNome: %s", cachorro.nome);
          System.out.printf("\nIdade: %d", cachorro.idade);
          System.out.printf("\nRaca: %s", cachorro.raca);
        break;
      case 2:
        System.out.println("\n--Informe os dados do gato--\n\n");

        System.out.printf("Nome: ");
        String nomeGato = ler.next();

        System.out.printf("Idade: ");
        int idadeGato = ler.nextInt();

        System.out.printf("Cor do Pelo: ");
        String peloGato = ler.next();
        Gato gato = new Gato(nomeGato, idadeGato, peloGato);

          System.out.printf("\n\n--GATO--\n");

          System.out.printf("\n\nNome: %s", gato.nome);
          System.out.printf("\nIdade: %d", gato.idade);
          System.out.printf("\nCor do Pelo: %s", gato.corPelo);
        break;
      case 3:
        System.out.println("\n--Informe os dados do passaro--\n\n");

        System.out.printf("Nome: ");
        String nomePassaro = ler.next();

        System.out.printf("Idade: ");
        int idadePassaro = ler.nextInt();

        System.out.printf("Tamanho do Bico: ");
        String bicoPassaro = ler.next();
        Passaro passaro = new Passaro(nomePassaro, idadePassaro, bicoPassaro);

          System.out.printf("\n\n--PASSARO--\n");

          System.out.printf("\n\nNome: %s", passaro.nome);
          System.out.printf("\nIdade: %d", passaro.idade);
          System.out.printf("\nTipo do Bico: %s", passaro.tipoBico);
        break;
      default:
        System.out.println("Input invalido...");
        break;
    }
  }
}
// -----------------------------------------------------------------
//CÓDIGO 2
import java.util.Scanner;
public class Main {
  public static class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
      this.nome = nome;
      this.idade = idade;
    }
  }

  public static class Funcionario extends Pessoa {
    public double salario;

    public Funcionario(String nome, int idade, double salario) {
      super(nome, idade);
      this.salario = salario;
    }
  }

  public static class Cliente extends Pessoa {
    public int codigo;

    public Cliente(String nome, int idade, int codigo) {
      super(nome, idade);
      this.codigo = codigo;
    }
  }

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("--Digite o index desejado--\n");
    System.out.println("1 - Funcionario;\n");
    System.out.println("2 - Cliente;\n");

    System.out.printf("\nInput: ");
    int index = ler.nextInt();

    switch (index) {
      case 1:
        System.out.println("\n--Informe os dados do Funcionario--\n\n");

        System.out.printf("Nome: ");
        String nomeFuncionario = ler.next();

        System.out.printf("Idade: ");
        int idadeFuncionario = ler.nextInt();

        System.out.printf("Salario: ");
        double salarioFuncionario = ler.nextDouble();
        
        Funcionario funcionario = new Funcionario(nomeFuncionario, idadeFuncionario, salarioFuncionario);

          System.out.printf("\n\n--FUNCIONARIO--\n");

          System.out.printf("\n\nNome: %s", funcionario.nome);
          System.out.printf("\nIdade: %d", funcionario.idade);
          System.out.printf("\nSalario: %.2f", funcionario.salario);
        break;
      case 2:
        System.out.println("\n--Informe os dados do cliente--\n\n");

        System.out.printf("Nome: ");
        String nomeCliente = ler.next();

        System.out.printf("Idade: ");
        int idadeCliente = ler.nextInt();

        System.out.printf("Codigo: ");
        int peloCliente = ler.nextInt();
        Cliente cliente = new Cliente(nomeCliente, idadeCliente, peloCliente);

          System.out.printf("\n\n--CLIENTE--\n");

          System.out.printf("\n\nNome: %s", cliente.nome);
          System.out.printf("\nIdade: %d", cliente.idade);
          System.out.printf("\nCodigo: %d", cliente.codigo);
        break;
      default:
        System.out.println("Input invalido...");
        break;
    }
  }
}
// -----------------------------------------------------------------
//CÓDIGO 3
import java.util.Scanner;
public class Main {
  public static class Conta {
    int numero;
    double saldo;

    public Conta(int numero, double saldo) {
      this.numero = numero;
      this.saldo = saldo;
    }
  }
  public static class contaCorrente extends Conta {
    public double limite;

    public contaCorrente(int numero, double saldo, double limite) {
      super(numero, saldo);
      this.limite = limite;
    }
  }
  public static class contaPoupanca extends Conta {
    public double taxaRendimento;

    public contaPoupanca(int numero, double saldo, double taxaRendimento) {
      super(numero, saldo);
      this.taxaRendimento = taxaRendimento;
    }
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("--Digite o index desejado--\n");
    System.out.println("1 - Conta Corrente;\n");
    System.out.println("2 - Conta Poupanca;\n");

    System.out.printf("\nInput: ");
    int index = ler.nextInt();

    switch (index) {
      case 1:
        System.out.println("\n--Informe os dados da Conta Corrente--\n\n");

        System.out.printf("Numero: ");
        int numeroCorrente = ler.nextInt();

        System.out.printf("Saldo: ");
        double saldoCorrente = ler.nextDouble();

        System.out.printf("Limite: ");
        double limiteCorrente = ler.nextDouble();
        
        contaCorrente funcionario = new contaCorrente(numeroCorrente, saldoCorrente, limiteCorrente);

          System.out.printf("\n\n--CONTA CORRENTE--\n");

          System.out.printf("\n\nNumero: %s", funcionario.numero);
          System.out.printf("\nSaldo: %.2f", funcionario.saldo);
          System.out.printf("\nLimite: %.2f", funcionario.limite);
        break;
      case 2:
        System.out.println("\n--Informe os dados da Conta Poupanca--\n\n");

        System.out.printf("Numero: ");
        int numeroPoupanca = ler.nextInt();

        System.out.printf("Saldo: ");
        double saldoPoupanca = ler.nextDouble();

        System.out.printf("Rendimento: ");
        double rendimentoPoupanca = ler.nextDouble();
        
        contaPoupanca cliente = new contaPoupanca(numeroPoupanca, saldoPoupanca, rendimentoPoupanca);

          System.out.printf("\n\n--CONTA POUPANCA--\n");

          System.out.printf("\n\nNumero: %s", cliente.numero);
          System.out.printf("\nSaldo: %.2f", cliente.saldo);
          System.out.printf("\nRendimento: %.2f", cliente.taxaRendimento);
        break;
      default:
        System.out.println("Input invalido...");
        break;
    }
  }
}
// -----------------------------------------------------------------
// ENCAPSULAMENTO
//CÓDIGO 4
import java.util.Scanner;
public class Main {
  public static class Carro{
    private String modelo;
    private int ano;
    
  public String getModelo(){
    return modelo;
  }
  private void setModelo (String modelo){
    if (modelo != null){
      this.modelo = modelo;
    }else{
      System.out.println("Modelo nao pode ser nulo, tente novamente...");
    }
  }
    public int getAno(){
      return ano;
    }
    private void setAno (int ano){
      if (ano < 1900){
        this.ano = ano;
      }else{
        System.out.println("\nAno nao pode ser superior a 1900, tente novamente...");
      }
    }
  } 
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    Carro carros = new Carro();
  
    System.out.println("\n--Informe os dados do Carro--\n\n");
  
      System.out.printf("Modelo: ");
      carros.setModelo( ler.next());

      System.out.printf("Ano: ");
      carros.setAno( ler.nextInt());
    
    System.out.println("\n\n-=-DADOS DO CARRO-=-\n");
  
    System.out.printf("\nModelo: %s",carros.getModelo());
    
    if (carros.getAno() != 0){
      System.out.printf("\nAno: %d",carros.getAno());
    }else{
      System.out.printf("\nAno Invalido...");
    }
  }
} 
// -----------------------------------------------------------------
//CÓDIGO 5
import java.util.Scanner;
public class Main {
  public static class ContaBancaria{
    private double saldo;
    private double limite;
 
  public double getSaldo(){
    return saldo;
  }
  private void setSaldo (double saldo){
    if(saldo >= 0){
      this.saldo = saldo;
    }else{ 
      System.out.println("\nSaldo negativo, tente novamente...\n");
    }
  }
    public double getLimite(){
      return limite;
    }
    private void setLimite (double limite){
     if(limite > 0){
      this.limite = limite;
    }else{ 
      System.out.println("\nLimite zerado, tente novamente...\n");
    }
  }
}
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    ContaBancaria conta = new ContaBancaria();
  
    System.out.println("\n-=-Informe os dados da Conta-=-\n\n");
  
      System.out.printf("Saldo: ");
      conta.setSaldo( ler.nextFloat());

      System.out.printf("Limite: ");
      conta.setLimite( ler.nextFloat());

    System.out.println("\n\n--=--DADOS--=--");
    if (conta.getSaldo() >= 0){
      System.out.printf("\nSaldo: %.2f",conta.getSaldo());
    }else{
      System.out.printf("\nSaldo invalido...");
    }
    
    if (conta.getLimite() > 0){
      System.out.printf("\nLimite: %.2f",conta.getLimite());
    }else{
      System.out.printf("\nLimite invalido...");
    }
  }
}
// -----------------------------------------------------------------
// POLIMORFISMO
//CÓDIGO 6
import java.util.Scanner;
public class Main {
  public static class Animal {
      public void emitirSom(){
    }
  }
    public static class Gato extends Animal {
      public void emitirSom() {
        System.out.println("\nEle mia!");
      }
    }
    public static class Cachorro extends Animal {
      public void emitirSom() {
        System.out.println("\nEle late!");
      }
    }
    public static class Cavalo extends Animal {
      public void emitirSom() {
        System.out.println("\nEle relincha!");
      }
    }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Animal animal;

  System.out.println("\n\n-=-Digite o Index-=-");
  System.out.println("\nGato -> 1 \nCachorro -> 2 \nCavalo -> 3");
  System.out.printf("\n\nInput: ");

  int confirmacao = ler.nextInt();

  switch (confirmacao) {
    case 1:// Gato
      animal = new Gato();
      break;
    case 2:// Cachorro
      animal = new Cachorro();
      break;
    case 3:// Cavalo
      animal = new Cavalo();
      break;
    default:
      System.out.println("Input invalido...");
      return;
    }
    animal.emitirSom();
  }
}
// -----------------------------------------------------------------
// POO COMPLETO
//CÓDIGO 7
import java.util.Scanner;
public class Main {
  public static class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade){
      this.nome = nome;
      this.idade = idade;
    }
    public String getNome(){
      return nome;
    }
    public void setNome(String nome){
      this.nome = nome;
    }
    public int getIdade(){
      return idade;
    }
    public void setIdade(int idade){
      this.idade = idade;
    }
    public void exibirDados(){
    }
  }
    public static class Aluno extends Pessoa {
      public int matricula;

      public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
      }
      public void exibirDados(){
        System.out.println("\n\n-=-DADOS DO ALUNO-=-\n");
        
        System.out.printf("\nNome: %s",this.getNome());
        System.out.printf("\nIdade: %d",this.getIdade());
        System.out.printf("\nMatricula: %d\n",this.matricula);
      }
    }
  public static class Professor extends Pessoa {
    public String disciplina;
    
    public Professor(String nome, int idade, String disciplina) {
      super(nome, idade);
      this.disciplina = disciplina;
    }
    public void exibirDados(){
      System.out.println("\n\n-=-DADOS DO PROFESSOR-=-\n");
      
      System.out.printf("\nNome: %s",this.getNome());
      System.out.printf("\nIdade: %d",this.getIdade());
      System.out.printf("\nDisciplina: %s\n",this.disciplina);
    }
  }
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

  System.out.println("\n-Informe os dados do Aluno-\n\n");

        System.out.printf("Nome: ");
        String nomeAluno = ler.next();

        System.out.printf("Idade: ");
        int IdadeAluno = ler.nextInt();

        System.out.printf("Matricula: ");
        int matriculaAluno = ler.nextInt();

  Aluno alunos = new Aluno(nomeAluno, IdadeAluno, matriculaAluno);

    System.out.println("\n-Informe os dados do Professor-\n\n");

        System.out.printf("Nome: ");
        String nomeProf = ler.next();

        System.out.printf("Idade: ");
        int idadeProf = ler.nextInt();

        System.out.printf("Disciplina: ");
        String discpProf = ler.next();

  Professor professores = new Professor(nomeProf, idadeProf, discpProf);

    alunos.exibirDados();
    professores.exibirDados();
  }
}
