// Java code​​​​​​‌‌‌‌‌‌​‌​​​‌​​​​​‌​​‌​‌​​ below
/********************************************************
 * Write your answer here, and then test your code.
 * Your job is to implement the BirthdayCake and WeddingCake
 * classes as well as the createWeddingCake() method.
 * BirthdayCake and WeddingCake should inherit from Cake.
 *********************************************************/

class Answer {

    /***************************************************
     * Change these boolean values to control whether you see
     * the expected result and/or hints.
     ****************************************************/
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    // Do not change this method
    static Cake createCake() {
        Cake cake = new Cake();
        cake.setPrice(29.99);
        return cake;
    }

    // Do not change this method
    static BirthdayCake createBirthdayCake() {
        return new BirthdayCake();
    }

    static WeddingCake createWeddingCake() {
        WeddingCake weddingCake = new WeddingCake();

        // TODO: Set the price and flavor by uncommenting the next 2 lines
        weddingCake.setFlavor("pina colada");
        weddingCake.setPrice(350);

        return weddingCake;
    }

}

class BirthdayCake extends Cake {
    /*
     * TODO: Your code goes here.
     * It must inherit from the Cake class.
     * BirthdayCake should have a field of its own called candles.
     * This class should also contain a getter and setter method for candles.
     * The default flavor of a birthday cake should be chocolate.
     */
    private int candles;

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

}

class WeddingCake extends Cake {
    /*
     * TODO: Your code goes here.
     * This class must inherit from Cake.
     * It should have a field called tiers.
     * Create a getter and setter method for tiers.
     * The default flavor of a wedding cake should be almond.
     */
    public WeddingCake() {
        super("almond");
    }
}

class Cake {
    private String flavor;
    private double price;

    public Cake() {
        this("vanilla");
    }

    public Cake(String flavor) {
        setFlavor(flavor);
        setPrice(9.99);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}