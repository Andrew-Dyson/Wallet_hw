public class DebitCard extends PaymentCard implements IChargeable{

    private String accountNumber;
    private String sortCode;
    public DebitCard(String cardNumber, String expiryDate, String securityNumber, String accountNumber, String sortCode){
        super(cardNumber, expiryDate, securityNumber);
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getSortCode() {
        return sortCode;
    }

    public String useCard(int itemCost){
        return itemCost + " pounds spent on debit card";
    }
}
