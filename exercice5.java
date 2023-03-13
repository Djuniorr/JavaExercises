
    import java.util.Scanner;

    public class exercice5 

{

     public static void main(String[] args)

     {

          Scanner teclado=new Scanner (System.in);

          int valor1, valor2, soma, subtracao, multiplicacao, divisao;

          System.out.println("Digite o valor 1");

          valor1=teclado.nextInt();

          System.out.println("Digite o valor 2");

          valor2=teclado.nextInt();

          multiplicacao=valor1*valor2;

          System.out.println("A multiplicação é igual a " + multiplicacao);

     }

}

