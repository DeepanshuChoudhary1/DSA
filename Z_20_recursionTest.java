import java.util.*;

       public class Z_20_recursionTest {

    public static int sumOfnaturalNo(int n) {
        if (n == 0) {
            return 0;
        }
        return sumOfnaturalNo(n - 1) + n;
    }

    public static int digitCount(int n) {
        if (n == 0) {
            return 0;
        }
        return digitCount(n / 10) + 1;
    }

    public static int digitNoSum(int n) {
        if (n == 0) {
            return 0;

        }
        int digit = digitNoSum(n / 10);
        int persentDigit = n % 10;
        int sum = digit + persentDigit;
        System.out.println("digit value = " + digit + " persontage " + persentDigit + " n= " + n);
        return sum;
        // return digitNoSum(n / 10) + n % 10;
    }

    static int reverse(int n, int rev) {
        if (n == 0)
            return rev;

        return reverse(n / 10, rev * 10 + n % 10);
    }

    static boolean ispalindrom(String s, int left, int right) {

        if (left >= right) {
            return true;
        }

        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return ispalindrom(s, ++left, --right);

    }

    static int maxElementInArr(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }

        int output = maxElementInArr(arr, idx + 1);
        return Math.max(output, arr[idx]);

    }

    static boolean isArrSorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] > arr[idx + 1]) {
            return false;
        }
        return isArrSorted(arr, idx + 1);

    }

    static int firstOccurenceOfKey(int arr[], int idx, int key) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == key) {
            return idx;
        }
        return firstOccurenceOfKey(arr, idx + 1, key);

    }

    static int lastOccurenceOfKey(int arr[], int idx, int key) {
        if (idx == arr.length) {
            return -1;
        }

        int index = lastOccurenceOfKey(arr, idx + 1, key);
        if (arr[idx] == key && index == -1) {
            return idx;
        }
        return index;

    }

    static int countOccurenceOfKey(int arr[], int idx, int key) {
        if (idx == arr.length) {
            return 0;
        }
        if (arr[idx] == key) {
            return countOccurenceOfKey(arr, idx + 1, key) + 1;
        }

        return countOccurenceOfKey(arr, idx + 1, key);

    }

    static String removeConsecutiveChar(String str, int idx, StringBuilder newStr) {
        if (idx == str.length() - 1) {
            newStr.append(str.charAt(idx));
            return newStr.toString();
        }
        if (str.charAt(idx) != str.charAt(idx + 1)) {
            newStr.append(str.charAt(idx));
        }
        return removeConsecutiveChar(str, idx + 1, newStr);

    }

    static void printContigiuousStr(String str, int left, int right) {
        int strLength = str.length();
        if (left == strLength) {
            return;
        }
        if (right == strLength) {
            left = left + 1;
            right = left;
        } else {
            right = right + 1;
        }

        System.out.print(str.substring(left, right) + " ");
        printContigiuousStr(str, left, right);

    }

    static int countContigiuousStr(String str, int left, int right) {

        int strLength = str.length();
        if (left == strLength - 1) {
            return 0;
        }
        if (right == strLength) {
            left = left + 1;
            right = left + 1;
        } else {
            right = right + 1;
        }
        System.out.print(str.substring(left, right) + " ");

        return countContigiuousStr(str, left, right) + 1;

    }

    public static void allUniqueSubSeq(String s, int idx, StringBuilder ans) {
        if (idx == s.length()) {
            System.out.print(ans + " ");
            return;
        }
        ans.append(s.charAt(idx));
        allUniqueSubSeq(s, idx + 1, ans);
        // backtraking
        ans.deleteCharAt(ans.length() - 1);
        allUniqueSubSeq(s, idx + 1, ans);
    }

    static String[] keypad = {
            "",
            "",
            "ABC",
            "DEF",
            "GHI",
            "JKL",
            "MNO",
            "PQRS",
            "TUV",
            "WXYZ" };

    public static void mobileKeypadCom(String str, int idx, String combin) {
        if (idx == str.length()) {
            System.out.println(combin);
            return;
        }

        char num = str.charAt(idx);
        String mapping = keypad[num - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            mobileKeypadCom(str, idx + 1, combin + mapping.charAt(i));
        }

    }

    public static void xsetAtLast(String str, int idx, int count, StringBuilder newStr) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newStr.append('x');
            }
            System.out.println(newStr);
            return;
        }

        char ch = str.charAt(idx);
        if (ch == 'x') {
            count++;
        } else {
            newStr.append(ch);
        }

        xsetAtLast(str, idx + 1, count, newStr);

    }

    public static void main(String[] args) {
        System.out.println("the output of sumOfnaturalNo is " + sumOfnaturalNo(5));
        System.out.println("the output of digitCount is " + digitCount(123855));
        System.out.println("the output of digit sum is = " + digitNoSum(123855));
        System.out.print("the reverse number is " + reverse(8241, 0));
        System.out.println();
        System.out.println("----------------- isPlindrom-------------");
        String p = "abcba";
        System.out.print("is String palindrom " + ispalindrom(p, 0, p.length() - 1));
        System.out.println("----------------- maxElementinArray-------------");
        int[] arr = { 1, 2, 3, 5, 3, 3, 4, 3, 2 };
        System.out.println("the max element in arr = " + maxElementInArr(arr, 0));
        System.out.println("is arr sorted = " + isArrSorted(arr, 0));
        System.out.println("the first occurence of key is at indx = " + firstOccurenceOfKey(arr, 0, 3));
        System.out.println("the last occurence of key is at indx = " + lastOccurenceOfKey(arr, 0, 3));
        System.out.println("the count occurence of key is = " + countOccurenceOfKey(arr, 0, 3));
        System.out.println(
                "the remove consective one  is = "
                        + removeConsecutiveChar("aaabbccddddgggdgdgg", 0, new StringBuilder()));
        printContigiuousStr("abcd", 0, 0);
        System.out.println();
        System.out.println("the total contigious substring count = " + countContigiuousStr("abcd", 0, 0));

        allUniqueSubSeq("abc", 0, new StringBuilder(""));
        System.out.println();
        mobileKeypadCom("23", 0, "");
        xsetAtLast("abxxcdxxxfxhx", 0, 0, new StringBuilder(""));
    }
}