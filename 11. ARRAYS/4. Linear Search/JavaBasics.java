public class JavaBasics {
    public static int LinearSearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(key == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 8, 9};
        int key = 8;
        int index = LinearSearch(arr, key);
        if(index == -1){
            System.out.println("Key is not found");
        }
        else{
            System.out.println("Key is at index :" + index); 
        }
    }
    
}

