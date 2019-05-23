import java.util.ArrayList;
import java.util.Arrays;

public class Question1{
    public static void main(String[] args){
        
        // Creates integer array
        ArrayList<Integer> numbersArray = new ArrayList<Integer>();
        numbersArray.addAll(Arrays.asList(5, 9, 3, 6, 3, 2, 8, 8));
        
        // Boolean to terminate outer loop
        boolean finished = false;
        
        // Outer loop to run through each index, except the last index of the array (unnecessary)
        for(int counterMacro = 0; counterMacro < numbersArray.size() && !finished; counterMacro++){
            
            // Inner loop to compare the index indicated by counterMacro to the rest of the indexes in the array
            for(int counterMicro = 1; counterMacro + counterMicro < numbersArray.size(); counterMicro++){
                
                // Finds the first duplicate
                if(numbersArray.get(counterMacro) == numbersArray.get(counterMicro + counterMacro)){
                    
                    System.out.println(numbersArray.get(counterMacro + counterMicro));
                    // Breaks the outer loop
                    finished = true;
                    // Breaks the inner loop
                    break;
                    
                }
            }
        }
        
    }
}
