package org.example;

import java.util.HashMap;
import java.util.Map;

public class MostCommonElementFinder {



    public int findMostCommonElement(int[] array) {
        // Create a HashMap to store the count of each element
        Map<Integer, Integer> countMap = new HashMap<>();

        // Iterate over the array and count the occurrences of each element
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);

//            int count = chars.getOrDefault(character, 0);
//            chars.put(character, count + 1);

        }

        int mostCommonElement = 0;
        int maxCount = 0;

        // Find the element with the maximum count
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommonElement = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostCommonElement;
    }

}

