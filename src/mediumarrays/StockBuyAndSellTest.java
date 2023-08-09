package mediumarrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StockBuyAndSellTest {
    @Test
    public void noting(){}

    @Test
    public void givenNull_return0(){
        StockBuyAndSell stockBuyAndSell = new StockBuyAndSell();
        int max = stockBuyAndSell.maximumProfit(null);
        assertEquals(0, max);
    }

    @Test
    public void givenEmpty_return0(){
        StockBuyAndSell stockBuyAndSell = new StockBuyAndSell();
        int max = stockBuyAndSell.maximumProfit(null);
        assertEquals(0, max);
    }
}
