package Day25Arrays;

import ReplitPractice.Array;

import java.util.Arrays;

public class BinARYSEARCH {
    public static void main(String[] args) {


        int[] arr={6,23,100,240,2000};
        //         0, 1, 2, 3,  4

        System.out.println(Arrays.binarySearch(arr,240));
        System.out.println(Arrays.binarySearch(arr,2000));

        System.out.println(Arrays.binarySearch(arr,6));
        System.out.println(Arrays.binarySearch(arr,25));

        System.out.println(Arrays.binarySearch(arr,500));

        System.out.println();


        int[] b={6,2,-1,4,20,-14};
        System.out.println(Arrays.binarySearch(b,4));// randomly correct
        System.out.println(Arrays.binarySearch(b,6));
        System.out.println(Arrays.binarySearch(b,-14));
       // binary search method does not work if the Array is not sorted
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.binarySearch(b,4));// randomly correct
        System.out.println(Arrays.binarySearch(b,6));
        System.out.println(Arrays.binarySearch(b,-14));
        System.out.println(Arrays.binarySearch(b,0));
        System.out.println();
        String[] words={"hello", "worlds","zebra","water"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.binarySearch(words,"hello"));
        System.out.println(Arrays.binarySearch(words,"Worlds"));
        System.out.println(Arrays.binarySearch(words,"yellow"));



    }
}
