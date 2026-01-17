package Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int trap[]={3, 0, 2,9,0,1, 4};
        bruteforce(trap);
        prefixsum(trap);
        optimal(trap);
    }
    public static void bruteforce(int [] trap){

        int water=0;

        for(int i=0;i<trap.length;i++){
            int leftmax=0;int rightmax=0;
            for (int j = 0; j <= i; j++) {
                leftmax=Math.max(leftmax,trap[j]);
            }

            for (int j=i;j<trap.length;j++){
                rightmax=Math.max(rightmax,trap[j]);
            }

            water+=Math.min(leftmax,rightmax)-trap[i];
        }
        System.out.println(water);
    }
    public static void prefixsum(int arr[]){
        int leftmax[]=new int[arr.length];
        int rightmax[]=new int[arr.length];

        leftmax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        }

        rightmax[arr.length-1]=arr[arr.length-1];
        for (int i=arr.length-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
        }

        int water=0;
        for(int i=1;i<arr.length-1;i++){
            int value=Math.min(rightmax[i],leftmax[i]);
            water+=value-arr[i];
        }

        System.out.println(water);
    }

    public static void optimal(int arr[]){
        int n=arr.length;
        int left=1;
        int right=n-2;

        int lmax=arr[left-1];
        int rmax=arr[right+1];

        int res=0;

        while (left<=right){

            if(rmax<=lmax){
                res+=Math.max(0,rmax-arr[right]);
                rmax=Math.max(rmax,arr[right]);
                right-=1;
            }else {
                res+=Math.max(0,lmax-arr[left]);
                lmax=Math.max(lmax,arr[left]);
                left+=1;
            }
        }
        System.out.println(res);
    }
}
