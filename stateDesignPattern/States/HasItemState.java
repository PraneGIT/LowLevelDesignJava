package stateDesignPattern.States;

import stateDesignPattern.State;
import stateDesignPattern.VendingMachine;

public class HasItemState implements State{

    @Override
    public void addItem(VendingMachine vendingMachine, int num) {
        vendingMachine.itemQuantity+=num;
        System.out.println("item addded");
    }

    @Override
    public void requestItem(VendingMachine vendingMachine) {
        if(vendingMachine.itemQuantity==0){
            vendingMachine.state = new NoItemState();
        }
        else{
            vendingMachine.state = new ItemRequestedState();
        }

        System.out.println("item requested");
    }

    @Override
    public void insertMoney(VendingMachine vendingMachine, int money) {
        throw new UnsupportedOperationException("first request item'");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        throw new UnsupportedOperationException("first request item'");
    }
    
}
