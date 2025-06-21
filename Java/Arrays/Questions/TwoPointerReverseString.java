public class TwoPointerReverseString {
    public static void main(String[] args){
        int[] arr = {12,23,34,45,56,67,78};
        int i=0;
        int j=arr.length-1;
        int temp;
        while(i<=j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int num : arr){
            System.out.println(num);
        }
    }
}