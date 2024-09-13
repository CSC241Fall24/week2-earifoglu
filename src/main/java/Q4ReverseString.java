// src/main/java/Q4ReverseString.java

public class Q4ReverseString {

    public static String reverse(String s) {
        // TODO: Implement the recursive function to reverse the string

        if(s.length() > 1) {
            String str = s.charAt(s.length() - 1)  + reverse(s.substring(0, s.length() - 1));
        }
        return str;

        
    }
}
