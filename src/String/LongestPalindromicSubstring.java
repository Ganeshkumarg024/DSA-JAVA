package String;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s="babad";
        String ans="";
        bruteforce(s,ans);
        longestPalindrome(s);
    }
    public static void longestPalindrome(String s) {

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromCenter(s, i, i);     // odd
            int len2 = expandFromCenter(s, i, i + 1); // even
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        System.out.println(s.substring(start, end + 1));
    }

    private static int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() &&
                s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
    static void bruteforce(String s,String ans){
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if (isPalindrome(s, i, j)) {
                    if(j-i+1>ans.length()){
                        ans=s.substring(i,j+1);
                    }
                }
            }
        }
        System.out.println(ans);
    }
    static boolean isPalindrome(String s,int i,int j){
        while (i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }i++;
            j--;
        }
        return true;
    }
}
