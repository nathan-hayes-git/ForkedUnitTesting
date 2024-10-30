package com.lbg.unittesting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    @Test
    public void testAccountHolderName(){
        Bank ac1 = new Bank("Anika", "Hussain");
        String name = ac1.getAccountHolderName();
        assertEquals("Anika Hussain", name);
    }

    @Test
    public void testCreditFunction() {
        Bank account = new Bank("Aaryan","Mishra");
        account.credit(100.0);
        double resultingBalance = account.getBalance();
        assertEquals(100.0, resultingBalance);
    }

    @Test
    public void testDebitFunction() {
        Bank account = new Bank("Nassim", "Karimi");
        account.credit(100.0);
        account.debit(200.0);
        double resultingBalance = account.getBalance();
        assertEquals(50.0, resultingBalance);
    }
}
