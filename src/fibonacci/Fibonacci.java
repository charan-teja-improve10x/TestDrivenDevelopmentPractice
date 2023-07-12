package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(find(15));
    }
    public static int find(int number) {
        if (number <= 0) {
            return -1;
        }if (number == 1) {
            return 0;
        }if (number == 2){
            return 1;
        } if (number == 3) {
            return 2;
        }else {
            return find(number - 1) + find(number - 2);
        }
    }
}
