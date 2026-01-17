package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class longestConsecutive {

    public static void main(String[] args) {
        int arr[]={100, 4, 5, 1, 3, 2};
        Set<Integer> set=new HashSet<>();


        for(int a:arr){
                set.add(a);
        }
     int longest=0;
        for(int a:arr){
            if(!set.contains(a-1)){
                int curr=a;
                int streak=1;
                while (set.contains(curr+1)){
                    curr=curr+1;
                    streak++;
                }
                longest = Math.max(longest, streak);
            }

        }
        System.out.println(longest);
    }
}
