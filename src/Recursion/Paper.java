package Recursion;

public class Paper {
    public static void main(String[] args) {
        int ans=Chocolate(15,3);
        System.out.println( ans+15);
    }
    static int Chocolate(int wrapper,int paperneed){
        if(wrapper<paperneed) return 0;

        int n=wrapper/paperneed;

        int rem=wrapper%paperneed;

        return n+Chocolate(n+rem,paperneed);
    }
}
