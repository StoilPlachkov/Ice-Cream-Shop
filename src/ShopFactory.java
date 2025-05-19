public abstract class ShopFactory {
    public abstract IceCream createIceCream(String flavour);

    public IceCream prepareIceCream(String flavour){
        IceCream iceCream = this.createIceCream(flavour);
        iceCream.prepare();
        return iceCream;
    }
}
