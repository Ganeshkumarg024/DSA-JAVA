package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class Temprature {
    public static void main(String[] args) {
        int arr[]={70,72,73,68,71,70,80,78};
        BruteForce(arr);
        Optimal(arr);
    }
    static void BruteForce(int arr[]){
        int Result[]=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    Result[i]=j-i;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(Result));
    }
    static void  Optimal(int arr[]){
        int result[]=new int[arr.length];
        Stack<Integer>stk=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while (!stk.isEmpty() &&arr[stk.peek()]<arr[i]){
                result[stk.peek()]=i-stk.pop();
            }
            stk.push(i);
        }

        System.out.println(Arrays.toString(result));

    }
}
