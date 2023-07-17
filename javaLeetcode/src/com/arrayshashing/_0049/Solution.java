package javaLeetcode.src.com.arrayshashing._0049;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> res = new ArrayList<>();

    if (strs.length == 0)
      return res;

    HashMap<String, List<String>> map = new HashMap<>();

    for (String s : strs) {
      int[] hash = new int[26];
      for (char c : s.toCharArray()) {
        hash[c - 'a']++;
      }
      String key = new String(Arrays.toString(hash));
      map.computeIfAbsent(key, k -> new ArrayList<>());
      map.get(key).add(s);
    }

    res.addAll(map.values());
    return res;
  }

  public static void main(String[] args) {
    String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

    Solution solution = new Solution();
    List<List<String>> answer = solution.groupAnagrams(strs);
    System.out.println(answer);
  }
}