import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args)
    {
        Scanner scnr=new Scanner(System.in);
        System.out.print("Input text:");
        String str=scnr.nextLine();
        Stack<Character> stack=new Stack<>();
        for(char c:str.toCharArray()) {
            stack.push(c);
        }
        boolean isPalin=true;
        for(char c:str.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.print("\nIs it a palindrome? :"+isPalin);
    }
}
