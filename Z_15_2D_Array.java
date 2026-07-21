import java.util.Scanner;

import java.util.Arrays;

public class Z_15_2D_Array {

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void cirulerArrPrint() {
        int[][] arr = {
                { 1, 2 },
                { 3, 4 },
                { 5, 6, },
                { 7, 8 },
                // { 9, 10, 11, 12 },
                // { 13, 14, 15, 16 },
                // { 13, 14, 15, 16 },
                // { 17, 18, 19, 20 },
        };
        int startColumn = 0;
        int endColumn = arr[0].length - 1;
        int startRow = 0;
        int endRow = arr.length - 1;

        while (startRow <= endRow && startColumn <= endColumn) {

            for (int j = startColumn; j <= endColumn; j++) {

                System.out.print(arr[startColumn][j] + " ");

            }
            for (int i = startRow + 1; i < endRow; i++) {

                System.out.print(arr[i][endColumn] + " ");

            }
            for (int j = endColumn; j >= startColumn; j--) {
                if (endColumn == startRow || startRow >= endRow) {
                    break;
                }
                System.out.print(arr[endRow][j] + " ");

            }
            for (int i = endRow - 1; i > startRow; i--) {
                if (startRow == endRow) {
                    break;
                }

                System.out.print(arr[i][startColumn] + " ");

            }
            startRow++;
            endRow--;
            startColumn++;
            endColumn--;
            System.out.println();

        }
    }

    public static void searchElementIn2dArray(int[][] arr, int key) { // esme m= n rehega
        // note)- array is row vise sorted /also column vise sorted,
        int sum = 0;
        int j = arr.length - 1;
        int i = 0;

        while (j >= 0 && i <= arr.length - 1) {
            if (key < arr[i][j]) {
                j--;
            } else if (key > arr[i][j]) {
                i++;
            } else if (key == arr[i][j]) {
                System.out.println("Your key " + key + "  [" + i + "]" + "[" + j + "]");
                break;
            }
            if (i < arr.length - 1 || j < 0) {
                System.out.println("your " + key + " was not present running in loop");
                break;
            }

        }
        // System.out.println("your " + key + " was not present");

    }

    public static void diagonalSum(int[][] arr) {
        int sum = 0;
        int arrSize = arr.length - 1;
        for (int i = 0; i <= arrSize; i++) {

            sum += arr[i][i];
            int j = arrSize - i;
            if (i != j && i + j == arrSize) {
                sum += arr[i][j];
            }

        }
        System.out.println("your first diagonal sum = " + sum);
    }

    public static void transposedMatrix(int[][] arr) {
        int[][] newArr = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                newArr[j][i] = arr[i][j];

            }

        }
        printArr(newArr);

    }

    public static void sort2DArr(int[][] arr) {
        int col = 0;

        int[] rowTemp = new int[arr[0].length];
        int[] colTemp = new int[arr.length];
        while (col < arr[0].length) {
            for (int i = 0; i < arr.length; i++) {
                colTemp[i] = arr[i][col];
            }
            Arrays.sort(colTemp);
            for (int i = 0; i < arr.length; i++) {
                arr[i][col] = colTemp[i];
            }
            col++;
        }

        int row = 0;
        while (row < arr.length) {
            for (int j = 0; j < arr[0].length; j++) {
                rowTemp[j] = arr[row][j];
            }
            Arrays.sort(rowTemp);
            for (int i = 0; i < rowTemp.length; i++) {
                arr[row][i] = rowTemp[i];
            }

            // arr[row] = rowTemp;
            row++;
        }

        printArr(arr);

    }

    public static void main(String[] args) {
        // cirulerArrPrint();

        // int[][] arr = {
        // { 10, 20, 30 },
        // { 15, 25, 35 },
        // { 27, 29, 37 },
        // { 32, 33, 39 },

        // };
        // searchElementIn2dArray(arr, 27);
        // diagonalSum(arr);

        // int[][] tarr = {
        // { 10, 20, 30 },
        // { 15, 25, 35 },
        // { 27, 29, 37 },
        // };
        // transposedMatrix(tarr);

        int[][] arr = {
                { 15, 45, 35 },
                { 10, 50, 30 },
                { 27, 49, 37 },
        };
        sort2DArr(arr);
    }

}
