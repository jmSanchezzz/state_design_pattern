public class VendingMachine {
        private VendingMachineState currentState;
        private int inventory;
        private int balance;

        public VendingMachine(int inventory) {
            this.inventory = inventory;
            this.balance = 0;
            this.currentState = new IdleState(); // Initial state
        }

        // --- Delegated Actions ---
        public void selectItem() {
            currentState.selectItem(this);
        }

        public void insertCoin() {
            currentState.insertCoin(this);
        }

        public void dispenseItem() {
            currentState.dispenseItem(this);
        }

        public void setOutOfOrder() {
            currentState.setOutOfOrder(this);
        }

        // --- Getters & Setters ---
        public void setCurrentState(VendingMachineState state) {
            this.currentState = state;
        }

        public VendingMachineState getCurrentState() {
            return currentState;
        }

        public int getInventory() {
            return inventory;
        }

        public void setInventory(int inventory) {
            this.inventory = inventory;
        }

        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }
    }

