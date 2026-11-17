package dev.breno.leetcode.arrayshashing;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

//https://leetcode.com/problems/group-anagrams/description/
class GroupAnagramsTest {

    GroupAnagrams groupAnagrams = new GroupAnagrams();

    @Test
    void hasToReturnRightArray() {
        String[] words = {"sol", "los", "casa", "saca"};

        List<List<String>> expected = List.of(
                List.of("sol", "los"),   // as de tamanho 3
                List.of("casa", "saca")          // as de tamanho 4
        );

        List<List<String>> result = groupAnagrams.groupAnagrams(words);

        assertEquals(normalize(expected), normalize(result));



    }

    @Test
    void multipleGroups() {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> expected = List.of(
                List.of("bat"),
                List.of("nat", "tan"),
                List.of("ate", "eat", "tea")
        );

        List<List<String>> result = groupAnagrams.groupAnagrams(words);

        assertEquals(normalize(expected), normalize(result));



    }




    private Set<List<String>> normalize(List<List<String>> lista) {
        Set<List<String>> set = new HashSet<>();

        for (List<String> group : lista) {
            List<String> groupCopy = new ArrayList<>(group);
            Collections.sort(groupCopy);
            set.add(groupCopy);
        }

        return set;
    }

}