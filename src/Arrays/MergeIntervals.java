package Arrays;

import java.util.*;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
       List<int[]>merged=new ArrayList<>();
       int curr[]=intervals[0];
       merged.add(curr);
       for(int i=1;i<intervals.length;i++){
           int []next=intervals[i];
           if(next[0]<curr[1]){
               curr[1]=Math.max(next[1],curr[1]);
           }else{
               curr=next;
               merged.add(next);
           }
       }
       return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{8,10},{15,18},{2,6}};
        int[][] result = merge(intervals);

        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
