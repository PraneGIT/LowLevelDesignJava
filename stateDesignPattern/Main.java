package stateDesignPattern;

public class Main {
    public static void main(String[] args) {
        try{
        VendingMachine vendingMachine = new VendingMachine(10, 0);
        vendingMachine.state.addItem(vendingMachine, 5);
        // vendingMachine.state.dispenseItem(vendingMachine);
        vendingMachine.state.requestItem(vendingMachine);
        vendingMachine.state.insertMoney(vendingMachine, 10);
        vendingMachine.state.dispenseItem(vendingMachine);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
