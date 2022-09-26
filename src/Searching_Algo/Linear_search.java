package Searching_Algo;

public class Linear_search {



    static int linearsearch(int[] input1, int target1){
        for (int i =0;i < input1.length;i++){
            if(input1[i] == target1){
                System.out.println(target1+" is Found at index "+i);
                return i;
            }
        }
        return -1;
    }

    static int min(int[] input1){
        int min = input1[0];
        for (int i =1;i < input1.length;i++){
            if(input1[i] < min) {
                min = input1[i];

            }
        }
        System.out.println("min value in the array is  " + min);
        return min;
    }

    static int max(int[] input1){
        int max = input1[0];
        for (int i =1;i < input1.length;i++){
            if(input1[i] > max) {
                max = input1[i];

            }
        }
        System.out.println("max value in the array is  " + max);
        return max;
    }

    static int evenCount(int[] input1){
        int count = 0;
        int evencount = 0;
        for (int i =0;i < input1.length;i++){
            while(input1[i] > 0){
                input1[i] = input1[i]/10;
                count = count+1;

            }
            System.out.println(count);
            if(count%2==0){
                evencount =evencount+1;

            }
        }
        System.out.println("No Of elements in array of even count"+ evencount);
        return evencount;
    }

    static int linearSearchRange(int[] input1, int target1, int start, int end){
        for (int i =start;i <= end;i++){
            if(input1[i] == target1){
                System.out.println(target1+" is Found in the range at index "+i);
                return i;
            }
        }
        return -1;
    }

    static int linearSearchchar(String input2, char target2){
        for (int j =0 ;j < input2.length();j++){
            if(input2.charAt(j) == target2){
                System.out.println(target2+" is Found at index "+j);
                return j ;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
//        int[] input = {1035, 45, 90,50,80,55,86,98};
//        int target = 55;
//        System.out.println(linearsearch(input,target));

//        int[] input = {1035, 45, 90,50,80,55,86,98};
//        int target = 1035, start =4, end = 7;
//        System.out.println(linearSearchRange(input,target,start,end));

        int[] input = {1035,902,50987,80098,5,86,98};
//        System.out.println(min(input));
//        System.out.println(max(input));
          System.out.println(evenCount(input));

//        String s = "Ravulpalem";
//        char c = 'm';
//        System.out.println(linearsearchchar(s,c));


    }



}
