import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {

    GiftCard giftCard1;

    @Before
    public void setUp(){
        giftCard1 = new GiftCard(20);
    }

    @Test
    public void giftCardHasABalance(){
        assertEquals(20, giftCard1.getBalance());
    }

    @Test
    public void canReduceBalance(){
        giftCard1.useCard(2);
        assertEquals(18, giftCard1.getBalance());
    }
}
