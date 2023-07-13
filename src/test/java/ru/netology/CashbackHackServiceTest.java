package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void testBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);

    }

    @Test

    public void testNormalCash() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testMinimalBorderCash() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testMinimalCash() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testZeroCash() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCash() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void testMoreCashHigh() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1900;
        int actual = service.remain(amount);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testMaximalCash() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999999999;
        int actual = service.remain(amount);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }



}