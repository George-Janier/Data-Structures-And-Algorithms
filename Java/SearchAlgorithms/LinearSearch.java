//Linear Search is a algorithm that searches based on key value.
//It is the most basic search algorithm.
//Time Complexity : O(n)


public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23,45,65,23,67,87,23,65,76};
        int x = 100;
        for(int i = 0; i<
        arr.length; i++){
            if(arr[i]==x){
                System.out.println("Element found at index "+i);
                return;
            }
        }
        System.out.println("Element Not Found");

    }
}