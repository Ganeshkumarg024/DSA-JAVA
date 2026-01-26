package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,7,8,9,55};
        int a=Bs(arr,7,0,arr.length-1);
        System.out.println(a);
    }
    static int Bs(int arr[],int target,int s,int e){

        if(s>e) return -1;

        int mid=s+(e-s)/2;
        if(target==arr[mid]) return mid;

        if(target>arr[mid]){
            return Bs(arr,target,mid+1,e);
        }
       return Bs(arr,target,s,mid);
    }
}
