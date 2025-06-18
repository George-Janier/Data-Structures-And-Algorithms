/* Find the sum of all elements in array. */
public class SumOfElementsInArr {
    public static void main(String[] args){
        int[] arr = {23,45,64,56,34,67,23,68,90,23};
        int sum = 0;
        for(int num : arr){
            sum = sum + num;
        }
        System.out.println("Sum Of All Elements: "+ sum);
    }
}