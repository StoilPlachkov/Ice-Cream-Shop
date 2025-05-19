public class ChocolateSprinkles extends IceCreamDecorator{
    public ChocolateSprinkles(IceCream decoratedIceCream) {
        super(decoratedIceCream);
    }

    public String getDescription() {
        return decoratedIceCream.getDescription() + " with a Chocolate sprinkles";
    }

    public double getPrice() {
        return decoratedIceCream.getPrice() + 0.4;
    }

    @Override
    public void prepare() {
        System.out.println("Your ice cream has been sprinkled.");
    }
}

