package stateDesignPattern.States;

import stateDesignPattern.State;
import stateDesignPattern.VendingMachine;

public class NoItemState implements State {

    @Override
    public void addItem(VendingMachine vendingMachine,int num) {
        vendingMachine.itemQuantity+=num;
        vendingMachine.state = new HasItemState();
        System.out.println("item added");
    }

    @Override
    public void requestItem(VendingMachine vendingMachine) {
        throw new UnsupportedOperationException("no item available'");
    }

    @Override
    public void insertMoney(VendingMachine vendingMachine, int money) {
        throw new UnsupportedOperationException("no item available'");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        throw new UnsupportedOperationException("no item available'");
    }
    
}
