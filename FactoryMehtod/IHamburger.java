
public abstract class IHamburger {
    public String name;
    public void prepare(){
        System.out.println(name+" Burger is preparing...");
    }
    public void cook(){
        System.out.println(this.name+" Burger is cooking...");
    }
    public void box(){
        System.out.println(this.name+" Burger is boxing...");
    }

}
