import java.util.Scanner;

public class ExpenseTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Expense Tracker");

        System.out.print("Enter expense amount: ");
        int amount = sc.nextInt();

        sc.nextLine(); // consume leftover newline

        System.out.print("Enter expense category: ");
        String category = sc.nextLine();

        System.out.println("\nExpense Added Successfully!");
        System.out.println("Category: " + category);
        System.out.println("Amount: " + amount);

        System.out.println("\nTotal Expenses: " + amount);

        sc.close();
    }
}
