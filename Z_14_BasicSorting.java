public class Z_14_BasicSorting {

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] arr) { // big elemet goes to the end
        int temp = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            printArr(arr);
        }
        System.out.println("------------------");
        printArr(arr);
    }

    public static void selectionSort(int[] arr) { // small element goes to the first mean firsty check the min element
                                                  // and then swap it first

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;

                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            printArr(arr);
        }
        System.out.println("------------------");
        printArr(arr);
    }

    public static void insertionSort(int[] arr) { // assume first elment is sorted ex like as tash ke patte

        // int minValue = Integer.MAX_VALUE;
        // int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > curr) {
                arr[j + 1] = arr[j];
                j--;

            }
            arr[j + 1] = curr;

            printArr(arr);

        }
        System.out.println("------------------");
        printArr(arr);
    }

    public static void coutingSort(int[] arr) {
        // 2,3,1,4,1,5,2,6,6/
        int largestElement = 0;
        for (int i = 0; i < arr.length; i++) {

            largestElement = Math.max(largestElement, arr[i]);
        }
        int[] freArr = new int[largestElement + 1];

        for (int i = 0; i < arr.length; i++) {

            int arrValue = arr[i];
            freArr[arrValue] = freArr[arrValue] + 1;

        }
        int index = 0;
        printArr(freArr);
        for (int j = 1; j < freArr.length; j++) {
            int temp = freArr[j];
            while (temp > 0) {
                arr[index] = j;
                index++;
                temp--;
            }
            continue;
            // printArr(arr);
        }
        printArr(arr);
    }

    public static void main(String[] args) {
        // int[] arr = { 5, 1, 3, 2, 6, 4 };
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        ;
        // ----------------------------
        int[] arr = { 5, 1, 3, 2, 6, 4, 2, 6, 1, 12 };
        coutingSort(arr);

    }
}
