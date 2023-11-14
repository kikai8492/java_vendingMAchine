class Drink {

}

class Money {

}

class vendingMachine {

}

class startVendingMachine {
    public static void main(String[] args) {
        Drink drink = new  Drink();
        drink.drinks();
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


