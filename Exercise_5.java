import java.util.Scanner;
import java.lang.*;
import java.math.BigInteger;
import java.time.Instant;
import java.time.Duration;
public class Exercise_5 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: \n");
        n = in.nextInt();
        Instant start = Instant.now();
        BigInteger fact = factorial(n);
        Instant finish = Instant.now();
        System.out.println(n+"! = "+fact);
        double elapsed = Duration.between(start, finish).toMillis()/60000.0;
        System.out.println("Время выполнения (в мс): "+elapsed);
        System.out.println("Количество цифр в факториале: "+fact.toString().length());
    }
    public static BigInteger factorial(int n)
    {
        BigInteger num = new BigInteger("1");
        for (int i = 1; i <= n; i++)
        {
            BigInteger big_i = new BigInteger(Integer.toString(i));
            num = num.multiply(big_i);
        }
        return num;
    }
}
