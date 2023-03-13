import java.util.Scanner;

public class exercice3 {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        double salaryBase, salary, bonus, discount;
        System.out.println("Salary Base: ");
        salaryBase = Keyboard.nextFloat();
        
        bonus = salaryBase * 0.20; 
        salaryBase = salaryBase + bonus;
        discount = Math.floor(salaryBase * 0.07);
        
        salary = salaryBase - discount;

        System.out.println("Salary Base: " + salaryBase);
        System.out.println("Discount: " + discount);
        System.out.println("Bonus: " + bonus);
        System.out.println("Salary: " + salary);
    }
}
