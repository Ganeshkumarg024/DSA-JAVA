package Recursion;

import java.util.ArrayList;
import java.util.List;

public class BacktackingSet {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<List<Integer>>result=new ArrayList<>();
        backtrack(0,arr,new ArrayList<>(),result);
        System.out.println(result);
    }
    static void backtrack(int start,int arr[],List<Integer>curr,List<List<Integer>>res){
        res.add(new ArrayList<>(curr));
        for(int i=start;i<arr.length;i++){
            curr.add(arr[i]);
            backtrack(i+1,arr,curr,res);
            curr.remove(curr.size()-1);
        }
    }
}
