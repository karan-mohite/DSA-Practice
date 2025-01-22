import java.util.Stack;

public class PreFixEvalution {

        public static void main(String[] args) {
        String PreFixExpression = "-+/*58432";
        int result = evaluate(PreFixExpression);
        System.out.println(result);
    }

    private static int evaluate(String PreFixEvalution) {
        Stack<Integer> stack = new Stack();

        for (char ch : PreFixEvalution.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
                continue;
            }
            int pop1 = stack.pop();
            int pop2 = stack.pop();

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
 
