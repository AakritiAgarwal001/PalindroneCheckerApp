import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args)
    {
        Scanner scnr=new Scanner(System.in);
        System.out.print("Input text:");
        String str=scnr.nextLine();
        String a="";
        for(int i=str.length()-1;i>=0; i--)
        {
            a+=str.charAt(i);
        }
        System.out.print("\nIs it a palindrome? :");
        if(a.equals(str))
            System.out.println(" true");
        else
            System.out.println(" false");
    }
}
