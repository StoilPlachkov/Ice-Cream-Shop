public class ChocolateGlaze extends IceCreamDecorator{
    public ChocolateGlaze(IceCream decoratedIceCream) {
        super(decoratedIceCream);
    }

    public String getDescription() {
        return decoratedIceCream.getDescription() + " with a Chocolate glaze";
    }

    public double getPrice() {
        return decoratedIceCream.getPrice() + 0.3;
    }

    @Override
    public void prepare() {
        System.out.println("Your ice cream has been glazed.");
    }
}
