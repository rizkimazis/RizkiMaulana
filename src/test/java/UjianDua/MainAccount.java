package UjianDua;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MainAccount {
    Account account;
    int a;
    String n;
    double amt;

    @BeforeMethod
    public void setUp() {
        account = new Account();
    }

    @Test
    @Parameters({"acc_no", "name", "amount"})
    public void testInsert(int acc_no, String name, double amount) {
        account.insert(acc_no, name, amount);
        Assert.assertEquals(acc_no,10000);
        Assert.assertEquals(name, "Rizki Maulana");
        Assert.assertEquals(amount, 5000.0);
    }

    @Test
    @Parameters({"amt", "amount"})
    public void testDeposit(double amt, double amount) {
        account.deposit(amount + amt);
        Assert.assertEquals(amt, 5000.0);
        Assert.assertEquals(amount, 5000.0);
    }

    @Test
    @Parameters({"amt", "amount"})
    public void testWithdraw(double amt, double amount) {
        account.withdraw(amount);
        Assert.assertEquals(amount, 5000.0);
    }

    @Test
    @Parameters({"amount", "amt"})
    public void testCheckBalance(double amount, double amt) {
        double hasil = amount +amt;
        account.checkBalance(hasil);
        Assert.assertEquals(hasil, 5000.0);
    }

    @Test
    @Parameters({"acc_no", "name", "amount", "amt"})
    public void testDisplay(int acc_no, String name, double amount, double amt) {
        double hasil = amount + amt;
        account.display(acc_no, name, hasil);
        Assert.assertEquals(acc_no, 10000);
        Assert.assertEquals(name, "Rizki Maulana");
        Assert.assertEquals(hasil, 5000.0);
    }
}