import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
       
        String name=scanner.nextLine();
        System.out.print("Enter your age: ");


        int age=scanner.nextInt();
        System.out.println("-----");
        System.out.println("Hello dear,"+name);
        System.out.println("you are,"+age+"years");
        scanner.close();
    




    }
}
