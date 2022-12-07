package com.wangzhiliang.data.datastructure.leet217;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set =new HashSet<>();
        for(int x: nums){
            if(!set.add(x)){
                return  true;
            }
        }
        return false;
    }

}
