package Sorting_Algo;

import java.util.Arrays;

public class Selection_sort {

    static void selection(int[] arr){
        //int m2 = max(arr);
        for (int i = 0; i < arr.length-i; i++){
              int last = arr.length-i-1;
              int m2 = maxindex(arr,0, last);
              swap(arr,m2,last);
//              System.out.println(m2);
//              System.out.println(arr.length-i);
//              int m1 = arr[arr.length-i-1];
//              System.out.println(m1);
//              int temp = m1;
//              m1 = m2;
//              m2 = temp;

        }


    }
    static  void swap(int[]arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int maxindex(int[] arr1, int start, int end){
        int max = start;
        //int max1 = arr1[start];
        for (int j = start; j < end; j++){
           if(arr1[j]> arr1[max]){
               max = j;
           }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] input = {1035,902,50987,80098,5,86,98};
        selection(input);
        System.out.println(Arrays.toString(input));
    }
}
