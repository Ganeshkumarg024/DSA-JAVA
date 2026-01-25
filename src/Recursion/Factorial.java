package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n=Recursion(5);
        System.out.println(n);
    }
    static int Recursion(int n){
        if(n<=1) return 1;
        return n*Recursion(n-1);
    }
}
