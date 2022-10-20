public class NYFactory extends SimpleHamburgerFactory{

    @Override
    public IHamburger createOtherHamburger(String type) {
        if(type.equals("NYcheese"))
        {
            return new NYCheezBurger();
        }else if(type.equals("NYveggie"))
        {
            return new NYVeggieBurger();
        }
        return null;
    }
    
}
