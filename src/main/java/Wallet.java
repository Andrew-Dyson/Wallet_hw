import java.util.ArrayList;

public class Wallet {

    private String name;

    private ArrayList<IChargeable> cards;

    public Wallet(String name){
        this.cards = new ArrayList<IChargeable>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int cardCount(){
        return cards.size();
    }

    public void addCardToWallet(IChargeable cardToAdd){
        this.cards.add(cardToAdd);
    }

    public String useGenericCard(int itemCost, int index) {
        IChargeable cardToUse = cards.get(index);
        return cardToUse.useCard(itemCost);
    };