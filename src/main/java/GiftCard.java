public class GiftCard {

    private int balance;
    public GiftCard(int balance){
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }


    public String useCard(int itemCost){
        this.balance -= itemCost;
        return itemCost + " pounds spent";
    }
}
