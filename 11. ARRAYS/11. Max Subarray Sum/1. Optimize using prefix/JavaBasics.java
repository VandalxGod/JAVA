public class JavaBasics {
    public static void MaxSubarraySum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currsum = 0;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(currsum > maxSum){
                    maxSum = currsum;
                }
                

            }
        }
        System.out.println("Max Subarray Sum is: " + maxSum);
    }
    public static void main(String[] args){
        int arr[] = {2, 4, 6, 8, 10};
        MaxSubarraySum(arr);

    }
    
}
