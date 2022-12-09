package com.wangzhiliang.data.datastructure.offer53;

public class Solution {
    //本题的核心在于找到边界，是有序数组搜索问题
    //利用二分法查询
    public int search(int[] nums, int target) {
        //寻找左边界
        int i=0;
        int j= nums.length-1;
        while(i<=j){
            int m=(i+j)/2;
            if(nums[m]<=target){
                i=m+1;
            }
            else j=m-1;
        }



        //寻找右边界
        while(i<=j){
            int m=(i+j)/2;
            if(nums[m]<target){
                i=m+1;
            }
            else j=m-1;
        }




     return 0;
    }

}
