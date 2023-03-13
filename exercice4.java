
    import java.util.Scanner;

    public class exercice4

{

            public static void main(String[] args)

            {

                   Scanner teclado=new Scanner(System.in);

                   float nota1,nota2,nota3,media;

                   System.out.println("Digite a nota 1");

                   nota1=teclado.nextFloat();

                   System.out.println("Digite a nota 2");

                   nota2=teclado.nextFloat();

                   System.out.println("Digite a nota 3");

                   nota3=teclado.nextFloat();

                   media=nota1+(nota2+nota3)/3;

                   System.out.println("Média: " + media);

            }

}

