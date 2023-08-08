package mediumarrays;

public class SumExists {
    public String sumOfTwo(int[] books, int target) {
        if (books == null || books.length <= 1){
            return "No";
        }

        int n = books.length;
        for (int i = 0; i < n; i++){
            for (int j = i; j<n; j++){
                if (books[i] + books[j] == target){
                    return "Yes";
                }
            }
        }
        return "No";
    }
}
