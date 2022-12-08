package com.wangzhiliang.data.datastructure.leet62;

public class robet {

    public int uniquePaths(int m, int n) {
        int num= move(m-1,n-1);
        return num;
    }

    private int move(int m, int n) {
        if(m==0&&n==0){
            return 1;
        }
        if(m==0&&n!=0){
            return move(m,n-1);
        }
        if(m!=0&&n==0){
            return move(m-1,n);
        }
        return move(m-1,n)+move(m,n-1);
    }


    public static void main(String[] args) {
        robet robet=new robet();
       int x= robet.uniquePaths(3,7);

       System.out.println(x);
    }
}
