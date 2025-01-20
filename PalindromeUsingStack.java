import java.util.Stack;
 
public class PalindromeUsingStack {
    public static void main(String[] args) {
        String str="mom";
        Stack<Character>stack=new Stack();

        for(char ch:str.toCharArray())
            stack.push(ch);
     
        int flag=0;
        for(char ch:str.toCharArray())
        {
            char z=stack.pop();
            if(ch!=z)
            {
               flag = 1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.print("Not Palindrome..!!");
        }
        else
        {
            System.out.print("Palindrome..!!");
        }

    }
}
