public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Selecting another item is not allowed in the Item Selected state! You have already made a choice.");
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        machine.setBalance(machine.getBalance() + 1);
        System.out.println("Coin accepted. Current balance is now: " + machine.getBalance());
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Payment received. Transitioning to the Dispensing state...");
        machine.setCurrentState(new DispensingState());

        // Automatically trigger the dispense action in the new state
        machine.getCurrentState().dispenseItem(machine);
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Error detected. Switching to Out of Order mode from the Item Selected state.");
        machine.setCurrentState(new OutOfOrderState());
    }
}