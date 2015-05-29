package Problem100;

/**
 * Created by zhuxh on 15-5-29.
 */
public class Problem3 {


    public static void main(String[] args) {
        long c = 600851475143l;
        System.out.println(getPrime(c));
    }

    public static long getPrime(long l) {
        long prime = 1l;

        for (long i = 1; i < l; i++) {

            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0 || i % 11 == 0
                    || i % 13 == 0 || i % 17 == 0 || i % 19 == 0)
                continue;

            if (l % i == 0 && i > prime)
                prime = i;

        }
        return prime;
    }
}
