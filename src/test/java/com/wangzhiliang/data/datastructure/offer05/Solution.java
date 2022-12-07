package com.wangzhiliang.data.datastructure.offer05;

public class Solution {
    public String replaceSpace(String s) {
        int len =s.length();
        int size=0;
        char[] arr =new char[len*3];
        for(int i=0;i<len;i++){
            char c=s.charAt(i);

            if(c  ==' '){
                arr[size++]='%';
                arr[size++]='2';
                arr[size++]='0';
            }else {
                arr[size++]=c;
            }
        }

        String newStr=new String(arr,0,size);

        return newStr;
    }


}
