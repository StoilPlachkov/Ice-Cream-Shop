public class IceCreamShop {
    private static IceCreamShop instance;

    private IceCreamShop() {
        System.out.println("The shop is open!!!");
    }

    public static IceCreamShop getInstance() {
        if (instance == null) {
            synchronized (IceCreamShop.class) {
                if (instance == null) {
                    instance = new IceCreamShop();
                }
            }
        }
        return instance;
    }

    public IceCream orderIceCream(String flavour, String toppings) {
        IceCreamFactory iceCreamFactory = new IceCreamFactory();
        IceCream order = iceCreamFactory.prepareIceCream(flavour);
        if (toppings.equals("glaze")) {
            order = new ChocolateGlaze(order);
        }
        if (toppings.equals("sprinkles")) {
            order = new ChocolateSprinkles(order);
        }
        return order;
    }
}
