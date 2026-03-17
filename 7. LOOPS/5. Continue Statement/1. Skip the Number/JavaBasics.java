public class JavaBasics {
    public static void main(String[] args){
        int n =5;
        for(int i=1; i<=5; i++){
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }
    }
    
}

// Continue is used to skip the current iteration of the loop when a certain condition is met. In this example, when i equals 3, the continue statement is executed, causing the loop to skip the print statement for that iteration. As a result, the numbers 1, 2, 4, and 5 are printed, while 3 is skipped.