public class StackUsingArray {
    public static class Stack {
        private int[] arr = new int[5]; // Stack max size
        private int idx = -1;           // Initial index (empty)

        void push(int x) {
            if (idx == arr.length - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++idx] = x;
        }

        int pop() {
            if (idx == -1) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return arr[idx--];
        }

        int peek() {
            if (idx == -1) {
                System.out.println("Stack Empty");
                return -1;
            }
            return arr[idx];
        }

        void display() {
            if (idx == -1) {
                System.out.println("Stack Empty");
                return;
            }
            System.out.print("Stack Elements: ");
            for (int i = 0; i <= idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size() {
            return idx + 1;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(12);
        st.push(23);
        st.push(34);
        st.push(45);
        st.push(56);
        st.push(67); 
        st.display();
        System.out.println("Popped: " + st.pop());
        System.out.println("Top: " + st.peek());
        System.out.println("Size: " + st.size());
    }
}
