package String;

import java.util.ArrayList;
import java.util.List;

public class StringCombinations {
    public static void main(String[] args) {
        String input = "abc";
        List<String> result = new ArrayList<>();
        findCombinations(0, input.toCharArray(), result);
        System.out.println(result);
    }
    static void findCombinations(int index,char [] charArr, List<String> result){
       if(index==charArr.length){
           result.add(new String(charArr));
           return;
       }

       for(int i=index;i<charArr.length;i++){
       swap(charArr,i,index);
       findCombinations(index+1,charArr,result);
       swap(charArr,i,index);
       }

    }
    static void swap(char [] arr,int i,int j){
        char temp=arr[i];
        arr[i] = arr[j];
        arr [j]=temp;

    }
}
