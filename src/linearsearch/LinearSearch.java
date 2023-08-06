package linearsearch;

public class LinearSearch {
    public int findTheIndex(int[] numbers, int n, int num) {

        if (numbers != null && numbers.length != 0) {
            n = numbers.length;
            for (int i = 0; i < n; i++) {
                if (numbers[i] == num) {
                    return i;
                }
            }
        }
        return -1;
    }

}
