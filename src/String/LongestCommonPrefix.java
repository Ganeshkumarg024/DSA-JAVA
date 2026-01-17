package String;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};

        System.out.println("--- Longest Common Prefix ---");
        System.out.println("Horizontal Scanning: " + horizontal(strs));
        System.out.println("Vertical Scanning: " + Optimal(strs));
    }

    static String horizontal(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            // .indexOf(prefix) == 0 means the string starts with the prefix
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    static String Optimal(String [] strs){
        Arrays.sort(strs);
        String start=strs[0];
        String end=strs[strs.length-1];

        int i=0;
        while(start.length()>i&& end.length()>i && start.charAt(i)==end.charAt(i)){
            i++;
        }
        return start.substring(0,i);

    }
}
