import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    DebitCard debitCard1;

    @Before
    public void setUp(){
        debitCard1 = new DebitCard("14568971458697058", "270224", "321", "54065092", "329405");
    }

    @Test
    public void hasACardNumber(){
        assertEquals("14568971458697058", debitCard1.getCardNumber());
    }

    @Test
    public void hasAnExpiry(){
        assertEquals("270224", debitCard1.getExpiryDate());
    }

    @Test
    public void hasASecurityNumber(){
        assertEquals("321", debitCard1.getSecurityNumber());
    }

    @Test
    public void hasAnAccountNumber(){
        assertEquals("54065092", debitCard1.getAccountNumber());
    }

    @Test
    public void hasASortCode(){
        assertEquals("329405", debitCard1.getSortCode());
    }
    @Test
    public void canLogUse(){
        assertEquals("15 pounds spent on debit card", debitCard1.useCard(15));
    }


}
