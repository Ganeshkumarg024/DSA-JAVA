package Arrays;

public class MaximumSubarrayBruteForce {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        bruteforce(nums);
        KadanesAlgorithm(nums);

    }
    public static void bruteforce(int arr[]){
        int maximum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int curr=0;
            for(int j=i;j<arr.length;j++){
                curr+=arr[j];
                maximum=Math.max(curr,maximum);
            }
        }
        System.out.println(maximum);
    }
    public static void KadanesAlgorithm(int arr[]){
        int curr=arr[0];
        int max=arr[0];

        for(int i=1;i<arr.length;i++){
            int newV=curr+arr[i];
            curr=Math.max(arr[i],newV);
            max=Math.max(curr,max);
        }
        System.out.println(max);
    }
}
