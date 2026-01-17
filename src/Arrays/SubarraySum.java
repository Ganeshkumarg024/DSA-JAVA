package Arrays;

public class SubarraySum {
    public static void main(String[] args) {
        int arr[]={1,3,1,7,9,3}; int k=3;
        bruteforce(arr,k);
        optimal(arr,k);
    }

    static void bruteforce(int arr[],int k){

        int res=0;
        for(int i=0;i<=arr.length-k;i++){
            int value=0;
            for(int j=i;j<i+k;j++){
                value+=arr[j];
                res =Math.max(res,value);
            }
        }
        System.out.println(res);
    }

    static void optimal(int[] arr, int k) {
        if (arr.length < k) {
            System.out.println("Invalid Input");
            return;
        }

        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        int maxRes = currentSum;

        for (int i = k; i < arr.length; i++) {
            currentSum += arr[i] - arr[i - k];
            maxRes = Math.max(currentSum, maxRes);
        }

        System.out.println("Maximum Sum (Optimal): " + maxRes);
    }
}
