import java.util.*;
public class MaximumProductOfThreeNumbers {
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
