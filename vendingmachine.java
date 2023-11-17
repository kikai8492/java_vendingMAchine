import java.util.HashMap;

class VendingMachine {
    private int slotMoney;
    private int salesMoney;
    private int[] billType;
    private HashMap<String, Integer> drinks;

    public void initialize() {
        this.slotMoney = 0;
        this.salesMoney = 0;
        this.drinks = new HashMap<>();
    }

    public void drinks() {
        drinks.put("コーラ", 160);
        drinks.put("水", 100);
        drinks.put("モンスター", 210);
    }

    public void money() {
        this.billType = new int[] {10, 50, 100, 500, 1000};
    }

    public void system() {
        System.out.println("自動販売機へようこそ" );
        
    }
}

class StartVendingMachine {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        
        vm.drinks();
        vm.money();
        vm.system();
    }
}