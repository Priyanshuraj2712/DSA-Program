import java.util.Stack;
public class Balanced{
  	static Boolean checker(String str) {
        Stack<Character> s = new Stack<>(); 
        for (int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (s.isEmpty()) {
                    return false;
                } 
                char top = s.pop();              
                if (ch == ')' && top != '(') {
                    return false;
                }
                if (ch == ']' && top != '[') {
                    return false;
                }
                if (ch == '}' && top != '{') {
                    return false;
                }
            }
        }
        return s.isEmpty();
    } 
    public static void main(String[] args) {
        String str = "(a+b)*c";
        if (checker(str)){
            System.out.println("Balanced");
        }
		else{
            System.out.println(" Not Balanced");
        }
    }
}
