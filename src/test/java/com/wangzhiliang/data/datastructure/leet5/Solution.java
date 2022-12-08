package com.wangzhiliang.data.datastructure.leet5;

import java.util.HashMap;

public class Solution {

    //第一步，找出所有的字串
    public static String longestPalindrome(String s) {
        HashMap<Integer,String>  map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            for (int j=i+1;j<=s.length();j++){
                String s1=s.substring(i,j);
                //判断s1是否为回文字符串
                //转换成StringBuilder 类型
                StringBuilder stringBuilder =new StringBuilder(s1);
                stringBuilder.reverse();
                //如果是回文字串，就记录下长度
                if(stringBuilder.toString().equals(s1)){
                    map.put(s1.length(),s1);
                }
            }
        }
        //遍历hashmap 寻找最大的回文串
        Integer max=1;
        for(Integer key:map.keySet()){
            if (key>=max){
                max=key;
            }

        }
        return map.get(max);
    }


    public static void main(String[] args) {
        int a=0;
       String c= longestPalindrome("wjidwhdiwudhwdgwduwdhwkdwjdsgdwhdgdqioddjqewhlfegqreuqihewdkjewqdhweqduqewdkgqewdjewqdgewqduiyewgdewdqwsgdqwjkdkgq3eredilewhjdbweqdjkhewqdgewqjkqdgewdjkewdgwqeaaaaaaaaaaaaaaaadgqewdje3qgdqewkdgwejdqweikjdgdqwhjdgq3eqdqwkjdqwvdqwedqwdnbdwhecdbqwkhjcdbqwidhwedjwhdwjdsjdwqdgwjdwdbw");
        System.out.println(c);
    }

}
