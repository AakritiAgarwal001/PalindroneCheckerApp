import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args)
    {
        Scanner scnr=new Scanner(System.in);
        System.out.print("Input text:");
        String str=scnr.nextLine();
        LinkedList<Character> list = new LinkedList<>();
        for (char c : str.toCharArray()) {
            list.addLast(c);
        }
        boolean isPalin=true;
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalin = false;
                break;
            }
        }
        System.out.print("\nIs it a palindrome? :"+isPalin);
    }
}
