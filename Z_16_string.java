import java.util.Arrays;

public class Z_16_string {
    public static void printStr(String str) {
        System.out.println(str);
    }

    public static void isPalindromString(String str) {
        int n = str.length();
        int j = n - 1;
        for (int i = 0; i < n / 2; i++) {
            j = n - 1 - i;
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println(
                        str + " String is not Palindrom and i=" + i + " " + str.charAt(i) + "!=" + str.charAt(j));
                break;
            } else if (i == n / 2 - 1) {
                System.out.println(str + " String is palindrom");
            }
        }

    }

    public static void getSortestPath(String str) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if (c == 'w') {
                x--;

            } else if (c == 'e') {
                x++;

            } else if (c == 'n') {
                y++;

            } else if (c == 's') {
                y--;
            } else {
                return;
            }
        }

        // root (y2-y1)^2 +(x2-x1)^2 minimum root
        double data = (y - 0) * (y - 0) + (x - 0) * (x - 0);
        data = Math.sqrt((data));
        System.out.println("(x,y)=> " + x + "_" + y + " shorter answer is = " + data);
    }

    public static void printFirstLetterUpparCase(StringBuilder str) {

        boolean isSpace = false;
        str.setCharAt(0, Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ' && isSpace == false) {

                isSpace = true;
            } else if (c == ' ' && isSpace) {
                str.deleteCharAt(i);
                i--;
            }

            else if (c != ' ' && isSpace) {

                str.setCharAt(i, Character.toUpperCase(c));
                isSpace = false;
            }
        }
        // for (int i = 1; i < str.length(); i++) {
        // char c = str.charAt(i);
        // if (c == ' ') {
        // isSpace = true;
        // } else if (c != ' ' && isSpace) {
        // str.setCharAt(i, Character.toUpperCase(c));
        // isSpace = false;
        // }
        // }
        System.out.println(str);
    }

    public static void stringComperssion(String str) {
        StringBuilder strB = new StringBuilder();
        Integer count = 1;
        char c = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            char currC = str.charAt(i);

            if (c != currC) {
                if (count > 1) {
                    strB.append(c + count.toString());

                } else {
                    strB.append(c);

                }

                count = 1;
                c = currC;
            } else {
                count++;

            }

        }
        strB.append(c);
        System.out.println("the compress String is " + strB);
    }

    public static void stringComperssions(String str) {
        System.out.println("new String compression fun------------->");
        StringBuilder strB = new StringBuilder();

        char c = str.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            char currC = str.charAt(i);

            while (i < str.length() - 1 && currC == str.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count > 1) {
                strB.append(currC + count.toString());
            } else {
                strB.append(currC);
            }

        }
        // strB.append(c);
        System.out.println("the compress String is " + strB);
    }

    public static void checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            System.out.println("String is not Anagram");
            return;
        }
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        if (Arrays.equals(c1, c2)) {
            System.out.println("String is Anagram");
        } else {
            System.out.println("String is not Anagram");
        }

    }

    public static void checkAnagrams(String str1, String str2) {

        if (str1.length() != str2.length()) {
            System.out.println("String is not Anagram");
            return;
        }
        int[] freq = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            // str1Char=
            freq[str1.charAt(i) - 'a']++;
            freq[str2.charAt(i) - 'a']--;
        }

        for (int item : freq) {
            if (item != 0) {
                System.out.println("String is not Anagrams");

                return;

            }

        }

    }

    public static void main(String[] args) {
        // isPalindromString("abcracecarcba");
        getSortestPath("weenesennn");

        // printFirstLetterUpparCase(new StringBuilder("hello my Name is deepanshu
        // panwar"));
        // // stringComperssion("aaabccdddeffghhhi");
        // stringComperssions("aaabccdddeffghhhi");
        checkAnagrams("race", "care");
        System.out.println(10 & ~2);
    }
}
