import java.util.*;
public class CopyStack {
    public static void revStack(Stack<Integer> a, Stack<Integer> b){
        while (!a.isEmpty()) {
            b.push(a.pop());
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter size of stack: ");
        size = sc.nextInt();

        Stack<Integer> st = new Stack<>();
        for(int i=0; i<size;i++){
            System.out.println("Enter "+i+"th element: ");
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println("Og Stack: "+ st);

        Stack<Integer> tempSt = new Stack<>();
        Stack<Integer> copySt = new Stack<>();

        revStack(st, tempSt);
        System.out.println("Temp Stack: "+ tempSt);
        revStack(tempSt, copySt);

        System.out.println("Copied Stack: "+ copySt);
    }

}