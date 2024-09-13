// src/main/java/Q1WeirdFunction.java
import java.util.ArrayList;
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
        int i = 0;
        ArrayList<int> funcNums = new ArrayList<int>();
        int res = 0;

        if(n >= 3) {
            if(funcNums.size() == i) {
                funcNums.add(1);
            }
            if(funcNums.get(i) == 1) {
                n--;
            }
            else if(funcNums.get(i) == 2) {
                n -= 2;
            }
            else if(funcNums.get(i) == 3) {
                n -= 3;
            }
            if(n >= 3) {
                i++;
            }

        }
        else {
            if(funcNums[i] == 1) {
                res += n;
                n++;
                funcNums.set(i, funcNums.get(i) + 1);
            }
            else if(funcNums[i] == 2) {
                res += 2 * n;
                n += 2;
                funcNums.set(i, funcNums.get(i) + 1);
            }
            else if(funcNums[i] == 3) {
                res += 3 * n;
                n += 3;
                funcNums.remove(i);
                i--;
                while(true) {
                    if(funcNums[i] == 3) {
                        n += 3;
                        funcNums.remove(i);
                    }
                    else {
                        if(funcNums[i] == 1) {
                            n += 1;
                            funcNums.set(i, funcNums.get(i) + 1);
                            break;
                        }
                        else if(funcNums[i] == 2) {
                            n += 2;
                            funcNums.set(i, funcNums.get(i) + 1);
                        }
                    }
                }
                if(funcNums[i] == 3 && funcNums.size() == 1) {
                    break;
                }
            }
        }
        return res;
    }
}
