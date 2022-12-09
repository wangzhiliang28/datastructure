package com.wangzhiliang.data.datastructure.leet53;

public class Solution {
    public int maxSubArray(int[] nums) {
        int pre=0;
        int maxAns=nums[0];
        for(int i=0;i<nums.length;i++){
            pre=Math.max(pre+i,i);

        }
       return 0;
    }
}
