import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;
public class PalindromeCheckerApp {
    public static String normalize(String input) {
        return input.replaceAll("\\s+", "").toLowerCase();
    }
    public static boolean checkUsingReverse(String input) {
        String str = normalize(input);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
    public static boolean checkUsingStack(String input) {
        String str = normalize(input);
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return str.equals(reversed.toString());
    }
    public static boolean checkUsingDeque(String input) {
        String str = normalize(input);
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            deque.add(str.charAt(i));
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        long start1 = System.nanoTime();
        boolean result1 = checkUsingReverse(input);
        long end1 = System.nanoTime();
        long start2 = System.nanoTime();
        boolean result2 = checkUsingStack(input);
        long end2 = System.nanoTime();
        long start3 = System.nanoTime();
        boolean result3 = checkUsingDeque(input);
        long end3 = System.nanoTime();
        System.out.println("Palindrome Check Results:");
        System.out.println("Reverse Method: " + result1 + " | Time: " + (end1 - start1) + " ns");
        System.out.println("Stack Method: " + result2 + " | Time: " + (end2 - start2) + " ns");
        System.out.println("Deque Method: " + result3 + " | Time: " + (end3 - start3) + " ns");
        sc.close();
    }
}