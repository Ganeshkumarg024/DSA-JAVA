package Arrays;

import java.util.Arrays;

public class rotateBrute {
    public static void main(String[] args) {
        int arr []={1,2,3,4,5,6,7};

       // bruteforce(arr);
        optimal(arr);
        //Output: [5,6,7,1,2,3,4]

    }
    public static void bruteforce(int arr[]){
        int n=arr.length-1;
        int k=3%n;
        for(int i=0;i<k;i++){
            int last=arr[n];
            for(int j=n;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void optimal(int arr[]){
        int n=arr.length;
        int k=3%n;

        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int arr[],int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
