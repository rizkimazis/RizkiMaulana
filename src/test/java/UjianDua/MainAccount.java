package UjianDua;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MainAccount {

    @Test
    @Parameters({"a","n","amt"})
    public void testInsert(int a,String n, double amt){
        MainAccount mainAccount = new MainAccount();
        int actual = mainAccount.testInsert(a, n, amt);
        int expect = 15;
        Assert.assertEquals(actual, expect);
    }

