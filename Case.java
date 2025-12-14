import java.util.Scanner;

public class CaseConversion 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the input");
        String str = sc.nextLine();

        
        System.out.println("Press 1 for uppercase");
        System.out.println("Press 2 for Lower Case");
        int choice = sc.nextInt();

       
        if (choice == 1) 
        {
            System.out.println(str.toUpperCase());
        } 
        else if (choice == 2) 
        {
            System.out.println(str.toLowerCase());
        } 
        else 
        {
            System.out.println("Invalid Choice");
        }
    }
}