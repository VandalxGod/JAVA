public class JavaBasics {
    public static void update(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i] +=1;
        }
    }
//Adding Plus one 
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        update(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
    
}
