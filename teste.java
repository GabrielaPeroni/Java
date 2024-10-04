public class Main { // Classe principal, logo NAO static
// Classe de chama "Main" pois o arquivo se chama "Main.java"
  
  public static class Gatos{ // Classe aninhada, logo é static
  // Classes devem ser nomeadas com inicial Maiuscula
  // Declarada classe "Gatos"
    public String nome;
    public int idade;
    public float peso;

  // Criando Objetos da classe "Gatos"
    Gatos(){
      System.out.println("Objeto criado !\n");
    }
  }
  // Construtor com o nome "Gatos"
  
  public void miar(){
    System.out.println("O gato miou\n");
  }

  public void comer(){
    System.out.println("O gato comeu\n");
  }

  public void dormir(){
    System.out.println("O gato dormiu\n");
  }
  
  // Declarado Metodos da classe "Gatos"
  
  public static void main(String[] args) {
  // ^ Precisa disso se nao o codigo nao roda lol

    Gatos gato_1 = new Gatos();
      gato_1.nome = "gato um";// String
      gato_1.idade =11;// Int
      gato_1.peso = 10;// Float

    Gatos gato_2 = new Gatos();
      gato_2.nome = "gato dois";// String
      gato_2.idade = 12;// Int
      gato_2.peso = 10;// Float

    Gatos gato_3 = new Gatos();
      gato_3.nome = "gato tres";// String
      gato_3.idade = 13;// Int
      gato_3.peso = 10;// Float

  // Criando Construtores da classe "Gatos"
  // Construtores (Inicializador) tem o mesmo "nome" que a classe, e nao retornam (void)
  // Definindo instancias baseado nos Objetos da classe "Gatos"
    
  //System.out.println("Codigo rodou."); <- confirmar coisas nao impressas
  }
}

import java.util.Scanner; // Importando a biblioteca "Scanner" para ler input do usuario no console

public class ClasseObjetos{
    public static class Conta{ // Declarando os atributos da classe "Conta"

      public String nome;
      public int agencia;
      public long num_conta; //para numeros longos
      public double saldo; // Subistitui Float, java odeia Float entao se usa Double
      
    Conta(){
      System.out.println("Objeto criado !\n"); // Construtor/ Inicializador de objetos
    }
  } 
  public static void main (String[] args){
    Scanner ler = new Scanner(System.in);// Criando o objeto de Scanner(Scanf) chamado "ler" (aqui voce declara que ele vai ler o input)
    Conta clientes [] = new Conta [4];// Criando o vetor "clientes" de tamanho [4], instancia da classe "Conta"

    
    for (int i = 0; i < clientes.length; i++){// Loop pra criar o vetor
      clientes[i] = new Conta();// Criando uma instancia para cada slot do vetor
    }

    for (int i = 0; i < clientes.length; i++){// Loop pra preencher o vetor
      System.out.printf("\nDados do %d cliente \n\n", i+1);// Dados do 1/2/3/4 cliente

      System.out.printf("Informe o nome do cliente: ");
      clientes[i].nome = ler.next();// Lendo o "nome" do "clientes", é lido pelo scanner "ler" (aqui voce pede o input "nome")
      // ler.next porqueo tipo de input é string

      System.out.printf("Informe a agencia do cliente: ");
      clientes[i].agencia = ler.nextInt();// (aqui voce pede o input "agencia")
      // ler.nextInt porque o tipo de input é Int

      System.out.printf("Informe o numero da conta do cliente: ");
      clientes[i].num_conta = ler.nextInt();// (aqui voce pede o input "num_conta")
      // ler.nextInt porque o tipo de input é long (conta como Int)

      System.out.printf("Informe o saldo do cliente: ");
      clientes[i].saldo = ler.nextDouble();// (aqui voce pede o input "saldo")
      // ler.nextInt porque o tipo de input é Double (funciona como float)
    }

    for (int i = 0; i < clientes.length; i++){
      System.out.printf("Dados do Cliente:\n\n");

      System.out.printf("Nome: %s\n", clientes[i].nome);// Imprime o nome digitado
      System.out.printf("Agencia: %d\n",clientes[i].saldo);// Imprime a agencia digitado
      System.out.printf("Cadastro: %d\n",clientes[i].num_conta);// Imprime o num_conta digitado
      System.out.printf("Saldo: %f\n", clientes[i].saldo);// Imprime o saldo digitado
    }
   }
  }
