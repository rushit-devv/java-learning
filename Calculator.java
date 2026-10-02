import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        int choice;

        System.out.println("--Calculator--");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter the first number: ");
        num1 = scan.nextInt();

        System.out.print("Enter the second number: ");
        num2 = scan.nextInt();

        System.out.print("Enter your choice: ");
        choice = scan.nextInt();

        if(choice == 1){
            System.out.println("The addition of numbers is " + (num1 + num2));
        }

        else if(choice == 2){
            System.out.println("The subtraction of numbers is " + (num1 - num2));
        }

        else if(choice == 3){
            System.out.println("The multiplication of numbers is " + (num1 * num2));
        }

        else if(choice == 4){
            if(num2 == 0){
                System.out.println("Division by zero is not possible.");
            }
            else{
            System.out.println("The division of numbers is " + (num1/num2));
            }
        }

        else{
            System.out.println("Invalid Operator.");
        }

        scan.close();
    }
}
