import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args)
    {
        Scanner scnr=new Scanner(System.in);
        System.out.print("Input text:");
        String str=scnr.nextLine();
        char c[]=str.toCharArray();
        int start=0;
        int end=c.length-1;
        boolean isPalin=true;
        while(start<end)
        {
            if(c[start]!=c[end])
                isPalin=false;
            start++;
            end--;
        }
        System.out.print("\nIs it a palindrome? :"+isPalin);
    }
}
