import java.util.Scanner;
public class exercice6 {
    
    /**
     * @param args
     */
    public void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 

        Float ze, chico ; 
        int anos = 0;
        chico=(float)1.50;
        ze=(float)1.10;

        do
         {
            ze = ze + 3;
            chico = chico + 2;
          anos++;      

        }while(ze > chico);
        {
            System.out.println("Zé vai demorar " + anos + "Para ser maior que Chico !!!");
        }
    }
}
