package leftrotatearraybyone;

public class LeftRotateByOne {
    public int[] leftRotateArrayByOne(int[] numbers, int n) {
        if (numbers == null || numbers.length == 0){
            return new int[]{};
        }else{
            int temp = numbers[0];
            n = numbers.length;
            for (int i = 1; i < n; i++){
                numbers[i - 1] = numbers[i];
            }
            numbers[n - 1] = temp;
        }
        return numbers;
    }
}
