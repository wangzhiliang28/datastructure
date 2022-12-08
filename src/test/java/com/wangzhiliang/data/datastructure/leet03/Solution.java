package com.wangzhiliang.data.datastructure.leet03;

import java.util.HashSet;

public class Solution {

    public int findRepeatNumber(int[] nums) {

        HashSet<Integer> set =new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                    return nums[i];
            }
        }
        return 0;
    }




}
