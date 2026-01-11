package Arrays;

import java.util.Arrays;

public class SortColorsOptimal {
    public static void main(String[] args) {
        int arr[]=new int [] {0,1,2,0,2,1};

        int low=0;
        int mid=0;
        int high=arr.length-1;

        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else {
                swap(arr,mid,high);
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int arr[],int move,int place){
        int temp=arr[move];
        arr[move]=arr[place];
        arr[place]=temp;
    }
}
