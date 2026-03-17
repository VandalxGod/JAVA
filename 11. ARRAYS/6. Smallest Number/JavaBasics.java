public class JavaBasics {
    public static int SmallestValue(int arr[]){
        int Smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<Smallest){
                Smallest = arr[i];
            }
        }
        return Smallest;
    }
    public static void main(String[] args){
        int arr[] = {94,3,552,22,32,5,2,1,46};
        System.out.println(SmallestValue(arr));

    }
    
}
