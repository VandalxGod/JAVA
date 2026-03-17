public class JavaBasics {
    public static void MaxSubarraySum(int arr[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(cs < 0){
                cs = 0;
            }
            cs += arr[i];
            ms = Math.max(ms, cs);
        }
        System.out.println("Max Subarray Sum is: " + ms);
    }

    public static void main(String[] args){
        int arr[] = {2, 4, 6, 8, 10};
        MaxSubarraySum(arr);
    }
    
}
