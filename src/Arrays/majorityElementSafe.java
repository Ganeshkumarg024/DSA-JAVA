package Arrays;

import java.util.HashMap;

public class majorityElementSafe {
    public static void main(String[] args) {
        int arr[]={2,2, 2, 2, 1, 1, 1};
        bruteforce(arr);
        optimaForce(arr);
    }
    public static void bruteforce(int arr[]){
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        for(int key:hm.keySet()){
            if(hm.get(key)> arr.length/2){
                System.out.println(key);
            }
        }
    }
    public static void optimaForce(int arr []){

        int count=0;
        int canditate=0;

        for(int num:arr){
            if(count==0){
                canditate=num;
                count++;
            }else if(num==canditate){
                count++;
            }else{
                count--;
            }
        }
        System.out.println( canditate);
    }
}
