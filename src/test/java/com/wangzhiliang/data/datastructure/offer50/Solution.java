package com.wangzhiliang.data.datastructure.offer50;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public char firstUniqChar(String s) {
        HashMap<Character, Integer> frequency= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            frequency.put(ch,frequency.getOrDefault(ch,0)+1);
        }

        for (int i = 0; i < s.length(); ++i) {
            if (frequency.get(s.charAt(i)) == 1) {
                return s.charAt(i);
            }
        }
        return ' ';

    }
}
