public class Main {
  
  public static class Gatos {// Classes sempre tem inicial maiuscula AAA
    public String nome;// Atributos / caracteristicas da classe
    public String raca;// Atributos
    public float peso;// Atributos
    // ^^^ Metodos sempre sao letra minuscula aaa

  public void miar(){// Metodos / comportamento da classe
    //meow
  }
  public void comer(){// Metodos
    //nom nom
  }
  public void dormir(){// Metodos
    //zzz
  }
  }
  public static void main(String[] args) {
  Gatos gato1 = new Gatos();
  gato1.nome = "mew";
  gato1.raca = "Siames";
  gato1.peso = 5;

  Gatos gato2 = new Gatos();
  gato2.nome = "luna";
  gato2.raca = "Pardo";
  gato2.peso = 4;

  Gatos gato3 = new Gatos();
  gato3.nome = "Our lord and saviour jesus christ";
  gato3.raca = "Persa";
  gato3.peso = 5;

  }
}
