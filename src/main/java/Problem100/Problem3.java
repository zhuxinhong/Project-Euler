package Problem100;

/**
 * Created by zhuxh on 15-5-29.
 */
public class Problem3 {

    //answer 6857
    public static void main(String[] args) {
        Long c = 600851475143l;
        System.out.println(getPrime(c));
    }

    public static long getPrime(long value) {

        for (long i = 2; i < value; i++) {
            long remainder = value % i;
            if (remainder == 0) {
                long vv = value / i;
                if (isPrime(vv)){
                    return vv;
                }else{
                    return getPrime(vv);
                }

            }
        }
        return 1;
    }

    public static Boolean isPrime(long value) {
        Boolean flag = true;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }


}
