package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void calculateBonus() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    void calculateBonusMore1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1800;

        int actual = service.remain(amount);
        int expected = 200;
        assertEquals(actual, expected);
    }

    @Test
    void calculateBonus1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}

