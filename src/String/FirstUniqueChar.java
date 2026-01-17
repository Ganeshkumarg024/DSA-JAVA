package String;

import java.util.Arrays;

public class FirstUniqueChar {

    public static void main(String[] args) {
        String s = "loveleetcode";

        System.out.println("--- First Non-Repeating Character ---");
        System.out.println("Index (Brute Force): " + bruteForce(s));
        System.out.println("Index (Optimal): " + optimal(s));

    }
    static int bruteForce(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) return i;
        }
        return -1;
    }

    static int optimal(String s){
        int alpha[]=new int[26];

        for(char a:s.toCharArray()){
            alpha[a-'a']++;
        }
        System.out.println(Arrays.toString(alpha));

        for (int i=0;i<s.length();i++){
           if(alpha[s.charAt(i)-'a']==1){
               return i;
           }
        }
        return  -1;
    }
}
