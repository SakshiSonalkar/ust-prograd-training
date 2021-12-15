import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletTest {
    private Wallet moneyConverter;

    @BeforeEach
    public void setup() {
        moneyConverter = new Wallet();
    }

    @Test
    public void   checkIfOneDollarIsSeventyFivePointEightFiveRupees() {
        assertEquals(74.85,moneyConverter.converter(1, "INR"));

    }

    @Test
    public void checkIfDepositAmountInRupeeAddedToWallet() {
        assertEquals(374.25, moneyConverter.depositAmount(5, "INR"));
    }
    @Test
    public void checkIfDepositAmountInDollarAddedToWallet() {
        assertEquals(2, moneyConverter.depositAmount(149.7, "USD"));
    }

    @Test
    public void checkMultipleDepositAmountInRupeeIntoWallet() {
        assertEquals(374.25, moneyConverter.depositAmount(5, "INR"));
        assertEquals(1122.75, moneyConverter.depositAmount(10, "INR"));
    }


    @Test
    public void checkMultipleDepositAmountInDollarIntoWallet() {
        assertEquals(2, moneyConverter.depositAmount(149.7, "USD"));
        assertEquals(4, moneyConverter.depositAmount(149.7, "USD"));
    }

    @Test
    public void checkSumOfRupeesAndDollarGivesInRupees() {
        double actualAmount = 50 + moneyConverter.converter(1, "INR");
        double expectedAmount = 124.85;
        assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void checkSumOfRupeesAndDollarGivesInDollar() {
        double actualAmount = 1 + moneyConverter.converter(74.85, "USD") + moneyConverter.converter(149.7, "USD");
        double expectedAmount = 4;
        assertEquals(expectedAmount, actualAmount);
    }
    @Test
    public void withdrawAmountInDollarFromWallet() {
        assertEquals(2, moneyConverter.depositAmount(149.7, "USD"));
        assertEquals(1, moneyConverter.withdrawAmount(1));
    }
    @Test
    public void withdrawAmountInRupeeFromWallet() {
        assertEquals(149.7, moneyConverter.depositAmount(2, "INR"));
        assertEquals(74.85, moneyConverter.withdrawAmount(74.85));
    }
    @Test
    public void throwsExceptionWhenUnitIsInvalidUnit(){
        assertThrows(IllegalArgumentException.class, ()-> {
            moneyConverter.withdrawAmount(2);
        });
    }
    @Test
    public void checkWalletBalance(){
        assertEquals(2, moneyConverter.depositAmount(149.7, "USD"));
        assertEquals(2,moneyConverter.getBalAmount());
    }
}