package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String args[]){
        ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        int Target=4;
        int left=0; int right=arr.size()-1;
        while(left<right){
            int find=arr.get(left)+arr.get(right);
            if(find==Target){
                System.out.println(arr.get(left)+" "+arr.get(right));
                break;
            }else if(find>Target){
                right--;
            }else{
                left++;
            }
        }

        HashMap<Integer,Integer>hashMap=new HashMap<>();

        for(int i=0;i<arr.size();i++){
            int need=Target-arr.get(i);
            if(hashMap.containsKey(need)){
                System.out.println(need+" "+arr.get(i));
            }
            hashMap.put(arr.get(i),i);
        }


    }
}
