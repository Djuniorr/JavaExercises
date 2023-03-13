import java.util.Scanner;

public class exercice1{
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float base,height,area;
        System.out.println("Enter to base value");
        base = keyboard.nextFloat();
        System.out.println("Enter to height value");
        height= keyboard.nextFloat();
        area=(base*height) / 2;

        System.out.println("The value of area " + area);
    }
}