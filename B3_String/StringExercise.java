import java.sql.Array;
import java.util.*;

public class StringExercise {
    public static void addTwoString() {
        String s1 = "An";
        String s2 = "Nguyen";
        String s3 = s1.concat(s2);
        System.out.println(s3);
    }

    public static void changeToUpperCase() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap xau: ");
        String str = kb.nextLine();
        str = str.toUpperCase();
        System.out.println("Xau in hoa: " + str);
    }

    public static void countUpperChar() {
        int count = 0;
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap xau:");
        String str = kb.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }
        System.out.println("So ki tu in hoa trong xau la: " + count);
    }

    public static void countDigit() {
        int count = 0;
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap xau:");
        String str = kb.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        System.out.println("So ki tu so trong xau la: " + count);
    }

    public static void printInOddIndex() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap xau: ");
        String str = kb.nextLine();
        System.out.println("Ki tu o vi tri le trong xau: ");
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                System.out.println(str.charAt(i) + " ");
            }
        }
    }

    public static void printSpecialChar() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap xau: ");
        String str = kb.nextLine();
        System.out.println("Ki tu dac biet trong xau: ");
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                System.out.print(str.charAt(i) + " ");
            }
        }
    }

    public static void deleteSpace() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap xau: ");
        String str = kb.nextLine();
        str = str.trim();
        System.out.println("Xau khong con khoang trang o dau va cuoi: " + str);
    }

    public static void countLowerChar() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap xau: ");
        String str = kb.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                count++;
            }
        }
        System.out.println("So ki tu thuong trong xau la: " + count);
    }

    public static void cutString() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap xau: ");
        String str = kb.nextLine();
        str = str.substring(1);
        System.out.println("Xau sao khi cat la: " + str);
    }

    public static void getDigit() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap xau:");
        String str = kb.nextLine();
        int index = 0;
        ArrayList ListA = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                ListA.add(Character.getNumericValue(str.charAt(i)));
                index++;
            }
        }
        System.out.println("Mang so nguyen trong xau: " + ListA);

    }

    public static void cutString2() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap xau: ");
        String str = kb.nextLine();
        str = str.substring(1, 8);
        System.out.println("Xau sao khi cat la: " + str);
    }

    public static void countFrequencyNumber() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap xau: ");
        String str = kb.nextLine();
        int[] freq = new int[str.length()];
        char string[] = str.toCharArray();

        for(int indexOfString = 0; indexOfString < str.length(); indexOfString++) {
            freq[indexOfString] = 1;
            for (int nextIndexOfString = indexOfString + 1; nextIndexOfString < str.length();
                 nextIndexOfString++) {
                if (string[indexOfString] == string[nextIndexOfString]) {
                    freq[indexOfString]++;
                    string[nextIndexOfString] = '0';
                }
            }
        }

        System.out.println("So lan xuat hien cua cac ki tu:: ");
        for (int index = 0; index < freq.length; index++) {
            if (string[index] != ' ' && string[index] !='0') {
                System.out.println(string[index] + "-" + freq[index]);
            }
        }
    }

    public static void countDigitAndLetter() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap xau: ");
        String str = kb.nextLine();
        int letter = 0;
        int digit = 0;
        for (int indexOfString = 0; indexOfString < str.length(); indexOfString++) {
            if (Character.isDigit(str.charAt(indexOfString))) {
                digit += 1;
            } else if (Character.isLetter(str.charAt(indexOfString))) {
                letter += 1;
            }
        }

        System.out.println("So ki tu chu va so trong xau la: ");
        System.out.println("chu: " + letter);
        System.out.println("so: " + digit);

    }

    public static void getChar() {
        String str = "ádsaei73h";
        System.out.println("Ki tu thu 2, 3, 4: " + str.charAt(2) + str.charAt(4) + str.charAt(3));
    }


    public static void replaceFisrtTo$() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap xau: ");
        String str = kb.nextLine();
        char firstChar = str.charAt(0);
        String newString = str.replace(firstChar, '$');
        String subString = firstChar + newString.substring(1);
        System.out.println("xau moi: " + subString);
    }
    public static void swapFirst2Char() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap xau 1: ");
        String str1 = kb.nextLine();;
        System.out.println("Nhap xau 2: ");
        String str2 = kb.nextLine();
        String first1 = str1.substring(0, 2);
        String first2 = str2.substring(0, 2);
        String newString = first2 + str1.substring(2) + " " + first1 + str2.substring(2);
        System.out.println(newString);

    }

    public static void changeString() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap xau: ");
        String str = kb.nextLine();
        String result;
        if (str.length() >= 3 && !str.endsWith("ly") && !str.endsWith("ing")) {
            result = str.substring(0, str.length()) + "ing";
        } else if (str.length() >= 3 && str.endsWith("ing")) {
            result = str.substring(0, str.length()) + "ly";
        } else {
            result = str.substring(0);
        }
        System.out.println(result);
    }

    public static void findLongestWord() {
        List<String> listOfWord = new ArrayList<>(Arrays.asList("ádasd", "hdasdasd", "âsda"));
        int maxLength = 0;
        String longestWord = "";
        for (int index = 0; index < listOfWord.size(); index++) {
            if (listOfWord.get(index).length() > maxLength) {
                maxLength = listOfWord.get(index).length();
                longestWord = listOfWord.get(index).substring(0);
            }
        }
        System.out.println("The longest word is " + longestWord + " has length " + maxLength);
    }

    public static void exchangeFistAndLast() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap xau: ");
        String str = kb.nextLine();
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        String newString = lastChar + str.substring(1, str.length() - 1) + firstChar;
        System.out.println(newString);
    }

    public static void removeOddIndexE() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap xau: ");
        String str = kb.nextLine();
        String newString = "";
        System.out.println("Given string " + str);
        for (int index = 0; index < str.length(); index++) {
            if (index % 2 == 0) {
                newString += str.charAt(index);
            }
        }
        System.out.println("Remove Odd Index element " + newString);
    }

    public static void takeInput() {
        System.out.println("Enter the String.");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println("Change to LowerCase: " + inputString.toLowerCase());
        System.out.println("Change to UpperCase: " + inputString.toUpperCase());
    }

    public static void uniqueWord() {
        List<String> listOfUniqueWord = new ArrayList<>();
        String givenString = " nguyen,An,hive,hive,tech, tech";
        String[] splitString = givenString.split(",");

        for (int index = 0; index < splitString.length; index++) {
            for (int index1 = index + 1; index1 < splitString.length; index1++) {
                if (splitString[index].compareTo(splitString[index1]) > 0) {
                    String temp = splitString[index];
                    splitString[index] = splitString[index1];
                    splitString[index1] = temp;
                }
            }
            if (!listOfUniqueWord.contains(splitString[index])) {
                listOfUniqueWord.add(splitString[index]);
            }
        }

        for (int index = 0; index < listOfUniqueWord.size(); index++) {
            System.out.print((listOfUniqueWord.get(index) + " "));
        }
    }

    public static void addTag(String tagname, String contents) {
        System.out.println("<" + tagname + ">" + contents + "</" + tagname + ">");
    }

    public static void changeToUpperCase2() {
        String givenString = "HichAocau";
        String subString = givenString.substring(0, 4);
        int numOfCharIsUpperCase = 0;
        if (givenString.length() >= 4) {
            for (int index = 0; index < givenString.length(); index++) {
                if (Character.isUpperCase(givenString.charAt(index))) {
                    numOfCharIsUpperCase++;
                }
            }

            if (numOfCharIsUpperCase >= 2) {
                System.out.println(givenString.toUpperCase());
            } else {
                System.out.println(givenString);
            }
        } else {
            System.out.println(givenString);
        }

    }

    public static void removeNewLine() {
        String givenString = "An \n" +
                "nguyen\n";
        String newString = "";
        for (int index = 0; index < givenString.length(); index++) {
            if (givenString.charAt(index) == '\n') {
                newString = givenString.replace("\n", "");
            }
        }

        System.out.println(newString);
    }

    public static void checkString() {
        String givenString = "aichaocau";
        String specifiedChar = "a";
        if (givenString.startsWith(specifiedChar)) {
            System.out.println("Chuoi bat dau bang ki tu " + specifiedChar);
        } else {
            System.out.println("Chuoi khong bat dau bang ki tu " + specifiedChar);
        }
    }

    public static void removeIndentation() {
        String givenString = "\t hihihi";
        String newString = "";
        for (int index = 0; index < givenString.length(); index++) {
            if (givenString.charAt(index) == '\t') {
                newString = givenString.replace("\t", "");
            }
        }

        System.out.println(newString);
    }

    public static void addPrefix() {
        String givenString = "An \n" +
                "nguyen\n";
        String stringToAdd = "a";
        String[] splitString = givenString.split("\n");
        String newString = "";
        for (int index = 0; index < splitString.length; index++) {
            newString += stringToAdd + splitString[index];
        }

        System.out.println(newString);
    }

    public static void formatWithPercentage() {
        double number = 0.123123;
        NumberFormat numberFormat = NumberFormat.getPercentInstance();
        String numberToPercent = numberFormat.format(number);
        System.out.println(numberToPercent);
    }

    public static void alignNumber() {
        int number = 05250;
        String rightFormat = String.format("%10s", number);
        String leftFormat = String.format("%-10s", number);
        String centerFormat = String.format("%5s", number);
        System.out.println("Origin: " + number);
        System.out.println("Left format: " + leftFormat);
        System.out.println("Right format: " + rightFormat);
        System.out.println("Center format: " + centerFormat);
    }

    public static void reverseWords() {
        String givenString = "hi chao cau";
        String[] strings = givenString.split(" ");
        String revString = "";
        for (int index = givenString.length(); index <= 0; index--) {
            revString += strings[index] + " ";
        }

        System.out.println(revString);
    }

    public static void printIndex() {
        String givenString = "hi chao cau";
        for (int index = 0; index < givenString.length(); index++) {
            System.out.println("Current character " + givenString.charAt(index) + " position at " + index);
        }
    }

    public static void giveStringintoList() {
        String givenString = "hi chaoo cao";
        String[] list = givenString.split(" ");
        System.out.println(Arrays.toString(list));
    }

    public static void removeSpace() {
        String givenString = "    hihihi   ";
        String newString = givenString.trim();
        System.out.println(newString);
    }

    public static void moveSpace() {
        String givenString = "hi chao cau";
        char[] str = givenString.toCharArray();
        int i = str.length - 1;
        for (int index = i; index >= 0; index--) {
            if (str[index] != ' ') {
                char c = str[i];
                str[i] = str[index];
                str[index] = c;
                i--;
            }
        }
        System.out.println(String.valueOf(str));
    }

    public static void validateEmpty() {
        String givenString = "hihihi";
        if (givenString.isEmpty()) {
            System.out.println("This string is empty");
        } else {
            System.out.println("This string is not empty");
        }
    }


    public static void main(String[] args) {
        addTwoString();
        changeToUpperCase();
        countUpperChar();
        countDigit();
        printInOddIndex();
        printSpecialChar();
        deleteSpace();
        countLowerChar();
        cutString();
        cutString2();
        getDigit();
        countFrequencyNumber();
        countDigitAndLetter();
        getChar();
        replaceFisrtTo$();
        swapFirst2Char();
        changeString();
        findLongestWord();
        exchangeFistAndLast();
        removeOddIndexE();
        takeInput();
        uniqueWord();
        addTag("i", "java");
        changeToUpperCase2();
        removeNewLine();
        checkString();
        removeIndentation();
        addPrefix();
        formatWithPercentage();
        alignNumber();
        reverseWords();
        printIndex();
        giveStringintoList();
        removeSpace();
        moveSpace();
        validateEmpty();
    
    }


}
