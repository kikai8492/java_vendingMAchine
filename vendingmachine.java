class Drink {
    private int price;
    private int stock;

    public Drink(int price, int stock) {
        this.price = price;
        this.stock = stock;
    }

}

class Money {

}

class vendingMachine {

}

class startVendingMachine {
    public static void main(String[] args) {
        Drink drink = new  Drink();
        drink.drinkMenu();
        HashMap<String, Drink> drinkMenu = new HashMap<>();
        drinkMenu.put("コーラ", new Drink(160, 5));
        drinkMenu.put("水", new Drink(100, 5));
        drinkMenu.put("モンスターエナジー", new Drink(210, 5));
    }

    public static void main(String[] args) {
        Money money = new Money();
        money.bill_type();
    }

    public static void main(String[] args) {
        vendingMachine vm = new vendingMachine();
        vm.start();
    }
}


