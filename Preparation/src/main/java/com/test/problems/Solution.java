package com.test.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public static void main(String[] args) {
        String paragraph = "Rose: is a flower, red rose are flower.";
        String[] banned = { "i", "love", "leetcode", "i", "love", "coding" };

        List<String> resultSet = topKFrequent(banned, 2);
        resultSet.stream().forEach(a -> {
            System.out.println(a);
        });
    }

    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> count = new HashMap<>();
        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }


        List<String> candidates = new ArrayList(count.keySet());
        Collections.sort(candidates, (w1, w2) -> count.get(w1).equals(count.get(w2)) ?
                w1.compareTo(w2) : count.get(w2) - count.get(w1));


        PriorityQueue<String> heap = new PriorityQueue<String>(
                (w1, w2) -> count.get(w1).equals(count.get(w2)) ? w2.compareTo(w1) : count.get(w1) - count.get(w2));

        for (String word : count.keySet()) {
            heap.offer(word);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        List<String> ans = new ArrayList<>();
        while (!heap.isEmpty()) {
            ans.add(heap.poll());
        }
        Collections.reverse(ans);
        return ans;
    }
}