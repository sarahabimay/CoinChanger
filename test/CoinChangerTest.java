import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CoinChangerTest {

    public CoinChanger coins;

    @Before
    public void setUp() throws Exception {
        coins = new CoinChanger();
    }

    @Test
    public void onePence(){
        assertEquals(asArrayList(1), coins.convertToCoins(1));
    }

    @Test
    public void twoPence() {
        assertEquals(asArrayList(2), coins.convertToCoins(2));
    }

    @Test
    public void threePence() {
        assertEquals(asArrayList(2, 1), coins.convertToCoins(3));
    }

    @Test
    public void fourPence() {
        assertEquals(asArrayList(2, 2), coins.convertToCoins(4));
    }

    @Test
    public void fivePence() {
        assertEquals(asArrayList(5), coins.convertToCoins(5));
    }

    @Test
    public void tenPence() {
        assertEquals(asArrayList(10), coins.convertToCoins(10));
    }

    @Test
    public void twentyPence() {
        assertEquals(asArrayList(20), coins.convertToCoins(20));
    }

    @Test
    public void fiftyPence() {
        assertEquals(asArrayList(50), coins.convertToCoins(50));
    }

    @Test
    public void onePound() {
        assertEquals(asArrayList(100), coins.convertToCoins(100));
    }

    @Test
    public void twoPound() {
        assertEquals(asArrayList(200), coins.convertToCoins(200));
    }

    @Test
    public void allCoins() {
        assertEquals(asArrayList(200, 100, 50, 20, 10, 5, 2, 1), coins.convertToCoins(388));
    }

    private ArrayList<Integer> asArrayList(Integer... i) {
        return new ArrayList<Integer>(Arrays.asList(i));
    }
}
