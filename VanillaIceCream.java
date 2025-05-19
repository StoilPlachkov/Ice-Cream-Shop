public class VanillaIceCream extends IceCream{

    public VanillaIceCream(){
        setPrice(2.0);
        setDescription("Vanilla Ice Cream");
    }
    @Override
    public void prepare() {
        System.out.println("Your vanilla ice cream is being prepared.");
    }
}
