import java.util.Scanner;

public class EndsWithA 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input");
        String str = sc.nextLine();
      
        if (str.endsWith("a") || str.endsWith("A"))
        {
            System.out.println("Its ends with the word a");
        } 
        else 
        {
            System.out.println("Its not ends with the word a");
        }
    }
}