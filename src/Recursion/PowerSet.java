package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSet {
    public static void main(String[] args) {
        int nums[]={1,2};
        List<List<Integer>>result=new ArrayList<>();
        generateSubsets(0,nums,new ArrayList<>(),result);
        System.out.println(result);
    }
    static void generateSubsets(int index, int nums[], List<Integer>curr,List<List<Integer>>result){
        if(index==nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        generateSubsets(index+1,nums,curr,result);

        curr.remove(curr.size()-1);
        generateSubsets(index+1,nums,curr,result);
    }
}
