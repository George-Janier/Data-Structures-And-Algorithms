import java.util.*;
public class RecursiveStackPrint {
    public static void display(Stack<Integer> st){
        if (st.isEmpty()) {
            return;
        }
        int top = st.pop();
        System.out.println(top);
        display(st);
        st.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(23);
        stack.push(34);
        stack.push(45);
        display(stack);
        System.out.println(stack);
    }
}