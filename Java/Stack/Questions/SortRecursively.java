import java.util.Stack;

public class SortRecursively {
    
    public static void sortStack(Stack<Integer> st) {
        if (st.isEmpty()) return;  // base case

        int top = st.pop();        // pop the top element
        sortStack(st);  // sort the remaining stack
        insertInSortedOrder(st, top);  // insert the popped element back in sorted order
    }

    private static void insertInSortedOrder(Stack<Integer> st, int element) {
        // base case: stack is empty OR top of stack >= element (descending order)
        if (st.isEmpty() || st.peek() <= element) {
            st.push(element);
            return;
        }

        // pop element, insert recursively, and push back
        int temp = st.pop();
        insertInSortedOrder(st, element);
        st.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(45);
        stack.push(23);
        stack.push(56);
        stack.push(12);

        System.out.println("Original Stack: " + stack);
        sortStack(stack);
        System.out.println("Sorted in Descending Order: " + stack);
    }
}
