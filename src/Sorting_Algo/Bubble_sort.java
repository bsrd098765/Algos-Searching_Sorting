package Sorting_Algo;

import java.util.Arrays;

public class Bubble_sort {

    static void  bubble(int[] array){
        for(int i = 0; i < array.length;i++){
            for(int j = 1; j < array.length-i;j++){
                if(array[j]<array[j-1]){
                    int temp = array [j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }

        }
//        return array;
    }

    public static void main(String[] args) {
        int[] input = {1035,902,50987,80098,5,86,98};
        bubble(input);
        System.out.println(Arrays.toString(input));
    }

}
