package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        List<String >res=new ArrayList<>();
        backtrack(res,"",0,0,2);
        System.out.println(res);
    }
    static void backtrack(List<String>res,String s,int open,int close,int n){
        if(s.length()==n*2){
            res.add(s);
            return;
        }
        if(open<n) backtrack(res,s+"(",open+1,close,n);
        if(close<open) backtrack(res,s+")",open,close+1,n);
    }
}
