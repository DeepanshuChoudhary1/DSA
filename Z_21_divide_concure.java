public class Z_21_divide_concure {

    public static void printArr(int arr[]) {

        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void printStrArr(String arr[]) {

        for (String e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    // <-------merge sort code-->
    public static void mergeSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, ei, mid);

    }

    public static void merge(int arr[], int si, int ei, int mid) {
        int[] temp = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] > arr[j]) {
                temp[k] = arr[j];
                j++;
            } else {
                temp[k] = arr[i];
                i++;

            }

            k++;

        }

        while (i <= mid) {
            temp[k++] = arr[i++];
            // mean
            // temp[k] = temp[i];
            // i++;
            // k++;
        }
        while (j <= ei) {
            temp[k++] = arr[j++];

        }
        // for (int p = 0; p < temp.length; p++) {
        // arr[p] = temp[p];
        // }
        for (i = si, k = 0; k < temp.length; i++, k++) {
            arr[i] = temp[k];

        }
    }

    // ------------ quick sort algo ----------------->
    public static void quickSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pivitIdx = partition(arr, si, ei);
        quickSort(arr, si, pivitIdx - 1);
        quickSort(arr, pivitIdx + 1, ei);
    }

    public static int partition(int[] arr, int si, int ei) {
        int pivitIdx = ei;

        int i = si - 1;
        for (int j = si; j < ei; j++) {

            if (arr[j] <= arr[pivitIdx]) {

                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }

        i++;
        int temp = arr[i];
        arr[i] = arr[pivitIdx];
        arr[pivitIdx] = temp;
        return i;
    }

    // ------------------find a element index in sorted and reverse
    // array----------->
    public static int findElementInSortedReverseArray(int arr[], int si, int ei, int tar) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;

        if (arr[mid] == tar) {
            return mid;
        }

        if (arr[si] <= arr[mid]) {
            if (arr[si] <= tar && tar < arr[mid]) {
                return findElementInSortedReverseArray(arr, si, mid - 1, tar);
            } else {
                return findElementInSortedReverseArray(arr, mid + 1, ei, tar);
            }

        } else {
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return findElementInSortedReverseArray(arr, mid + 1, ei, tar);
            } else {
                return findElementInSortedReverseArray(arr, si, mid - 1, tar);
            }
        }

        // if (arr[mid] > tar) {
        // if (tar >= arr[si]) {
        // return findElementInSortedReverseArray(arr, si, mid - 1, tar);
        // } else {
        // return findElementInSortedReverseArray(arr, mid + 1, ei, tar);
        // }
        // } else {
        // return findElementInSortedReverseArray(arr, mid + 1, ei, tar);
        // }

        // if (arr[si] < tar && tar < arr[mid]) {
        // return findElementInSortedReverseArray(arr, si, mid - 1, tar);
        // } else {
        // return findElementInSortedReverseArray(arr, mid + 1, ei, tar);
        // }
    }

    // <---------------------problem Questins pdf------------>
    // private static int inverseCount = 0;

    public static int mergeSorts(int arr[], int si, int ei) {

        if (si >= ei) {
            return 0;
        }
        int mid = si + (ei - si) / 2;

        int l = mergeSorts(arr, si, mid);
        int r = mergeSorts(arr, mid + 1, ei);
        int count = merges(arr, si, ei, mid);
        System.out.println("(2) the left = " + l + " right = " + r + " count= " + count);
        return l + r + count;
    }

    public static int merges(int[] arr, int si, int ei, int mid) {
        System.out.println("in merge fun the si " + si + " ei = " + ei + " mid= " + mid);
        int i = si;
        int j = mid + 1;
        int k = 0;
        int count = 0;
        int[] temp = new int[ei - si + 1];

        while (i <= mid && j <= ei) {
            if (arr[i] > arr[j]) {
                temp[k] = arr[j];

                j++;
                count = (mid - i + 1);
            } else {
                temp[k] = arr[i];

                i++;

            }
            k++;
        }
        while (i <= mid) {

            temp[k++] = arr[i++];

        }
        while (j <= ei) {

            temp[k++] = arr[j++];

        }
        for (i = si, k = 0; k < temp.length; i++, k++) {
            arr[i] = temp[k];
        }
        return count;
    }

    public static void quicksorts(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pivot = pivotIdx(arr, si, ei);
        quicksorts(arr, si, pivot - 1);
        quicksorts(arr, pivot + 1, ei);

    }

    public static int pivotIdx(int[] arr, int si, int ei) {
        // int[] arr1 = { 4, 5, 6, 7, 0, 1, 8 };

        int track = si - 1;
        for (int i = si; i < ei; i++) {
            if (arr[i] < arr[ei]) {
                track++;

                if (track != i) {
                    int temp = arr[track];
                    arr[track] = arr[i];
                    arr[i] = temp;
                }

            }

        }
        track++;
        if (track != ei) {
            int temp = arr[track];
            arr[track] = arr[ei];
            arr[ei] = temp;
        }
        return track;
    }

    public static int getMajurityElemnt(int[] arr) {
        int candidate = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                count = 1;
                candidate = arr[i];
            } else if (candidate == arr[i]) {
                count++;
            } else {
                count--;
            }

            // if (count == 0) {
            // count++;
            // candidate = arr[i];

            // } else if (candidate == arr[i]) {
            // count++;
            // } else {
            // count--;
            // }

        }
        return candidate;
    }

    public static void main(String[] args) {
        System.out.println("hello deep");
        int[] arr = { 6, 3, 4, 5, 2, 8, -5 };
        // mergeSort(arr, 0, arr.length - 1);
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);

        int[] arr1 = { 4, 5, 6, 7, 0, 1, 2 };
        int[] arr2 = { 6, 7, 1, 2, 3, 4, 5 };
        // System.out.println(findElementInSortedReverseArray(arr2, 0, arr2.length - 1,
        // 1));

        quicksorts(arr1, 0, arr1.length - 1);

        // String[] arr3 = { "sun", "sun", "earth", "earth", "mars", "mercury" };
        // mergeSorts(arr3, 0, arr3.length - 1);
        int[] ar = { 4, 2, 5, 1, 0 };
        System.out.println("total sorting step count is  = " + mergeSorts(ar, 0, ar.length - 1));
        printArr(ar);
        int[] arr4 = { 1, 1, 2, 2, 2, 2 };
        System.out.println("mejurity elemnt is " + getMajurityElemnt(arr4));

    }

}
