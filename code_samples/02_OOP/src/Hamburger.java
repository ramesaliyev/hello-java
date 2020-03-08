public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println("name:" + this.name + " meat:" + this.meat + " price:" + this.price + " bread:" + this.breadRollType);

        if (this.addition1Name != null) {
            System.out.println("Addition 1 name:" + this.addition1Name + " price:" + this.addition1Price);
            hamburgerPrice += this.addition1Price;
        }

        if (this.addition2Name != null) {
            System.out.println("Addition 2 name:" + this.addition2Name + " price:" + this.addition2Price);
            hamburgerPrice += this.addition2Price;
        }

        if (this.addition3Name != null) {
            System.out.println("Addition 3 name:" + this.addition3Name + " price:" + this.addition3Price);
            hamburgerPrice += this.addition3Price;
        }

        if (this.addition4Name != null) {
            System.out.println("Addition 4 name:" + this.addition4Name + " price:" + this.addition4Price);
            hamburgerPrice += this.addition4Price;
        }

        return hamburgerPrice;
    }

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 5, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 2);
        hamburger.addHamburgerAddition2("Lettuce", 3);
        hamburger.addHamburgerAddition3("Cheese", 4);
        price = hamburger.itemizeHamburger();
        System.out.println("Total price: " + price);
        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 10);
        healthyBurger.addHamburgerAddition1("Egg", 2);
        healthyBurger.addHealthyAddition1("Lentils", 2);
        double price2 = healthyBurger.itemizeHamburger();
        System.out.println("Total price of healthy: " + price2);
        System.out.println();

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition3("Should not add this", 100);
        double price3 = deluxeBurger.itemizeHamburger();
        System.out.println("Total price of deluxe: " + price3);
        System.out.println();
    }
}

class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();

        if (this.healthyExtra1Name != null) {
            System.out.println("Healthy Addition 1 name:" + this.healthyExtra1Name + " price:" + this.healthyExtra1Price);
            hamburgerPrice += this.healthyExtra1Price;
        }

        if (this.healthyExtra2Name != null) {
            System.out.println("Healthy Addition 2 name:" + this.healthyExtra2Name + " price:" + this.healthyExtra2Price);
            hamburgerPrice += this.healthyExtra2Price;
        }

        return hamburgerPrice;
    }
}

class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 20, "White");
        super.addHamburgerAddition1("Chips", 4);
        super.addHamburgerAddition2("Drink", 3);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger!");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger!");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger!");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger!");
    }
}