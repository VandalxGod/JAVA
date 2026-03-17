public class JavaBasics {

    public static void MaxSubarraySum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                sum = 0;
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                    
                }
                System.err.println();
                
                if(sum > maxSum){
                    maxSum = sum;
                }
                System.out.println();
            }
        }
        System.out.println("Max Subarray Sum is: " + maxSum);
    }
    public static void main(String[] args){
        int arr[] = {2, 4, 6, 8, 10};
        MaxSubarraySum(arr);

    }
    
}
