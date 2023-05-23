import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WalletTest {

    CreditCard creditCard1;

    DebitCard debitCard1;

    GiftCard giftCard1;
    Wallet wallet1;

    @Before
    public void setup(){
        giftCard1 = new GiftCard(20);
        debitCard1 = new DebitCard("14568971458697058", "270224", "321", "54065092", "329405");
        creditCard1 = new CreditCard("0989658473849543", "050626", "937", 2000);
        wallet1 = new Wallet("my wallet");
    }

    @Test
    public void canUseGenericCard(){
        assertEquals("10 pounds spent", wallet1.useGenericCard(10, 0));
    }

    @Test
    public void canAddCardsToWallet(){
        wallet1.addCardToWallet(creditCard1);
        assertEquals(1, wallet1.cardCount());
    }




}
