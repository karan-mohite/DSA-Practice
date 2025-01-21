import java.util.Stack;

public class ParenthesisMatchingUsingStack {
    public static void main(String[] args) {
        String expression = "{[()]}";
        if (expression.length() % 2 == 0) {
            boolean result = checkValidness(expression);

            if (result == true) {
                System.out.print("Well formed..!!");
            } else {
                System.out.print("Not well formed");
            }
        } else {
            System.out.print("Not well formed..!!");
        }

    }

    private static boolean checkValidness(String expression) {

        Stack<Character> stack = new Stack();

        for (char ch : expression.toCharArray()) {
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            char z;
            switch (ch) {
                case '}':
                    z = stack.pop();
                    if (z != '{')
                        return false;
                    break;
                case ']':
                    z = stack.pop();
                    if (z != '[')
                        return false;
                    break;
                case ')':
                    z = stack.pop();
                    if (z != '(')
                        return false;
            }
        }
        return (stack.isEmpty());
    }
}
