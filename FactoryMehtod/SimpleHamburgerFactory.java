
public abstract class SimpleHamburgerFactory {

    
    
    public  IHamburger createHamburger(String type){
        IHamburger burger;
        burger=createOtherHamburger(type);
        return burger;
    }
    public abstract  IHamburger createOtherHamburger(String type);

    }


