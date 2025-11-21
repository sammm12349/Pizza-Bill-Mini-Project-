public class pizza {
    private int price;


    private Boolean Veg;

    private int addExtraCheese = 100;
    private int addTopping = 150;
    private int Backpack = 200;
    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isToppingAdded = false;
    private boolean isBackpackAdded = false;



    public pizza(Boolean veg) {
        Veg = veg;
        if (this.Veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }


    public void addExtraCheese() {
        isExtraCheeseAdded = true;

        this.price += addExtraCheese;
    }

    public void addTopping() {
        isToppingAdded = true;

        this.price += addTopping;

    }

    public void takeAway(){
        isBackpackAdded = true;

        this.price += Backpack;

    }

    public void getBill(){
        String Bill = " ";
        System.out.println("Pizza " + basePizzaPrice);
        if(isExtraCheeseAdded){
            Bill += "Extra Cheese added " + addExtraCheese+ "\n";
        }
        if(isToppingAdded){
            Bill += "Topping added " + addTopping+ "\n";
        }
        if(isBackpackAdded){
            Bill += "Backpack added " + Backpack+ "\n";
        }
        Bill += "Bill " + this.price + "\n";
        System.out.println(Bill);
    }


}



