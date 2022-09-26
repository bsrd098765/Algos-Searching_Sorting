package Searching_Algo;

//Binary-Search can be applied for only sorted arrays

import java.util.Arrays;

public class Binary_search {

    static int binarySearch(int[] bs,int target1){
        int start = 0 ;
        int end = bs.length-1;
        //Arrays.stream(bs).sorted();
        while(start <= end) {
            int mid = start + (end - start) / 2;
             if (bs[mid] > target1) {
                end = mid - 1;
            } else if (bs[mid] < target1) {
                start = mid + 1;
            }else {
                 return mid;
             }
        }


        return -1;
    }



    public static void main(String[] args) {
        int[] input = {5,10,15,20,35,40,45,55,60,75};
        int target = 35;
       System.out.println(binarySearch(input,target));
    }
}
