package mediumarrays;

public class SumExists {
    public String sumOfTwo(int[] books, int target) {
        if (books == null || books.length <= 1){
            return "No";
        }

        int n = books.length;
        String Yes = getSumOfTwo(books, target, n);
        if (Yes != null) return Yes;
        return "No";
    }

    private static String getSumOfTwo(int[] books, int target, int n) {
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j< n; j++){
                if (books[i] + books[j] == target){
                    return "Yes";
                }
            }
        }
        return null;
    }
}
