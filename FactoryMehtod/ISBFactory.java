public class ISBFactory extends SimpleHamburgerFactory{

    @Override
    public IHamburger createOtherHamburger(String type) {

        if(type.equals("ISBcheese"))
        {
            return new ISBCheezBurger();
        }else if(type.equals("ISBveggie"))
        {
            return new ISBVeggieBurger();
        }
        return null;
    }
    
}
