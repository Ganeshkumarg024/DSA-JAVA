package String;

import java.util.Arrays;

public class AnagramChecker {

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";

        System.out.println("--- Valid Anagram Check ---");
        System.out.println("Sorting Method: " + isAnagramSorting(s, t));
        System.out.println("Optimal (Frequency Array): " + isAnagramOptimal(s, t));
    }
    static boolean isAnagramSorting(String s, String t){
        if(s.length()!=t.length()) return false;

        char [] sArray=s.toCharArray();
        char []tArray=t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray,tArray);
    }

    static  boolean isAnagramOptimal(String t,String s){
        if(s.length()!=t.length()) return false;
        int alpha[]=new int[26];

        for(int i=0;i<t.length();i++){
            alpha[s.charAt(i)-'a']++;
            alpha[t.charAt(i)-'a']--;
        }

        for (int i=0;i<alpha.length;i++){
            if(alpha[i]!=0) return false;
        }
        return true;


    }
}
