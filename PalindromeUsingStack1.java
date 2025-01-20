import java.util.Stack;

public class PalindromeUsingStack1 {
    public static void main(String[] args) {
        String str = "madam";
        System.out.print(Palindrome(str) ? "palindrome String " : "Not palindrome String");
    }

    private static boolean Palindrome(String str) {
        Stack<Character> stack = new Stack();
        for (char ch : str.toCharArray())
            stack.push(ch);

        for (char ch : str.toCharArray()) {
            if (ch != stack.pop())
                return false;
        }
        return true;
    }
}
