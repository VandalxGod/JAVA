public class JavaBasics {
    public static void SelectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minindex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minindex]){
                    minindex = j;
                }
            }
            //swap
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void main(String[] args){
        int arr[] = {64, 25, 12, 22, 11};
        SelectionSort(arr);
        System.out.println("Sorted array is: ");  
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
