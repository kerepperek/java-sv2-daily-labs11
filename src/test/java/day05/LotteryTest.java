package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {
    @Test
    void testLottery(){
        Lottery lottery=new Lottery(100,5);
        assertEquals(5, lottery.startLottery().size());
    }

}