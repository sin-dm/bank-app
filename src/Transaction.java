public class Transaction {

    //контейнер для данных, модель

    private String bik;
    private Double amount;
    private String senderFirstName;
    private String senderSecondName;
    private Boolean isSend = false;

    public Transaction(String bik, Double amount, String senderFirstName, String senderSecondName) {
        this.bik = bik;
        this.amount = amount;
        this.senderFirstName = senderFirstName;
        this.senderSecondName = senderSecondName;
    }

    public Boolean isSend() {
        return this.isSend;
    }

    public void setSend(Boolean isSend) {
        this.isSend = isSend;
    }

    public String getBik() {
        return this.bik;
    }

    public void setBik(String bik) {
        this.bik = bik;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getSenderFullName() {
        return this.senderFirstName + " " + this.senderSecondName;
    }


}
