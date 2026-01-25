package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        List<List<Integer>> res = new ArrayList<>();
        int nums[]={1,2,3};
        backtrack(res, new ArrayList<>(), nums);
        System.out.println(res);
    }
    static void backtrack(List<List<Integer>>res,List<Integer>curr,int arr[]){
        if(curr.size()==arr.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0;i<arr.length;i++){
            if(curr.contains(arr[i])) continue;
            curr.add(arr[i]);
            backtrack(res,curr,arr);
            curr.remove(curr.size()-1);
        }
    }
}
