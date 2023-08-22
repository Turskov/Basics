package ru.netology;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {


    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainIfEquals_800() {
        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainIfAmountEquals_1000() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainIfAmountEquals_999() {
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainIfAmountEquals_1200() {
        int amount = 1200;

        int actual = service.remain(amount);
        int expected = 800;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainIfAmountEquals0() {
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainIfAmountEqualsNegative() {
        int amount = -800;

        int actual = service.remain(amount);
        int expected = 1800;

        assertEquals(actual, expected);
    }
}