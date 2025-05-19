public abstract class IceCreamDecorator extends IceCream {
    protected IceCream decoratedIceCream;

    public IceCreamDecorator(IceCream decoratedIceCream) {
        super();
        this.decoratedIceCream = decoratedIceCream;
    }

    @Override
    public void prepare() {
        this.decoratedIceCream.prepare();
    }
}
