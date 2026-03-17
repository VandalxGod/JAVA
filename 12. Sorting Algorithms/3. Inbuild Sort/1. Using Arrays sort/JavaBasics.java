import java.util.*;
public class JavaBasics {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 8};
        // Arrays.sort(arr, 0, 3);
        Arrays.sort(arr);
        System.out.println("Sorted array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
