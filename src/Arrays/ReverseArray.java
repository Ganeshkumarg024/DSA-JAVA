package Arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String args[]) {
        int [] arr =new int[] {1,2,4,5,6};

        int right=arr.length-1;
        int left =0;

        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;

        }

        System.out.println(Arrays.toString(arr));

    }
}
