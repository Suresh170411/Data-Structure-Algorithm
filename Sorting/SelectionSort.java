package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr [] = {2,1,8,5,9,4};
        selectionSortTechnique(arr);
    }

    public static void selectionSortTechnique(int arr []){
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            int smallest = i;
            for (int j=i+1; j<n; j++){
                if (arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            swap(arr, smallest, i);
        }
        System.out.println(Arrays.toString(arr));
    }
  //https://github.com/Suresh170411/Data-Structure-Algorithm.git
    private static void swap(int arr [], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
