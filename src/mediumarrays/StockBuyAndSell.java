package mediumarrays;

public class StockBuyAndSell {
    public int maximumProfit(int[] prizes) {
        if (prizes == null || prizes.length == 0){
            return -1;
        } else if (prizes.length == 1 || prizes.length == 2) {
            return 0;
        } else {
            int maxProf = 0;
            for (int i = 0; i < prizes.length; i++){
                for (int j = i + 1; j < prizes.length; j++){
                    if (prizes[j] > prizes[i]){
                        maxProf = Math.max(prizes[j] - prizes[i], maxProf);
                    }
                }
            }
            return maxProf;
        }
    }
}
