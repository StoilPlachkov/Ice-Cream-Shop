public class IceCreamFactory extends ShopFactory{
    @Override
    public IceCream createIceCream(String flavour) {
        if(flavour.equals("Vanilla")){
            return new VanillaIceCream();
        }
        if(flavour.equals("Chocolate")){
            return new ChocolateIceCream();
        }
        if(flavour.equals("Strawberry")){
            return new StrawberryIceCream();
        }
        System.out.println("Unknown flavour: " + flavour);
        return null;
    }
}
