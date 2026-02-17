public class VendingMachineDemo {
    public static void main(String[] args) {
        System.out.println("Starting Vending Machine...");
        VendingMachine machine = new VendingMachine(2);

        System.out.println("\n--- Scenario 1: Successful Purchase ---");
        machine.selectItem();
        machine.insertCoin();
        machine.insertCoin();
        machine.dispenseItem();

        System.out.println("\n--- Scenario 2: Invalid Operations ---");
        machine.insertCoin();
        machine.dispenseItem();

        System.out.println("\n--- Scenario 3: Out of Order ---");
        machine.setOutOfOrder();

        // Trying operations while out of order
        machine.selectItem();
        machine.insertCoin();
    }
}