package Arrays;

public class MaxProduct {
    public static void main(String[] args) {
        int arr[]={-2, 6, -3, -10, 0, 2};
        bruteforce(arr);
        Optimal(arr);
    }
    static void bruteforce(int arr[]){
        int max=0;
        for(int i=0;i<arr.length;i++){
            int currmax=1;
            for(int j=i;j<arr.length;j++){
                currmax*=arr[j];
                max=Math.max(currmax,max);
            }
        }
        System.out.println(max);
    }
    static void Optimal(int arr[]){
        int maxsofar=arr[0];
        int minsofar=arr[0];
        int result=arr[0];

        for(int i=1;i<arr.length;i++){
            int curr=arr[i];

            if(curr<0){
                int temp=maxsofar;
                maxsofar=minsofar;
                minsofar=temp;
            }
            maxsofar=Math.max(curr,maxsofar*curr);
            minsofar=Math.min(curr,minsofar*curr);

            result=Math.max(result,maxsofar);
        }

        System.out.println(result);
    }

}
