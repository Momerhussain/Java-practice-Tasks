package pack1;
import java.util.*;
public class infix2 {
public static boolean Operator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '(' || c == ')';
    }
public static int getPrecedence(char ch) {
        switch (ch) {
        case '+':
        case '-':
            return 1;

        case '*':
        case '/':
            return 2;

        case '^':
            return 3;
        }
        return -1;
    }
public static boolean Operand(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }
    public static String convertToPostfix(String infix) {
        Stack<Character> stack = new Stack<Character>();
        StringBuffer postfix = new StringBuffer(infix.length());
        char c;
       for (int i = 0; i < infix.length(); i++) {
            c = infix.charAt(i);
            if (Operand(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            }
            else if (c == ')') {

                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() != '(')
                    return null;
                else if(!stack.isEmpty())
                    stack.pop();
            }
            else if (Operator(c))
            {
                if (!stack.isEmpty() && getPrecedence(c) <= getPrecedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
                   postfix.append(stack.pop());       }
        return postfix.toString();
    }
    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
        System.out.print("Enter Infix Expression :");
        String e=sc.nextLine();
        System.out.println("Postfix :"+convertToPostfix(e));      }}
  

