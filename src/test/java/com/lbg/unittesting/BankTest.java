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

}
