import java.util.Stack;

public class PostFixEvaltion {
    public static void main(String[] args) {
        String PostFixExpression = "58*4/3+2-";
        int result = evaluate(PostFixExpression);
        System.out.println(result);
    }

    private static int evaluate(String postFixExpression) {
        Stack<Integer> stack = new Stack();

        for (char ch : postFixExpression.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
                continue;
            }
            int pop2 = stack.pop();
            int pop1 = stack.pop();

            switch (ch) {
                case '+':
                    stack.push(pop1 + pop2);
                    break;
                case '-':
                    stack.push(pop1 + pop2);
                    break;
                case '*':
                    stack.push(pop1 + pop2);
                    break;
                case '/':
                    stack.push(pop1 + pop2);
                    break;
            }
        }
        return stack.pop();
    }
}
