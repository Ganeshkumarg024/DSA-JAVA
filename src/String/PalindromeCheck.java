package String;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "racevar";

        System.out.println("--- Palindrome Checks ---");
        System.out.println("Brute Force (Reverse): " + isPalindromeBruteForce(str));
        System.out.println("Optimal (Two Pointers): " + isPalindromeOptimal(str));
    }
    static boolean isPalindromeBruteForce(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        return s.equals(rev);
    }

    static boolean isPalindromeOptimal(String s){
        int i=0; int j=s.length()-1;

        while (i<j){
            if(s.charAt(i++)!=s.charAt(j--)){
                return  false;
            }

        }
        return true;
    }
}
