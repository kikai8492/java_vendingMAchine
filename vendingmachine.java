import java.util.HashMap;
class vendingMachine {
  private int totalMoney; //インスタンス変数にした
  public void initialize(int totalMoney) {
    this.totalMoney = 0; 
  }
  public static void drinks() {
    HashMap<String, Integer> hmap = new HashMap<String, Integer>();
    hmap.put("コーラ", 160);
    hmap.put("水", 100);
    hmap.put("モンスター", 210);
  }

  public static void money() {
    
  }

  public static void system() {
    
  }
}

class startVendingMachine {
  public static void main(String[] args) {
    vendingMachine vm = new vendingMachine();
    vm.drinks();
    vm.money();
    vm.system();
  }
}




