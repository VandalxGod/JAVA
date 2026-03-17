public class JavaBasics {
    public static int  Trapwater(int arr[]){
        int Leftmax[] = new int[arr.length];
        int Rightmax[] = new int[arr.length];
        Leftmax[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            Leftmax[i] = Math.max(arr[i], Leftmax[i-1]);
        }
        Rightmax[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            Rightmax[i] = Math.max(arr[i], Rightmax[i+1]);
        }
        int trappedwater = 0;
        for(int i=0; i<arr.length; i++){
            int waterlevel = Math.min(Leftmax[i], Rightmax[i]);
            trappedwater += waterlevel - arr[i];
        }
        return trappedwater;

    }
    public static void main(String[] args){
        int arr[] = {4, 2, 0, 6, 3, 2, 5};
        int result = Trapwater(arr);
        System.out.println("Trapped water is: " + result);
    }
    
}
