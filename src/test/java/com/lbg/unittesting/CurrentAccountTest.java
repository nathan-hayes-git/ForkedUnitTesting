package com.lbg.unittesting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrentAccountTest {
    @Test
    public void testCurrentAccount() {
        CurrentAccount account = new CurrentAccount("Lisa", "Simpson");
        account.deposit(10000);
        String transactionResult = account.withdraw(5100);
        String expected = "Success";
        assertEquals(expected, transactionResult);
    }
}