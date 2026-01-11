package Arrays;

public class missingNumberXOR {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,4,5};
        int n=arr.length+1;
        int expectedsum=n*(n+1)/2;
        int actualsum=0;

        for(int a:arr){
            actualsum+=a;
        }
        System.out.println(expectedsum-actualsum);
    }


}
