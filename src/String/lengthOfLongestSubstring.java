package String;

import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubstring {

    public static void main(String[] args) {
        String test="abba";
        bruteforce(test);
        Optimal(test);
    }
    static void Optimal(String s){
        Set<Character>set=new HashSet<>();
        int left=0; int n=s.length();
        int max=0;

        for(int i=0;i<s.length();i++){
            while (set.contains(s.charAt(i))){
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(i));
            max=Math.max(max,i-left+1);
        }
        System.out.println("New :"+max);
    }

    public static void bruteforce(String s){
        int n=s.length();
        int maxlen=0;

        for(int i=0;i<n;i++){

            for(int j=i;j<n;j++){
                if(isUnique(s,i,j)){
                    maxlen=Math.max(maxlen,j-i+1);
                }
            }
        }
        System.out.println(maxlen);
    }
    static boolean isUnique(String s,int i,int j){
        Set<Character>set=new HashSet<>();
        for(int k=i;k<=j;k++){
           if(set.contains(s.charAt(k))){
                return false;
            }
           set.add(s.charAt(k));
        }
        return true;
    }
}
