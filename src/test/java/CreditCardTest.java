import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CreditCardTest {

    CreditCard creditCard1;

    @Before
    public void setUp() {
        creditCard1 = new CreditCard("0989658473849543", "050626", "937", 2000);
    }

    @Test
    public void hasACardNumber(){
        assertEquals("0989658473849543", creditCard1.getCardNumber());
    }

    @Test
    public void hasAnExpiry(){
        assertEquals("050626", creditCard1.getExpiryDate());
    }

    @Test
    public void hasASecurityNumber(){
        assertEquals("937", creditCard1.getSecurityNumber());
    }
    @Test
    public void hasCredit(){
        assertEquals(2000, creditCard1.getAvailableCredit());
    }
    @Test
    public void canReduceCredit(){
        creditCard1.useCard(30);
        assertEquals(1968, creditCard1.getAvailableCredit());
    }
    @Test
    public void canLogUse(){
        assertEquals("30 pounds spent on credit card", creditCard1.useCard(30));
    }
}
