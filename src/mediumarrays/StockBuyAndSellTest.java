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
        assertEquals(-1, max);
    }

    @Test
    public void givenEmpty_return0(){
        StockBuyAndSell stockBuyAndSell = new StockBuyAndSell();
        int max = stockBuyAndSell.maximumProfit(new int[]{});
        assertEquals(-1, max);
    }

    @Test
    public void givenOneElement_return0(){
        StockBuyAndSell stockBuyAndSell = new StockBuyAndSell();
        int max = stockBuyAndSell.maximumProfit(new int[]{1});
        assertEquals(0, max);
    }

    @Test
    public void givenOne2_return0(){
        StockBuyAndSell stockBuyAndSell = new StockBuyAndSell();
        int max = stockBuyAndSell.maximumProfit(new int[]{1, 2});
        assertEquals(0, max);
    }

    @Test
    public void givenOne23_return1(){
        StockBuyAndSell stockBuyAndSell = new StockBuyAndSell();
        int max = stockBuyAndSell.maximumProfit(new int[]{3, 2, 3});
        assertEquals(1, max);
    }

    @Test
    public void givenOne234_return2(){
        StockBuyAndSell stockBuyAndSell = new StockBuyAndSell();
        int max = stockBuyAndSell.maximumProfit(new int[]{7, 2, 3, 4});
        assertEquals(2, max);
    }

    @Test
    public void given234_return2(){
        StockBuyAndSell stockBuyAndSell = new StockBuyAndSell();
        int max = stockBuyAndSell.maximumProfit(new int[]{7, 2, 3, 4});
        assertEquals(2, max);
    }

    @Test
    public void given42347_return1(){
        StockBuyAndSell stockBuyAndSell = new StockBuyAndSell();
        int max = stockBuyAndSell.maximumProfit(new int[]{4, 2, 3, 4, 7, 1});
        assertEquals(5, max);
    }
}
