public class App {
    private static ItalianChef ItalianChef;
    private static ChineseChef ChineseChef;

    public static void main(String [] args) {

        Chef normalChef = new Chef();
        normalChef.makeSpecialDish();

        ItalianChef = new ItalianChef();
        ItalianChef.makeChicken();
        ItalianChef.makePasta();
        ItalianChef.makeSpecialDish();

        ChineseChef = new ChineseChef();
        ChineseChef.makeSpecialDish();

    }
}
