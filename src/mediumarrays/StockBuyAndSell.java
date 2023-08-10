package mediumarrays;

public class StockBuyAndSell {
    public int maximumProfit(int[] prizes) {
        if (prizes == null || prizes.length == 0){
            return -1;
        }  else {
            int maxProf = 0;
            for (int i = 0; i < prizes.length; i++){
                for (int j = i ; j < prizes.length; j++){
                    if (prizes[j] > prizes[i]){
                        maxProf = Math.max(prizes[j] - prizes[i], maxProf);
                    }
                }
            }
            return maxProf;
        }
    }
}
