//Find the maximum value in array
public class MaxValue {
    public static void main(String[] args){
        int[] arr = {23,34,45,56,67,78,89,90};
        int max = Integer.MIN_VALUE;//min value a int data type can store
        for(int num: arr) {
            if(num>max){
                max = num;
            }
        }
        System.out.println("Max value: "+max);
    }
}