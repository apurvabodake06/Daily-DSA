import java.util.Stack;

public class postfixEvaluation {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<Integer> value = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii >=48 && ascii <= 57){
                value.push(ascii - 48);
            }else{
                int val2 = value.pop();
                int val1 = value.pop();
                if(ch == '+') value.push(val1 + val2);
                if(ch == '-') value.push(val1 - val2);
                if(ch == '*') value.push(val1 * val2);
                if(ch == '/') value.push(val1 / val2);
            }
        }
        System.out.println(value.pop());
    }
}
