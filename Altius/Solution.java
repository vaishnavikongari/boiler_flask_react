import java.util.*;
import java.util.*;
// import java.utils.arrays.binarySearch;

public class Solution {
    public static int longestSequence(int[] nums) {
        int dp[] = new int[nums.length];
        int n = nums.length;
        for (int j = 0; j < n; j++) {
            int i= java.util.Arrays.binarySearch(dp, 0, len, j);
            if (i < 0) {
                i = -(i + 1);
            }
            dp[i] = num;
            if (i == len)
                len++;
        }
        return len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int c = longestSequence(arr);
        System.out.print(c);
    }
}
