public class simpleFactory{
    public static void main(String[] args) {
        SimpleHamburgerFactory factory =new ISBFactory();
        IHamburger hamburger= factory.createHamburger("ISBcheese");

        // hamburger.name="kutta";
      

        hamburger.prepare();

        
    }
}