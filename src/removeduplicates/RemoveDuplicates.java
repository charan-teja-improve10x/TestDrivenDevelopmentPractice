package removeduplicates;

public class RemoveDuplicates {
    public int removeDuplicatesAndReturnTheLength(int[] numbers, int n) {
        if (numbers == null || numbers.length == 0){
            return 0;
        }else {
             n = numbers.length;
            int i = 0;
            for (int j = 1; j < numbers.length; j++){
                if (numbers[i] != numbers[j]){
                    i++;
                    numbers[i] = numbers[j];
                }
            }
            n = i + 1;
        }
        return n;
    }
}
