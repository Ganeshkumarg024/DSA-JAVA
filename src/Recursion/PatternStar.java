package Recursion;

public class PatternStar {
    public static void main(String[] args) {
        startpattern(4,0);
    }
    static void startpattern(int row,int col){
        if(row==0) return;
        if(col<row){
            System.out.print("*");
            startpattern(row,col+1);
        }else{
            System.out.println();
            startpattern(row-1,0);
        }
    }
}
