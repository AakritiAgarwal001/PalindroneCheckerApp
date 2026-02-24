import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args)
    {
        Scanner scnr=new Scanner(System.in);
        System.out.print("Input text:");
        String str=scnr.nextLine();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            queue.add(c);     // FIFO
            stack.push(c);    // LIFO
        }
        boolean isPalin=true;
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalin = false;
                break;
            }
        }
        System.out.print("\nIs it a palindrome? :"+isPalin);
    }
}
