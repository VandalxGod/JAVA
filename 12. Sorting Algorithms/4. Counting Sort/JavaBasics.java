public class JavaBasics {
    public static void CountingSort(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        int count[] = new int[max+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        } 
        
    }

    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 8};
        CountingSort(arr);
        System.out.println("Sorted array is: ");
        for(int i=0; i<arr.length; i++){
           g System.out.print(arr[i] + " ");
        }
    }
    
}
