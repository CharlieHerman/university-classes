import java.time.*;
public class SortingDriver
   {
    public static void main(String args[])
       {

        Sorting obj = new Sorting();
        int[] arr = {36,48,1,82,83,62,98,3,31,25,74,57,27,71,50,29,75,77,26,35,6,96,100,19,44,5,17,67,23,43,16,32,49,28,78,64,42,10,80,73,90,38,55,12,34,63,59,88,2,18,22,20,51,45,99,79,84,47,97,52,30,60,93,33,37,92,8,70,87,40,81,89,21,56,4,39,85,66,65,13,61,41,69,24,46,91,58,72,94,15,11,9,14,76,54,7,95,86,53,68};
        long startTime = 0;
        long endTime = 0;

        /*
        System.out.println("Merge sorting...");
        printArr(arr);
        startTime = System.currentTimeMillis();
        arr = obj.mergeSort(arr);
        endTime = System.currentTimeMillis();
        System.out.println("        |\n        v");
        printArr(arr);
        System.out.println("Completed, in: " + (endTime - startTime) + "ms\n");
        */

        /*
        System.out.println("Bubble sorting...");
        arr = arr;
        printArr(arr);
        startTime = System.currentTimeMillis();
        arr = obj.bubbleSort(arr);
        endTime = System.currentTimeMillis();
        System.out.println("        |\n        v");
        printArr(arr);
        System.out.println("Completed, in: " + (endTime - startTime) + "ms\n");
        */

        /*
        System.out.println("Selection sorting...");
        arr = arr;
        printArr(arr);
        startTime = System.currentTimeMillis();
        arr = obj.selectionSort(arr);
        endTime = System.currentTimeMillis();
        System.out.println("        |\n        v");
        printArr(arr);
        System.out.println("Completed, in: " + (endTime - startTime) + "ms\n");
        */

        /*
        System.out.println("Insertion sorting...");
        arr = arr;
        printArr(arr);
        startTime = System.currentTimeMillis();
        arr = obj.insertionSort(arr);
        endTime = System.currentTimeMillis();
        System.out.println("        |\n        v");
        printArr(arr);
        System.out.println("Completed, in: " + (endTime - startTime) + "ms\n");
        */


        System.out.println("Quick sorting...");
        arr = arr;
        printArr(arr);
        startTime = System.currentTimeMillis();
        arr = obj.quickSort(arr);
        endTime = System.currentTimeMillis();
        System.out.println("        |\n        v");
        printArr(arr);
        System.out.println("Completed, in: " + (endTime - startTime) + "ms\n");

       }

    public static void printArr(int[] arr)
       {
           for(int i = 0; i < arr.length; i++)
              {
               System.out.print(arr[i] + ",");
              }
           System.out.println();
       }
   }
