import java.util.Scanner;

public class Patterns {

    public static void hollowRactangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || i == n || j == 0 || j == n) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void spaceTrangile(int n) {
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print("   ");
            }
            for (int j = 0; j < i; j++) {

                System.out.print(" * ");

            }
            System.out.println();
        }
    }

    public static void numberReversePattern(int n) {
        for (int i = n; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                System.out.print(j);

            }
            System.out.println();
        }
    }

    public static void floadTrangle(int n) {
        int value = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print(value + " ");
                value++;

            }
            System.out.println();
        }
    }

    public static void zerOneTriangle(int n) {
        int value = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {

                if (i % 2 == 0 & j == 0) {
                    value = 1;
                } else {
                    if (value == 1) {
                        value = 0;
                    } else {
                        value = 1;
                    }
                }

                System.out.print(value + " ");

            }
            System.out.println();
        }
    }

    public static void ButterFlyPattern(int n) {

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            for (int s = 0; s < 2 * (n - i); s++) {
                System.out.print("   ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            for (int s = 0; s < 2 * (n - i); s++) {
                System.out.print("   ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void solidRombus(int n) {

        for (int i = 0; i < n; i++) {
            for (int s = 0; s < (n - i); s++) {
                System.out.print("   ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
    }

    public static void hollowRombus(int n) {

        for (int i = 0; i < n; i++) {
            for (int s = 0; s < (n - i); s++) {
                System.out.print("   ");
            }
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }

            System.out.println();
        }
    }

    public static void pyramidWithMirror(int n) {

        for (int i = 0; i <= n; i++) {
            for (int s = n - i; s > 0; s--) {
                System.out.print("   ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(" * ");

            }

            System.out.println();

            if (i == n) {
                int num = n - 1;
                for (int k = num; k > 0; k--) {
                    for (int s = 0; s < n - k; s++) {
                        System.out.print("   ");
                    }
                    for (int j = 0; j < 2 * k - 1; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println();

                }

            }
        }
    }

    public static void numberPiramid(int n) {

        for (int i = 0; i < n; i++) {
            for (int s = n - i; s > 0; s--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");

            }

            System.out.println();

        }
    }

    public static void palendromPiramind(int n) {

        for (int i = 0; i < n; i++) {
            for (int s = n - i; s > 0; s--) {
                System.out.print(" ");
            }
            boolean isRerverse = false;
            int plandromValue = i;
            for (int j = 0; j < 2 * i - 1; j++) {
                if (plandromValue > 1 && isRerverse == false) {
                    System.out.print(plandromValue);
                    plandromValue--;
                } else if (plandromValue == 1 && isRerverse == false) {
                    System.out.print(plandromValue);
                    isRerverse = true;
                } else {
                    // System.out.print("plandromValue berfor " + plandromValue);
                    plandromValue = plandromValue + 1;
                    // System.out.print("plandromValue after " + plandromValue);

                    System.out.print(plandromValue);
                }

            }

            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Patten Size:");
        int n = sc.nextInt();
        // hollowRactangle(n);
        // spaceTrangile(n);
        numberReversePattern(n);

        floadTrangle(n);
        zerOneTriangle(n);
        ButterFlyPattern(n);
        solidRombus(n);
        hollowRombus(n);
        pyramidWithMirror(n);
        numberPiramid(n);
        palendromPiramind(n);
    }
}
