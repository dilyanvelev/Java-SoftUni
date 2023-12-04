import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    static Map<Integer, Long> fibNumbers = new HashMap<>();

    public static void main(String[] args) {

        System.out.println("***Good Fibonacci***");
        goodFibExecutionTime(29);
        goodFibExecutionTime(33);
        goodFibExecutionTime(43);
        goodFibExecutionTime(100);

        //In that way, called memoization, we don't calculate every fibonacci number
        //every time. We store the already calculated numbers and if we need some of them
        //we just take the value from the map.
        //Linear time complexity -> O(n).


        System.out.println("***Bad Fibonacci***");
        badFibExecutionTime(29);
        badFibExecutionTime(33);
        badFibExecutionTime(43);
        badFibExecutionTime(46);

        //Some factors like: system load, hardware power etc. affect slightly the timer in the
        //range 29-33(sometimes can be different for the same "n"). The delay becomes much bigger
        //for numbers exceeding 33(visible on the timer) but still imperceptible to human eye.
        //When n = 43 the delay is close to 1 second and starts to be noticeable. Increasing "n"
        //the method becomes progressively slower.
        //n = 50; -> ~ 22.988 sec.
        //Exponential time complexity -> O(2^n)

    }

    static void goodFibExecutionTime(int n) {
        long start = System.currentTimeMillis();
        System.out.println(goodFib(n));
        long end = System.currentTimeMillis();
        double executionTime = (end - start) / 1000.0;
        System.out.print("Execution time for n=" + n + ": " + executionTime + " sec.\n");
    }

    static void badFibExecutionTime(int n) {
        long start = System.currentTimeMillis();
        System.out.println(badFib(n));
        long end = System.currentTimeMillis();
        double executionTime = (end - start) / 1000.0;
        System.out.print("Execution time for n=" + n + ": " + executionTime + " sec.\n");
    }

    static long badFib(int n) {
        if (n <= 2) {
            return 1;
        }

        return badFib(n - 1) + badFib(n - 2);
    }

    static long goodFib(int n) {


        if (n <= 2) {
            return 1;
        }
        if (fibNumbers.containsKey(n)) {
            return fibNumbers.get(n);
        }
        long result = goodFib(n - 1) + goodFib(n - 2);
        fibNumbers.put(n, result);

        return result;

    }
}
