// src/main/java/Q4ReverseString.java

public class Q4ReverseString {

    public static String reverse(String s) {
        // TODO: Implement the recursive function to reverse the string
    
        if(s.length() > 1) {
            return s.charAt(s.length() - 1)  + reverse(s.substring(0, s.length() - 1));
            
        } 
        else if(s.length() == 0 || s.length() == 1) {
            return s;
        }
        else {
            return "" + s.charAt(0);
        }
        

        
    }
}
