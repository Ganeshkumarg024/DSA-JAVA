package String;

import java.util.Optional;

public class MinmalWIndowsString {

    public static void main(String[] args) {
        String s = "SNNACDSVABANC";
        String t = "AABC";
        bruteforce(s,t);
        Optimal(s,t);
    }
    public static void bruteforce(String s,String t){
        int n = s.length();
        String ans = "";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub=s.substring(i,j+1);
                if(isContain(sub,t)){
                  if(ans.equals("") || sub.length()<ans.length()){
                      ans=sub;
                  }
                }
            }
        }
        System.out.println(ans);
    }
    public static boolean isContain(String s,String t){
        int freq[]=new int[128];

        for(char a:s.toCharArray()) freq[a]++;

        for(char c:t.toCharArray()){
            if(freq[c]==0){
                return false;
            }
            freq[c]--;
        }
        return true;
    }

    public static void Optimal(String s,String t){
        int freq[]=new int[128];

        for(char a:t.toCharArray()) freq[a]++;

        int right=0;
        int start=0;
        int min=Integer.MAX_VALUE;
        int count=t.length();

        for(int left=0;left<s.length();left++){
            char r=s.charAt(left);
            if(freq[r]>0) count--;
            freq[r]--;

            while(count==0){
                if(min>left-right){
                    min=left-right+1;
                    start=right;
                }
                char l=s.charAt(right);
                freq[l]++;
                if(freq[l]>0) count++;
                right++;
            }
        }
        System.out.println(s.substring(start,start+min));
    }
}
