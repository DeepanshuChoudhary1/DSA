public class Z_17_bitwise {

    public static void bitWiseOperators() {
        System.out.println(" & operator 5 & 3 =>  " + (5 & 3));
        System.out.println(" | operator 5 | 3 => " + (5 | 3));
        System.out.println(" ~ operator  ~5 => " + (~5)); //
        System.out.println(" << Left Shift Operator (5 << 2) => " + (5 << 2));
        System.out.println(" >> Right Shift Operator (5 >> 2) => " + (5 >> 2));
    }

    public static void findTheIthElementIsZeroOrOne(int number, int i) {
        if ((number & (1 << i)) == 0) {
            System.out.println("The digit ith is digt is 0");
        } else {
            System.out.println("The digit ith is digt is 1");

        }

    }

    public static void updateIthElementWithOne(int number, int i) {
        int res = (number | (1 << i));
        System.out.println("output  is " + res);

    }

    public static int clearIthElement(int number, int i) {

        int x = 1 << i;
        x = ~x;
        int res = (number & x);
        System.out.println("output  is " + res);
        return res;
    }

    public static void updateIthElementZeroOrOne(int number, int i) {

        int res = (number | (1 << i));

        System.out.println("output  is " + res);

    }

    public static void clearLastRangeOfBit(int num, int range) {
        int x = -1 << range; // or ((~0) << range);
        int ans = num & x;

        System.out.println("the answer of clearLastRangeOfbit is  " + ans);

    }

    public static void clearBetweenRangeOfBit(int num, int i, int j) {
        int a = 1 << j + 1;
        int b = (1 << i) - 1;
        int ans = num & (a | b);
        System.out.println("the answer of clearLastRangeOfbit is=  " + ans);

    }

    public static void countSetBit(int num) {
        int number = num;
        int count = 0;
        while (num > 0) {
            num = num & (num - 1);
            count++;
        }
        System.out.println("The total 1 bit count is given number " + number + " = " + count);
    }

    public static void fastExponent(int num, int pow) {
        int power = num;
        int ans = 1;
        String binary = Integer.toBinaryString(pow);
        int i = binary.length() - 1;
        System.out.println("the binary of " + num + " is equal to = " + binary);
        while (i >= 0) {

            if (binary.charAt(i) == '1') {
                ans = ans * power;
            }
            power = power * power;
            i--;

        }

        System.out.println("the answer of " + num + "^" + pow + " = " + ans);
    }

    public static void updateCharInLoverCaseUsingBitwise() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' ') + " "); // char()(Asid char_no)=>
        }

    }

    public static void updateCharInUpparCaseUsingBitwise() {

        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print((char) (ch & '_') + " "); // char()(Asid char_no)=>
        }

    }

    public static void togalCharInUpparCaseUsingBitwise() {

        for (char ch = 'A'; ch <= 'Z'; ch++) { // both work uper case and lover case
            System.out.print((char) (ch ^ ' ') + " "); // char()(Asid char_no)=>
        }

    }

    public static void main(String[] args) {
        bitWiseOperators();
        findTheIthElementIsZeroOrOne(10, 1);
        updateIthElementWithOne(10, 2);
        clearIthElement(10, 3);
        System.out.println();
        // int[] arr = { 5, 4, 6, 2, 3 };
        clearLastRangeOfBit(15, 2);
        clearBetweenRangeOfBit(214, 2, 6);
        countSetBit(7);
        fastExponent(2, 8);
        updateCharInLoverCaseUsingBitwise();
        System.out.println();
        updateCharInUpparCaseUsingBitwise();
        System.out.println();
        togalCharInUpparCaseUsingBitwise();

        // clearLastRangeOfBit(15, 2);

    }

}