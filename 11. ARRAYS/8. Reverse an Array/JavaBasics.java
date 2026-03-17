import java.util.*; 
public class JavaBasics {
    public static void reverse(int arr[]){
        int si = 0;
        int ei = arr.length-1;

        while(si<ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;

        // int n = arr.length-1;
        // for(int i=0; i<n/2; i++){
        //     int temp = arr[i];
        //     arr[i] = arr[n-i];
        //     arr[n-i] = temp;
        }
    }

    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5};
        reverse(arr);
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
