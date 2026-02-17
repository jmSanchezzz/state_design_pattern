public class IdleState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item selected successfully! The machine is now waiting for you to insert coins.");
        machine.setCurrentState(new ItemSelectedState());
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Inserting a coin is not allowed in the Idle state! Please select an item first.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Dispensing is not allowed in the Idle state! You must select an item and pay first.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Switching to Out of Order mode from the Idle state.");
        machine.setCurrentState(new OutOfOrderState());
    }
}