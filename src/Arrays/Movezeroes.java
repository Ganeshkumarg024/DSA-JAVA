package Arrays;

import java.util.Arrays;

public class Movezeroes {

    public static void main(String[] args) {
        int arr[]=new int [] {1,2,0,3,4,0,1,2};

        int j=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]!=0){
               arr[j++]=arr[i];
           }
        }
        while (j< arr.length){
            arr[j++]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
