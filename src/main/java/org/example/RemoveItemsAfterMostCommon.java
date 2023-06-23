package org.example;

import java.util.HashMap;
import java.util.Map;

public class RemoveItemsAfterMostCommon {
    public void removeItemsAfterMostCommon(int[] array) {
        // Create a HashMap to store the count of each element
        Map<Integer, Integer> countMap = new HashMap<>();

        // Iterate over the array and count the occurrences of each element
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
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

        // Remove items to the right of each occurrence of the most common element
        boolean removeNextItems = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == mostCommonElement) {
                removeNextItems = false;
            } else if (removeNextItems) {
                array[i] = -1; // Set the item to a sentinel value (-1) for removal
            } else {
                removeNextItems = true;
            }
        }

        // Perform the removal by shifting the non-sentinel values to the left
        int writeIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                array[writeIndex++] = array[i];
            }
        }

        // Resize the array by setting the remaining elements to 0
        for (int i = writeIndex; i < array.length; i++) {
            array[i] = 0;
        }
    }


}

