public class OutOfOrderState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Selecting an item is not allowed in the Out of Order state! The machine is currently broken.");
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Inserting a coin is not allowed in the Out of Order state! The machine is currently broken.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Dispensing is not allowed in the Out of Order state! The machine is currently broken.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("The machine is already in the Out of Order state!");
    }
}