package bookMyShow;

public class Payment {
    private String paymentId;
    private String paymentMethod;
    private double amount;
    private boolean status=false;
    Show show;
    int seatID;

    public Payment(String paymentId, String paymentMethod, double amount) {
        this.paymentId = paymentId;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    public void makePayment(){
        if(status){
            System.out.println("Payment already done");
            return;
        }
        status=true;
        System.out.println("Payment done successfully");
    }

    public String getPaymentId() {
        return paymentId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public boolean getStatus() {
        return status;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
