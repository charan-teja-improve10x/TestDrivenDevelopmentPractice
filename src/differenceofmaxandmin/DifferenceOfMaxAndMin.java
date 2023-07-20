package differenceofmaxandmin;

public class DifferenceOfMaxAndMin {
    public int difference(int[] numbers) {
        int result = 0;
        if (numbers.length == 1){
            return numbers[0];
        } else if (numbers.length > 1) {
            int min = numbers[0];
            int max = numbers[0];
            for (int i = 0; i < numbers.length; i++){
                if (numbers[i] > max){
                    max = numbers[i];
                } else if (numbers[i]< min) {
                    min = numbers[i];
                }
            }
            result = max - min;
        }
        return result;
    }
}
