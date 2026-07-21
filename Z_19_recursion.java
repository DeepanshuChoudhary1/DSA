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
        System.out.print(num + " ");

    }

    public static void main(String[] args) {
        printIncNo(10);
        // printDecNo(10);
    }
}
