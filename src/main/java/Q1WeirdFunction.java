// src/main/java/Q1WeirdFunction.java

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
            int res = 0;
            int i = 0;
            for(i = n; i >= n - 3; i--) {
                
            }
            res += i;
            i = 0;
            for(i = n; i >= n - 3; i-= 2) {
                

            }
            res += 2 * i;
            i = 0;
            for(i = n; i >= n - 3; i-= 3) {
                

            }
            res += 3 * i;
            return res;
        }
    }
}
