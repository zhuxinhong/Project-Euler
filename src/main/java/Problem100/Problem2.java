package Problem100;

/**
 * Created by zhuxh on 15-5-29.
 */
public class Problem2 {

    //answer: 4613732
    public static void main(String[] args) {

        int sum = 0;

        int sum_even = 0;

        int a = 1;
        int b = 2;

        Boolean flag = true;
        while(flag){
            sum = a + b;
            a = b;
            b = sum;
            if(b >= 4000000)
                flag = false;

            if(a % 2 == 0)
                sum_even += a;

        }

        System.out.println(sum_even);

    }
}
