public class Main {
    public static void main(String[] args) {

        IceCreamShop shop = IceCreamShop.getInstance();

        IceCream order1 = shop.orderIceCream("Vanilla", "glaze");
        System.out.println(order1.getDescription() + " - " + order1.getPrice() + " лв");

        IceCream order2 = shop.orderIceCream("Chocolate", "sprinkles");
        System.out.println(order2.getDescription() + " - " + order2.getPrice() + " лв");
    }
}