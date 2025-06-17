public class ArrayBasics { 
    public static void main(String[] args){
        //creating an array O(1)
        int[] numbers = {5, 3, 9, 1, 4};

        //access O(1)
        System.out.println("Third Element: " + numbers[2]);

        //update O(1)
        numbers[2] = 81;
        System.out.println("Updated Third Element: " + numbers[2]);

        //traverse O(n)
        System.out.println("Array: ");
        for(int num : numbers) {
            System.out.println(num + " ");
        }

        //finding min and max O(n)
        int min = numbers[0];
        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]>max)max=numbers[i];
            if(numbers[i]<min)min=numbers[i];
        }
        System.out.println("Max : "+ max);
        System.out.println("Min : "+ min);
    }
}