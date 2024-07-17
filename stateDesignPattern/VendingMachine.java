package stateDesignPattern;

import stateDesignPattern.States.*;

public class VendingMachine {
    public State state;
    public int money=0;
    public int itemCost;
    public int itemQuantity;

    public VendingMachine(int itemCost, int itemQuantity) {
        this.itemCost = itemCost;
        this.itemQuantity = itemQuantity;
        if (itemQuantity == 0) {
            state = new NoItemState();
        }else{
            state = new HasItemState();
        }
    }

}
