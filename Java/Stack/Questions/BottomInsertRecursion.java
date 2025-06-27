import java.util.*;
public class BottomInsertRecursion{
    public static void pushAtBottom(Stack<Integer> s, int x){
        if(s.size()==0) {
            s.push(x);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, x);
        s.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(23);
        st.push(34);
        st.push(45);
        System.out.println(st);
        pushAtBottom(st, 12);
        System.out.println(st);
    }
}