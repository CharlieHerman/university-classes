import java.util.*;

public class Sorting
   {
    public int[] quickSort(int[] arr)
       {
        quickSortHelper(arr, 0, arr.length-1);
        return arr;
       }

    public void quickSortHelper(int[] arr, int lowIndex, int highIndex)
       {
        int partitionVal;
        if(lowIndex < highIndex)
           {
            partitionVal = runPartition(arr, lowIndex, highIndex);
            quickSortHelper(arr, lowIndex, partitionVal);
            quickSortHelper(arr, partitionVal+1, highIndex);
           }
       }

    public int runPartition(int[] arr, int lowIndex, int highIndex)
       {
        int partitionVal = arr[lowIndex];
        int partitionIndex = lowIndex;
        int index, arrIndex = lowIndex;
        int newArrLength = highIndex - lowIndex+1;
        int[] newArr = new int[newArrLength];
        for(index = 0; index < newArrLength; index++)
           {
            newArr[index] = arr[index+lowIndex];
           }
        for(index = 0; index < newArrLength; index++)
           {
               if(newArr[index] < partitionVal)
                  {
                   arr[arrIndex] = newArr[index];
                   arrIndex++;
                  }
           }
        arr[arrIndex] = partitionVal;
        partitionIndex = arrIndex;
        arrIndex++;
        for(index = 0; index < newArrLength; index++)
           {
               if(newArr[index] > partitionVal)
                  {
                   arr[arrIndex] = newArr[index];
                   arrIndex++;
                  }
           }
        return partitionIndex;
       }

    public int[] mergeSort(int[] arr)
       {
           mergeSortHelper(arr, 0, arr.length-1);
           return arr;
       }
    public void mergeSortHelper(int[] arr, int lowIndex, int highIndex)
       {
           if(lowIndex != highIndex)
              {
                  int midIndex = (highIndex+lowIndex)/2;
                  mergeSortHelper(arr, lowIndex,midIndex);
                  mergeSortHelper(arr, midIndex+1, highIndex);
                  runMerge(arr, lowIndex, midIndex, highIndex);
              }
       }

    public void runMerge(int[] arr, int lowIndex, int midIndex, int highIndex)
       {
           int arr1Length = midIndex+1-lowIndex;
           int arr2Length = highIndex-midIndex;
           int arr1Index = 0;
           int arr2Index = 0;
           int arrIndex = lowIndex;
           int[] arr1 = new int[arr1Length];
           int[] arr2 = new int[arr2Length];
           int index, smallestArrLength;
           if(arr1Length < arr2Length)
              {
                  smallestArrLength = arr1Length;
              }
           else
              {
                  smallestArrLength = arr2Length;
              }

           for(index = 0; index < arr1Length; index++)
              {
                  arr1[index] = arr[index+lowIndex];
              }

           for(index = 0; index < arr2Length; index++)
              {
                  arr2[index] = arr[index+midIndex+1];
              }
           while(arr1Index < arr1Length || arr2Index < arr2Length)
              {
                  if(arr1Index == arr1Length)
                     {
                         arr[arrIndex] = arr2[arr2Index];
                         arr2Index++;
                         arrIndex++;
                     }
                  else if(arr2Index == arr2Length)
                     {
                         arr[arrIndex] = arr1[arr1Index];
                         arr1Index++;
                         arrIndex++;
                     }
                  else if(arr1[arr1Index] < arr2[arr2Index])
                     {
                         arr[arrIndex] = arr1[arr1Index];
                         arr1Index++;
                         arrIndex++;
                     }
                  else if(arr2[arr2Index] < arr1[arr1Index])
                     {
                         arr[arrIndex] = arr2[arr2Index];
                         arr2Index++;
                         arrIndex++;
                     }
              }
       }

    public int[] bubbleSort(int[] arr)
       {
           int index, swapVal;
           boolean swapping = true;
           while(swapping)
              {
                  swapping = false;
                  for(index = 0; index < arr.length-1; index++)
                     {
                         if(arr[index+1] < arr[index])
                            {
                                swapVal = arr[index];
                                arr[index] = arr[index+1];
                                arr[index+1] = swapVal;
                                swapping = true;
                            }
                     }
              }
           return arr;
       }

    public int[] insertionSort(int[] arr)
       {
           int arrIndex, sortIndex, swapVal;
           for(arrIndex = 0; arrIndex < arr.length; arrIndex++)
              {
                  for(sortIndex = arrIndex; sortIndex >= 1; sortIndex--)
                     {
                         if(arr[sortIndex] < arr[sortIndex-1])
                            {
                                swapVal = arr[sortIndex];
                                arr[sortIndex] = arr[sortIndex-1];
                                arr[sortIndex-1] = swapVal;
                            }
                     }
              }
           return arr;
       }

    public int[] selectionSort(int[] arr)
       {
           int minIndex, searchIndex, currentMinIndex;
           int swapVal;

           for(minIndex = 0; minIndex < arr.length; minIndex++)
              {
                  currentMinIndex = minIndex;

                  for(searchIndex = minIndex; searchIndex < arr.length; searchIndex++)
                     {
                         if(arr[searchIndex] < arr[currentMinIndex])
                            {
                                currentMinIndex = searchIndex;
                            }
                     }
                  swapVal = arr[minIndex];
                  arr[minIndex] = arr[currentMinIndex];
                  arr[currentMinIndex] = swapVal;
              }
           return arr;
       }
   }
