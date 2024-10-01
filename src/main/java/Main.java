import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random gerador = new Random();

    int x = gerador.nextInt(100);

    Scanner entrada = new Scanner(System.in);
    System.out.println("Adivinhe o número que estou pensando");
    int numero = entrada.nextInt();

    if (numero == x) {
      System.out.println("Parabens você acertou o numero que eu pensei foi o :" + x);
    } else {
      System.out.println("você errou, o numero que eu pensei foi o :" + x);
    }

    int a = 41;
    int b = 9;
    int aux;

    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }

    System.out.println("O valor da variável a é: " + a);
    System.out.println("O valor da variável b é: " + b);
  }

  int ano = 2000;

  if(((ano%4)==0&&(ano%100)==0)&&((ano%400)==0))
  {

    System.out.println("Ano bissexto");

  }else
  {

    System.out.println("Ano não é bissexto");

  }
  String txt = "João";

  if(txt!="Maria")
  {
    System.out.println(txt + "seu acesso não está autorizado");
  }else
  {
    System.out.println(txt + "seu acesso foi autorizado");
    System.out.println("...");

  }

  String valorA = "true";
  boolean valorB = true;
  boolean valorC = true;

  if(valorA=="true")
  {
    System.out.println("Valor da variável valorA é true");
  }

  if(valorB==true)
  {

    System.out.println("Valor da variável valorB é true");
  }if(valorC)
  {
    System.out.println("Valor da variável C é false");
  }
}

// t
// void addition() {
// assertEquals(2, 1 + 1);
// }
}