import java.util.Scanner;

public class TakingArrInputs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter "+i+"th element: ");
            arr[i] = sc.nextInt();
        }

        for(int num : arr) {
            System.out.println("Array: ");
            System.out.println(num);
        }
    }
}