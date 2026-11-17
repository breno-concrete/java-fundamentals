package dev.breno.leetcode.arrayshashing;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        List<String> copy = new ArrayList<>(Arrays.asList(strs));
        List<List<String>> result = new ArrayList<>();

        for (int i = 0; i < copy.size(); ) {

            List<String> subGroup = new ArrayList<>();
            subGroup.add(copy.get(i));
            String compared = copy.get(i);
            copy.remove(copy.get(i));

            for (int j = 0; j < copy.size(); ) {
                if (isAnagram(compared, copy.get(j))) {
                    subGroup.add(copy.get(j));
                    copy.remove(copy.get(j));
                } else {
                    j++;
                }



            }

            result.add(subGroup);

        }

        return result;
    }

    private boolean isAnagram(String s, String t) {

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
