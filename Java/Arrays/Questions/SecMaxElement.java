//Find the second maximum element in an array
public class SecMaxElement{
    public static void main(String[] args){
        int[] arr = {12,23,34,45,56,67,78,89,90};
        int max = Integer.MIN_VALUE;//min value a int data type can store
        int smax = Integer.MIN_VALUE;
        for(int num: arr) {
            if(num>max){
                max = num;
            }
        }
        for(int num: arr) {
            if(num>smax && num!=max){
                smax = num;
            }
        }
        System.out.println("Max value: "+max);
        System.out.println("Sec Max value: "+smax);
    }
}