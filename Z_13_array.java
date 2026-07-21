
import java.util.*;

import javax.imageio.stream.IIOByteBuffer;

public class Z_13_array {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void binerySearchElementFindApproch(int[] arr, int selectedNum) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            mid = (start + end) / 2;
            System.out.println("your item  id start is= " + start + " end =" + end + " mid= " + mid);

            if (arr[mid] == selectedNum) {
                System.out.println("your selected value is presend at " + (mid));
                break;
            } else if (arr[mid] < selectedNum) {
                start = mid + 1;
            } else if (arr[mid] > selectedNum) {
                end = mid - 1;
            } else {
                System.out.println("your selected value is presend at " + (mid));
            }

        }

    }

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        int dummy = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (left == right || left > right) {
                System.out.print("your reverse array is ");
                printArray(arr);
                return;
            } else {

                dummy = arr[left];
                arr[left] = arr[right];
                arr[right] = dummy;
                left++;
                right--;

            }

        }

    }

    public static void pairsOfArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
        }
    }

    public static void subArray(int[] arr) { // time complexty o(n^3);
        int n = arr.length;

        // int minSubArraySum = 0;
        int minSubArraySum = Integer.MAX_VALUE;
        int maxSubArraySum = 0;

        // int n= (arr.length(arr.length+1))/2;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = 0;
                System.out.print("[");
                for (int k = i; k < j; k++) {
                    sum = sum + arr[k];
                    if (minSubArraySum > sum) {
                        minSubArraySum = sum;
                    } else if (maxSubArraySum < sum) {
                        maxSubArraySum = sum;
                    }
                    System.out.print(arr[k] + " ");
                }
                System.out.print("] , sum =" + sum);
                System.out.println();
            }
        }
        System.out.println(
                "the min sum arraySum = " + minSubArraySum + " maxSubArraySum = " + maxSubArraySum);
    }

    public static void maxSubArraySumUsingPrefixApproch(int[] arr) { // time complexty o(n^3);
        int[] prefixArr = new int[arr.length];
        int maxSubArraySum = 0;
        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            prefixArr[i] = prefixSum;
        }
        printArray(prefixArr);
        System.out.println();
        // int[] preArray = { 1, -2, 6, -1, 3 };

        for (int i = 0; i < prefixArr.length; i++) {
            int dummyItrationSum = 0;
            for (int j = i; j < prefixArr.length; j++) {
                int end = j;
                // dummyItrationSum = i == 0 ? prefixArr[i] : [end] - prefixArr[i - 1];
                dummyItrationSum = i == 0 ? prefixArr[end] - 0
                        : prefixArr[end] - prefixArr[i
                                - 1];
                System.out.print(dummyItrationSum + " ");
                if (maxSubArraySum < dummyItrationSum) {
                    maxSubArraySum = dummyItrationSum;

                }
            }
            System.out.println();

        }

        // int n= (arr.length(arr.length+1))/2;

        System.out.println(
                "the  maxSubArraySum = " + maxSubArraySum);
    }

    public static void maxSuminSubArrayBykadaanAlgo(int[] arr) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (currentSum < 0) {
                currentSum = 0;

            }
            currentSum += arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        System.out.println("The max sum in sub array is = " + maxSum);
    }

    public static void trappingRainWater(int[] arr) {
        int[] leftMaxBar = new int[arr.length];
        int[] rightMaxBar = new int[arr.length];

        int maxLeftBarTracker = 0;
        int maxRightBarTracker = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                maxLeftBarTracker = arr[i];

            } else if (arr[i] > maxLeftBarTracker) {
                maxLeftBarTracker = arr[i];

            }
            leftMaxBar[i] = maxLeftBarTracker;

            // right maxbar array logic in same loop added;
            int index = arr.length - 1 - i;
            if (index == arr.length - 1) {
                maxRightBarTracker = arr[index];

            } else if (arr[index] > maxRightBarTracker) {
                maxRightBarTracker = arr[index];

            }
            rightMaxBar[index] = maxRightBarTracker;

        }
        printArray(leftMaxBar);
        System.out.println();
        printArray(rightMaxBar);
        System.out.println();

        int totalWaterTraped = 0;
        for (int i = 0; i < arr.length; i++) {
            int leftMaxBarValue = leftMaxBar[i];
            int rightMaxBarValue = rightMaxBar[i];
            if (leftMaxBarValue > rightMaxBarValue) {
                totalWaterTraped = totalWaterTraped + rightMaxBarValue - arr[i];

            } else {
                totalWaterTraped = totalWaterTraped + leftMaxBarValue - arr[i];
            }

        }
        System.out.println("The total traped water is " + totalWaterTraped);

    }

    public static void buyAndSale(int[] arr) {
        int minimumPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                minimumPrice = arr[i];
            } else {

                minimumPrice = Math.min(minimumPrice, arr[i]);
                maxProfit = Math.max(maxProfit, arr[i] - minimumPrice);
            }
        }
        System.out.println("The maximum profit is " + maxProfit);

    }

    public static void pushAllZeroAtLastWithSameOrder(int[] arr) {
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                arr[i] = 0;
                j++;
            }
        }
        printArray(arr);
    }

    public static void productExceptSelf(int[] arr) {
        int[] res = new int[arr.length];
        res[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            res[i] = arr[i - 1] * res[i - 1]; // all left value form current element
        }

        int rightProduct = 1;
        for (int j = arr.length - 1; j >= 0; j--) {
            res[j] = res[j] * rightProduct;
            rightProduct = arr[j] * rightProduct;

        }
        printArray(res);
    }

    public static void kandansSubArrayAlog(int[] arr) {

        int startIndex = 0;
        int startTempIndex = 0;
        int endIndex = 0;
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        // { -2, -3, 2, -1, -2, 1, 5, -8, 1, 4
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum < 0) {
                startTempIndex = i;
                currentSum = 0;
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
                // System.out.println("The max sum in sub array is current = " + currentSum + "
                // = " + maxSum);
                startIndex = startTempIndex;

                endIndex = i;
            }
        }
        System.out.println("The max sum in sub array is ");
        for (int i = startIndex + 1; i <= endIndex; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The max sum in sub array is addition  = " + maxSum);
    }

    public static void main(String[] args) {
        // int[] arr = { 2, 4, 6, 8, 10, 12 };
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value ");
        // int num = sc.nextInt();
        // binerySearchElementFindApproch(arr, num);
        // reverseArray(arr);
        // pairsOfArray(arr);
        // subArray(arr);
        // int[] preArray = { -2, -3, 4, -1, -2, 1, 2 };
        // // int[] preArray = { 1, -2, 6, -1, 3 }; 
        // maxSubArraySumUsingPrefixApproch(preArray);
        // maxSuminSubArrayBykadaanAlgo(preArray);

        // int[] arr = { 4, 2, 1, 6, 3, 2, 5 };
        // trappingRainWater(arr);
        // int[] arr = { 7, 9, 5, 1, 6, 7 };
        // buyAndSale(arr);
        int[] arr = { 0, 7, 0, 0, 1, 6, 7 };
        pushAllZeroAtLastWithSameOrder(arr);
        productExceptSelf(new int[] { 1, 2, 3, 4 });

        kandansSubArrayAlog(new int[] { -2, -3, 2, -1, -2, 1, 5, -8, 7 });
    }

}
