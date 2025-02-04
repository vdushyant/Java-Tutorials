import java.util.Stack;

public class questionsOnStack {

    public static void pushAtBottom(Stack<Integer> s, int n){
        if(s.isEmpty()){
            s.push(n);
            return;
        }

        int currVal=s.peek();
        s.pop();
        pushAtBottom(s,n);
        s.push(currVal);
        return;
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.peek();
        s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s,5);
        System.out.println(s);

        reverseStack(s);
        System.out.println(s);
    }
}