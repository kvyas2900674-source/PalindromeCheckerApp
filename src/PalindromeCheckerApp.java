import java.util.*;

public class UC7_DequeMethod {

    public static void main(String[] args) {

        String input = "refer";

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {

            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("UC7 Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
