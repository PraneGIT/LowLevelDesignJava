package stateDesignPattern;

public interface State {
    public void addItem(VendingMachine vendingMachine,int num);
    public void requestItem(VendingMachine vendingMachine);
    public void insertMoney(VendingMachine vendingMachine,int money);
    public void dispenseItem (VendingMachine vendingMachine);
}
