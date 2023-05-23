public class CreditCard extends PaymentCard implements IChargeable{

    private int availableCredit;
    public CreditCard(String cardNumber, String expiryDate, String securityNumber, int availableCredit){
        super(cardNumber, expiryDate, securityNumber);
        this.availableCredit = availableCredit;
    }

    public int getAvailableCredit() {
        return availableCredit;
    }

    public String useCard(int itemCost){
        this.availableCredit -= itemCost*1.05;
        return itemCost + " pounds spent on credit card";
    }
}
