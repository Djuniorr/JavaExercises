import java.util.Scanner;

public class exercice2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float volume, length, width, height;
        System.out.println("Enter to length value");
        length = keyboard.nextFloat();
        System.out.println("Enter to width value");
        width = keyboard.nextFloat();
        System.out.println("Enter to height value");
        height = keyboard.nextFloat();

        volume= length *width * height;
        System.out.println("The volume value is: " + volume);
    }
}