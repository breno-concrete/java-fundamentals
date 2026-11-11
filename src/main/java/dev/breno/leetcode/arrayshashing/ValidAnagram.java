package dev.breno.leetcode.arrayshashing;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {


        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);

            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char letter = t.charAt(i);

            if (map.getOrDefault(letter, 0)> 0) {
                map.put(letter, map.get(letter) - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}
