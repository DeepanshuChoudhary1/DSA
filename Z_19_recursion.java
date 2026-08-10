public class Z_19_recursion {
    static void printDecNo(int num) {
        if (num == 1) {
            System.out.print(num + " ");
            return;
        }
        num--;
        System.out.print(num + " ");

        printDecNo(num);

    }

    static void printIncNo(int num) {
        if (num == 0) {
            return;
        }

        printIncNo(num - 1);
        System.out.println(num + " ");
        return;
    }

    // int fact=0;

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        System.out.println("before calling fact value = " + " n= " + n);
        int fact = factorial(n - 1);
        System.out.println("fact value = " + fact + " n= " + n);
        return n * fact;
    }

    public static int sumOfnaturalNo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = sumOfnaturalNo(n - 1);
        System.out.println("fact value = " + fact + " n= " + n);
        return n + fact;
    }

    // -----------------------------------

    public static int fibonacchi(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fib1 = fibonacchi(n - 1);
        int fib2 = fibonacchi(n - 2);
        return fib1 + fib2;
    }

    // -----------------------------------

    public static boolean isArrSorted(int[] arr, int i) {
        if (arr.length - 1 == i) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isArrSorted(arr, i + 1);

    }
    // -----------------------------------

    public static int findKeyFirstOccurence(int[] arr, int key, int i) {
        if (arr.length - 1 == i) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return findKeyFirstOccurence(arr, key, i + 1);
    }

    // -----------------------------------

    public static int findKeyLastOccurence(int[] arr, int key, int i) {
        if (arr.length == i) {
            return -1;
        }

        int keyIdx = findKeyLastOccurence(arr, key, i + 1);
        if (keyIdx == -1 && arr[i] == key) {
            return i;
        }
        return keyIdx;

    }

    // -----------------------------------
    public static int power(int n, int p) {
        if (p == 0) {
            return 1;
        }
        return n * power(n, p - 1);
    }

    public static int optimizePower(int n, int p) {
        if (p == 0) {
            return 1;
        }
        int halfPower = optimizePower(n, p / 2);
        int halfPowerSq = halfPower * halfPower;
        if ((p & 1) != 0) { // check numer is odd or not if odd then {}
            halfPowerSq = halfPowerSq * n;
        }
        return halfPowerSq;
    }

    public static int tilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // int nm1 = tilingProblem(n - 1);
        // int nm2 = tilingProblem(n - 2);
        // return nm1 + nm2;
        return tilingProblem(n - 1) + tilingProblem(n - 2);
    }

    public static int friendPairProblem(int n) {
        // if a, b, c are freind the a can be singe also b or c or can pair like ab, c
        if (n == 1 || n == 2) {
            return n;

        }
        // if (n == 0 || n == 1) {
        // return 1;

        // }

        // if single
        int fn1 = friendPairProblem(n - 1);
        System.out.println("the single friend is = " + n);

        // if choise
        int fn2 = (n - 1) * friendPairProblem(n - 2);
        System.out.println("the paired friend is = " + n);

        int totalWays = fn1 + fn2;
        System.out.println("the total ways of friend pair problem is = " + totalWays);
        return totalWays;
    }

    public static String removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            return newStr.toString();
        }
        char ch = str.charAt(idx);
        if (map[ch - 'a'] == false) {
            map[ch - 'a'] = true;
            newStr.append(ch);
        }
        return removeDuplicates(str, idx + 1, newStr, map);
    }

    public static void binaryStringConsecutiveOne(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;

        }
        System.out.println("before exicution n = " + n + " lastPlace = " + lastPlace + " str = " + str);

        System.out.println("add (0)");
        binaryStringConsecutiveOne(n - 1, 0, str + "0");
        System.out.println(" n = " + n + " lastPlace = " + lastPlace + " str = " + str);
        if (lastPlace == 0) {
            System.out.println("add (1)");
            binaryStringConsecutiveOne(n - 1, 1, str + "1");
            System.out.println(" n = " + n + " lastPlaces = " + lastPlace + " str = " + str);

        }

    }

    static String[] enNum = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void printNumbersInEnglish(int n) {
        if (n == 0) {
            return;
        }
        int digit = n % 10;
        System.out.println("the digit is = " + digit + "  n = "
                + n);
        printNumbersInEnglish(n / 10);
        System.out.print(enNum[digit] + " ");
        System.out.println("the digit is = " + digit + "  n = "
                + n);

    }

    public static int length(String str, int idx) {

        try {
            str.charAt(idx);
            return length(str, idx + 1);

        } catch (Exception e) {

            return idx;
        }

    }

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);

    }

    public static void printContigiousString(String str, int sIdx, int lIdx) {

        if (sIdx == str.length()) {

            return;
        }
        // System.out.println("the sIdx = " + sIdx + " lIdx = " + lIdx + " str = " +
        // str.substring(sIdx, lIdx));
        if (lIdx != 0 && str.charAt(sIdx) == str.charAt(lIdx - 1)) {
            // try {
            // System.out.println(str.charAt(lIdx - 1));
            // } catch (Exception e) {
            // System.out.println("the exception is = " + e);
            // }

            System.out.print(str.substring(sIdx, lIdx) + " ");
        }

        if (lIdx == str.length()) {
            printContigiousString(str, sIdx + 1, sIdx + 1);
            return;
        } else {

            printContigiousString(str, sIdx, lIdx + 1);
        }

    }

    public static void main(String[] args) {
        printIncNo(10);
        System.out.println();
        // printDecNo(10);

        System.out.println("the output of factorial is " + factorial(5));
        System.out.println("the output of sumOfnaturalNo is " + sumOfnaturalNo(5));
        System.out.println("the output of nth fibonacchi is = " + fibonacchi(6));

        int[] arr = { 2, 4, 6, 6, 6, 9, 8 };
        System.out.println("is arr is sorted is ? = " + isArrSorted(arr, 0));
        System.out.println("key find at first start index = " + findKeyFirstOccurence(arr, 6, 0));
        System.out.println("last last occurrence key index = " + findKeyLastOccurence(arr, 6, 0));
        System.out.println("the power of var is value = " + power(2, 10));
        System.out.println("the optimized power of var is value = " + optimizePower(2, 10));
        System.out.println("-------------------tiling problem-------------------");
        System.out.println("the tiling problem solution is = " + tilingProblem(6));
        System.out.println("-------------------friend pair problem-------------------");
        System.out.println("the friend pair problem solution is = " + friendPairProblem(3));
        System.out.println("-------------------remove dupicates in String problem-------------------");
        System.out.println("the remove duplicates solution is = "
                + removeDuplicates("deepanshuu", 0, new StringBuilder(), new boolean[26]));
        System.out.println("-------------------binary string with consecutive ones-------------------");
        binaryStringConsecutiveOne(1, 0, "");
        System.out.println("------------------- some practice question in pdf------------------- ");
        printNumbersInEnglish(720);
        System.out.println("the length of the string is = " + length("deepa", 0));
        towerOfHanoi(3, "A", "B", "C");
        System.out.println(
                "-------------------contiguous sub string and strting and end char same problem-------------------");
        printContigiousString("abcab", 0, 0);

    }
}
