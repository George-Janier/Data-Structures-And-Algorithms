/* Given an array of marks, if the marks of any student is less than 35 print its roll number(array index + 1)*/

public class BasicQ {
    public static void main(String[] args) {
        int[] marks = {78, 67, 34, 35, 89, 90, 30, 36, 28, 90};
        System.out.println("Failed Roll Numbers: ");
        for(int i=0; i<marks.length; i++) {
            if(marks[i]<35){
                System.out.println(i+1);
            }
        }
    }
}