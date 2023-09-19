package Javaclassbasics;

public class javaclassbasics {

    public static void main(String[] args) {

        int intvalue = 50;
        long longvalue = 996599654599699L;
        Boolean booleanvalue = true;
        short shortvalue = 500;

        int multipliedInt = multiplyByTwo(intvalue);
        long IncrementedLong = incrementByOne(longvalue);
        Boolean InvertedBoolean = invertboolean(booleanvalue);
        short squaredshort = square(shortvalue);

        System.out.println("Multiplied int: " + multipliedInt);
        System.out.println("Incremented long: " + IncrementedLong);
        System.out.println("Inverted Boolean: " + InvertedBoolean);
        System.out.println("Squared short: " + squaredshort);

    }

    public static int multiplyByTwo(int num) {
        return num * 5;

    }

    public static long incrementByOne(long num) {
        return num + 10;

    }

    public static boolean invertboolean(boolean value) {
        return !value;

    }

    public static short square(short num) {
        return (short) (num * num);

    }

}
