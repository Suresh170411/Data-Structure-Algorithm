package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr [] = {3,5,1,9,8,2};
        bubbleSortTechnique(arr);
    }

    public static void bubbleSortTechnique (int arr []){
        boolean swapped;
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            swapped = false;
            for (int j=0; j<n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int arr [], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
