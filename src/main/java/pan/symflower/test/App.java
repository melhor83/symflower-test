package pan.symflower.test;

/**
 * Hello world!
 *
 */
public class App {

    private static final int UPPER_LIMIT = 10;

    public static int fib(int n) {
        if (n <= 1)
            return n;
        if (n > UPPER_LIMIT) {
            return -1; // too big
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static int[] makeFib(int n) {
        if (n < 0 || n > UPPER_LIMIT) {
            return new int[0];
        }
        int[] test = new int[n];
        for (int i = 0; i < n; i++) {
            test[i] = fib(i);
        }
        return test;
    }

    public static boolean checkFib(int n, int[] valuesToTest) {
        return arrayEquals(makeFib(n), valuesToTest);
    }

    // had to write my own as import handling ist disabled
    private static boolean arrayEquals(int[] first, int[] second) {
        if (first == null) {
            return second == null;
        }
        if (second == null) {
            return false;
        }
        if (first.length != second.length) {
            return false;
        }
        for(int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }
        return true;
    }

}
