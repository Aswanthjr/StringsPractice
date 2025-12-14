import java.util.Scanner;

public class PalindromeString 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

       
        String str = sc.nextLine();
        String reverse = "";

        
        for (int i = str.length() - 1; i >= 0; i--) 
        {
            reverse = reverse + str.charAt(i);
        }

         
        if (str.equalsIgnoreCase(reverse)) 
        {
            System.out.println("It is a palindrome");
        } 
        else 
        {
            System.out.println("It is not a palindrome");
        }
    }
}