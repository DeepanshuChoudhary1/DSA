class DesToBin {

    static void binaryToDecimal(int n) {
        String binString = Integer.toString(n);
        int i = 0;
        int result = 0;
        for (i = 0; i < binString.length(); i++) {

            char digit = binString.charAt(i);
            int power = binString.length() - 1 - i;
            if (digit == '1') {
                result += Math.pow(2, power);
            }

        }
        System.out.println("(" + n + ")" + " = " + result + " Decimal");

    }

    static void binaryToDecimalOptimized(int n) {
        int binNumber = n;
        int result = 0;
        int power = 1;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit == 1) {

                result = result + (lastDigit * power);
            }
            power *= 2;
            n = n / 10;

        }

        System.out.println("(" + binNumber + ")" + " = " + result + " Decimal");

    }

    static void decimalToBinary(int n) {
        int decimalNumber = n;
        int result = 0;
        while (n > 0) {
            int rem = n % 2;
            result = result * 10 + rem;
            n /= 2;
        }
        System.out.println("Decimal " + decimalNumber + " = Binary " + result);

    }

    public static void main(String[] args) {
        binaryToDecimal(1011);
        binaryToDecimalOptimized(1011);
        decimalToBinary(11);
    }

}