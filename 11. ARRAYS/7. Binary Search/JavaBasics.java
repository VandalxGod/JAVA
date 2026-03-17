public class JavaBasics {
    public static int BinarySearchn(int arr[], int key){
        int si = 0;
        int ei = arr.length-1;
        
  
        while(si<=ei){
            int mid = (ei+si)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                si = mid+1; 
            }
            else{
                ei = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 6;
        int index = BinarySearchn(arr, key);

        System.out.println(index);
    }
    
}
