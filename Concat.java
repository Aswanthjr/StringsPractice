import java.util.Scanner;

public class StringConcat 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the FirstName");
        String firstName = sc.nextLine();

        System.out.println("Enter the SecondName");
        String secondName = sc.nextLine();

        
        String fullName = firstName + " " + secondName;

        System.out.println(fullName);
    }
}