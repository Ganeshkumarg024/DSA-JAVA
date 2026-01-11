package Arrays;

public class SecondLarge {
    public static void main(String[] args) {
        int arr[]=new int [] {1,2,0,3,4,9,1,2};
        int first=arr[0];
        int second=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];

            }else if(arr[i]>second && arr[i]<first){
                second=arr[i];
            }
        }
        System.out.println(second);
    }
}
