public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Selecting an item is not allowed in the Dispensing state! Please wait for your item to drop.");
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Inserting a coin is not allowed in the Dispensing state! Please wait for your item to drop.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        // Handle dispensing logic
        machine.setInventory(machine.getInventory() - 1);
        machine.setBalance(0);
        System.out.println("CHUNK! Item dispensed successfully. Enjoy your snack!");

        // Automatically transition back to Idle state
        System.out.println("Dispensing complete. The machine is automatically returning to the Idle state.");
        machine.setCurrentState(new IdleState());
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Critical error during dispensing! Switching to Out of Order mode.");
        machine.setCurrentState(new OutOfOrderState());
    }
}