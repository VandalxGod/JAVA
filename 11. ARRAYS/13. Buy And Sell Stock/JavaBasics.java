import java.util.*;
public class JavaBasics {
    public static int Maxprofit(int arr[]){
        int maxprofit = 0;
        for(int i=0; i<arr.length; i++){
            int buyprice = arr[i];
            for(int j=i+1; j<arr.length; j++){
                int sellingprice = arr[j];
                if(sellingprice > buyprice){
                    int profit = sellingprice - buyprice;
                    maxprofit = Math.max(maxprofit, profit);
                }
            }
        }
        return maxprofit;

    }

    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        int result = Maxprofit(arr);
        System.out.println("Maximum profit is: " + result);
    }
    
}
