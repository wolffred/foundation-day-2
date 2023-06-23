package org.example;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 1,1,1,1,2, 3, 4, 2, 3, 2, 3, 2};

        MostCommonElementFinder mostCommonElementFinder = new MostCommonElementFinder();
        int mostCommon = mostCommonElementFinder.findMostCommonElement(array) ;
        System.out.println("Most common element: " + mostCommon);


        int[] arrayy = {1, 2, 3, 4, 2, 3, 2, 3, 2};
        System.out.println("Original array: ");
        for (int num : arrayy) {
            System.out.print(num + " ");
        }

        RemoveItemsAfterMostCommon removeItemsAfterMostCommon = new RemoveItemsAfterMostCommon();

        removeItemsAfterMostCommon.removeItemsAfterMostCommon(arrayy);

        System.out.println("\nModified array: ");
        for (int num : arrayy) {
            System.out.print(num + " ");
        }
    }
}