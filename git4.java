
import java.util.Scanner;

public class git4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the name and age:");
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("\nName: " + name + " Age: " + age);

        System.out.println("\nEnter the values for a, b, c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = a * b * c;

        System.out.println("Total value: " + d);

        sc.nextLine();

        System.out.println("\nEnter the name, score, department:");
        String Name = sc.nextLine();
        int Score = sc.nextInt();
        sc.nextLine();
        String Dept = sc.nextLine();

        System.out.println("\nName: " + Name +
                " Score: " + Score / 10 +
                " Department: " + Dept);

        sc.close();
    }
}
