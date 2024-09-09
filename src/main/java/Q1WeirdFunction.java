// src/main/java/Q1WeirdFunction.java
import ArrayList from java.util.ArrayList;
public class Q1WeirdFunction {
    
    public static int fRecursive(int n) {
        // TODO: Implement the recursive function
        if(n < 3) {
            return n;
        }
        else {
            return fRecursive(n-1) + 2 * fRecursive(n-2) + 3 * fRecursive(n-3);
        }
    }
    
    public static int fIterative(int n) {
        // TODO: Implement the iterative function
        
        if(n < 3) {
            return n;
        }
        else {
            ArrayList funcNums = new ArrayList<int>();
            int i = 0;
            int res = 0;
            
            while(true) {
                if(n >= 3) {
                    funcNums.add(1);
                    if(funcNums.get(i) == 1){
                        n--;
                    }
                    else if(funcNums.get(i) == 2) {
                        n -= 2;
                    }
                    else if(funcNums.get(i) == 3) {
                        n -= 3
                    }
                    i++;
                }
                else {
                    
                    if(funcNums.get(i - 1) == 1){
                        res += n;
                        n++;
                    }
                    else if(funcNums.get(i - 1) == 2) {
                        res += 2 * n
                        n += 2;
                    }
                    else if(funcNums.get(i - 1) == 3) {
                        res += 3 * n
                        n += 3
                    }

                    funcNums.set(i - 1, funcNums.get(i - 1) + 1);
                    if(funcNums.get(i - 1) == 3) {
                        funcNums.remove(i - 1);
                    
                        i--;
                        funcNums.set(i, funcNums.get(i)++);
                    }
                }
            }
    }
}
