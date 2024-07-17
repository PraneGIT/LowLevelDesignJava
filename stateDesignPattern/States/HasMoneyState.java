package stateDesignPattern.States;

import stateDesignPattern.State;
import stateDesignPattern.VendingMachine;

public class HasMoneyState implements State {

    @Override
    public void addItem(VendingMachine vendingMachine, int num) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Item dispense in progress");
    }

    @Override
    public void requestItem(VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Item dispense in progress");
    }

    @Override
    public void insertMoney(VendingMachine vendingMachine, int money) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Item dispense in progress");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        vendingMachine.itemQuantity-=1;
        System.out.println("Item dispensed");
        if(vendingMachine.itemQuantity==0){
            vendingMachine.state = new NoItemState();
        }else{
            vendingMachine.state = new HasItemState();
        }
    }
    
}
