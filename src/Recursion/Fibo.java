package Recursion;

public class Fibo {
    public static void main(String[] args) {
        int ans=bruteforce(10);
        optimal(10);
        System.out.println(ans);
    }
    static int bruteforce(int n){
        if(n<=1) return n;

        return bruteforce(n-1)+bruteforce(n-2);
    }
    static void optimal(int n){
        int a=0,b=1;
        for(int i=2;i<=n;i++){
            int temp=a+b;
            a=b;
            b=temp;
        }
        System.out.println(b);
    }
}
