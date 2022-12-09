package com.wangzhiliang.data.datastructure.leet350;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        if (nums1.length>nums2.length){
            return intersect(nums2,nums1);
        }

        Map<Integer,Integer> map =new HashMap<>();
        for (int num:nums1){
            int count =map.getOrDefault(num,0)+1;
            map.put(num,count);

        }

        int[] intersection = new int[nums1.length];



        return null;
        }

    }

