import java.util.*;
public class MaximumProductOfThreeNumbers {

    //return the max product of three sums,
    // as the numbers could be negative as well, so get two choices
    // choice 1 deals with negative numbers as well, if the array is sorted
    // then multiply two negative numbers first and then the last number to get a positive result
    // in choice2 multiply the last three numbers of the sorted array
    // and then return the maximum out of choice1 and choice2
    public static int maximumProductOfThreeNumbers(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int choice1 = arr[0]*arr[1]*arr[n-1];
        int choice2 = arr[n-1]*arr[n-2]*arr[n-3];

        return Math.max(choice1, choice2);
    }

    public static void main(String[] args) {

    }
}
