import java.sql.Array;
import java.util.Scanner;

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

    public static void countDigitChar() {
        int count = 0;
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap xau:");
        String str = kb.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
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
        System.out.println("So ki tu thuong trong xau la: " +count);
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
        str = str.substring(1,8);
        System.out.println("Xau sao khi cat la: " + str);
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

    }



}
