package fizzbuzzz;

import scoringsystem.Score;

public class FizzBuzz {

    public static void main(String[] args) {
        String print = findFizzBuzz(6);
        System.out.println(print);
    }

    public static String findFizzBuzz(int n) {
        String result = "";
        if (n < 0) {
            result = "-1";
        } else if (n == 0) {
            result = n + "";
        } else if (n == 1) {
            result = 1 + "";
        } else if (n == 2) {
            result = 2 + "";
        } else if (n % 3 == 0 && n % 5 == 0) {
            result = "FizzBuzz";
        } else if (n % 3 == 0) {
            result = "Fizz";
        } else if (n % 5 == 0) {
            result = "Buzz";
        } else {
            result = n + "";
        }
        return result;
    }
}
