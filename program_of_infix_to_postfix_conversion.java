import java.util.*;
class Stack {
    char arr[] = new char[100];
    int top = -1;
    void push(char c) {
        top++;
        arr[top] = c;
    }
    char pop() {
        return arr[top--];
    }
    boolean isEmpty() {
        return top == -1;
    }
    char peek() {
        return arr[top];
    }
}
public class InfixConverter {
    static Stack st = new Stack();
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the infix expression you want to convert: ");
        String infix = sc.nextLine();
        System.out.println("Postfix expression for the given infix expression is: " + toPostfix(infix));
    }
    static String toPostfix(String infix) {
        String postfix = "";
        for (int i = 0; i < infix.length(); ++i) {
            char ch = infix.charAt(i);
            if (Character.isLetter(ch)) {
                postfix = postfix + ch;
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (st.peek() != '(') {
                    postfix = postfix + st.pop();
                }
                st.pop();
            } else {
                while (!st.isEmpty() && st.peek() != '(' && prec(ch) <= prec(st.peek())) {
                    postfix = postfix + st.pop();
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty()) {
            postfix = postfix + st.pop();
        }
        return postfix;
    }
        static int prec(char x) {
        if (x == '+' || x == '-')
            return 1;
        if (x == '*' || x == '/' || x == '^')
            return 2;
        return 0;
    }
}
