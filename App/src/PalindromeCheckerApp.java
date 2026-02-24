import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args)
    {
        Scanner scnr=new Scanner(System.in);
        System.out.print("Input text:");
        String str=scnr.nextLine();
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }
        boolean isPalin=true;
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalin = false;
                break;
            }
        }
        System.out.print("\nIs it a palindrome? :"+isPalin);
    }
}
