import java.util.*;
public class InsertElementAtBottom {
    //create a new reversed stack
    public static void transferStack(Stack<Integer> a, Stack<Integer> b){
        while (!a.isEmpty()) {
            b.push(a.pop());
        }
    }
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(23);
        st.push(34);
        st.push(45);
        System.out.println("Stack: "+st);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to be inserted at bottom: ");
        int x = sc.nextInt();

        Stack<Integer> temp = new Stack<>();

        transferStack(st, temp);

        st.push(x);

        transferStack(temp, st);
        System.out.println("After Insert Stack: "+st);

        
    }
}

