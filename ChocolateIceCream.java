public class ChocolateIceCream extends IceCream{

    public ChocolateIceCream(){
        setPrice(2.3);
        setDescription("Chocolate Ice Cream");
    }
    @Override
    public void prepare() {
        System.out.println("Your chocolate ice cream is being prepared.");
    }
}
