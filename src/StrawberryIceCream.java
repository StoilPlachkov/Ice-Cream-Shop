public class StrawberryIceCream extends IceCream{

    public StrawberryIceCream(){
        setPrice(2.7);
        setDescription("Strawberry Ice Cream");
    }
    @Override
    public void prepare() {
        System.out.println("Your strawberry ice cream is being prepared.");
    }
}

