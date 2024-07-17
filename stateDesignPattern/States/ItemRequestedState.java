package stateDesignPattern.States;

import stateDesignPattern.State;
import stateDesignPattern.VendingMachine;

public class ItemRequestedState implements State{

    @Override
    public void addItem(VendingMachine vendingMachine, int num) {
        throw new UnsupportedOperationException("Item Dispense in progress");
    }

    @Override
    public void requestItem(VendingMachine vendingMachine) {
        throw new UnsupportedOperationException("Item already requested'");
    }

    @Override
    public void insertMoney(VendingMachine vendingMachine, int money) {
        if(money < vendingMachine.itemCost ){
            throw new UnsupportedOperationException("Insufficient money");
        }
        vendingMachine.money += money;
        vendingMachine.state = new HasMoneyState();
        System.out.println("money inserted");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        throw new UnsupportedOperationException("Please insert money first'");
    }
    
}
