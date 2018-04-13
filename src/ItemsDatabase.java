import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class ItemsDatabase {

    private List<String> itemsNames;
    private List<Double> itemsPrices;
    private List<Integer> itemsQuantities = new ArrayList<Integer>();
    private List<String> itemsImagePath;

    private int newObjectCreationBlocker;

    public ItemsDatabase() {
        itemsNames = asList("SALAD CAPRESE", "SALAD EGGS", "SALAD MOTLEY", "SALAD OAK LEAF", "SALAD PEPPERS WITH CHEESE", "SALAD RUCOLA WITH HAMON AND FIGS", "SALAD SEA GIFTS",
                "SOUP BEANS", "SOUP BELLY", "SOUP BORSH", "SOUP CHICKEN", "SOUP MUSHROOM CREAM", "SOUP PEAS CREAM", "SOUP POTATO CREAM",
                "PEPPER WITH MEAT AND RICE", "DUCK WITH POTATOES", "GUVECH", "KAPAMA", "KAVARMA", "MUSAKA", "ZUCCHINI",
                "PIZZA CARBONARA", "PIZZA MARGARITA", "PIZZA MEXICANA", "PIZZA NEAPOLITANA", "PIZZA PEPPERONI", "PIZZA ROMANA", "PIZZA LASAGNA",
                "WATER", "CITRONADE", "CITRONADE GRAPEFRUIT", "FRESH WATERMELON", "JUICE ANANAS", "JUICE APPLE", "JUICE PEAR",
                "JUICE PLUM", "LEMONADE", "ORANGEADE", "SMOOTHIE FORREST FRUIT AND BANANA", "SMOOTHIE FORREST FRUITS", "SMOOTHIE RASPBERRY", "TEA MINT",
                "BISQUIT LAVAZZA", "CAPPUCHINO", "COFFEE BREVE", "COFFEE ESPRESSO", "COFFEE MOCHA", "IRISH COFFEE", "LATTE MACHIATTO",
                "BLUEBERRY MARTINI", "CAMPARI", "GRAPE RAKIA", "PEAR RAKIA", "MAKERS MARK", "METAXA", "TEQUILA PATRON");

        itemsPrices = asList(5.80, 3.60, 6.30, 4.90, 4.60, 9.20, 8.90, 3.80, 3.90, 5.40, 3.60, 4.00, 4.20, 4.30, 5.20, 10.70, 10.40, 25.00, 14.00, 4.40, 3.20, 7.50, 8.40, 7.90, 6.80, 5.90, 6.80, 7.50, 9.00,
                1.50, 3.20, 3.40, 2.80, 2.00, 3.50, 2.50, 2.50, 2.20, 2.20, 3.10, 3.20, 3.20, 1.50, 2.00, 2.20, 2.50, 1.90, 2.20, 2.40, 5.80, 7.90, 2.50, 2.80, 8.40, 17.00, 14.00);

        for (int i = 0; i < 56; i++) {
            itemsQuantities.add(100);
        }

        itemsImagePath = asList("/caprese.jpg", "/egg salad.jpg", "/motley salad.jpg", "/oak leaf salad.JPG", "/peppers with cheese.jpg", "/ricola salad with hamon and figs.jpg",
                "/sea gifts salad.jpg", "/soupBeans.jpg", "/belly soup.jpg", "/borsh soup.jpg", "/chicken soup.jpg", "/mushroom cream soup.jpg", "/peas cream soup.jpg", "/potato cream soup.jpg",
                "/peppersWithRiceAndMeat.jpg", "/duck with potatoes.png", "/guvech.jpg", "/kapama.jpg", "/kavarma.jpg", "/musaka.jpg", "/zucchini.jpg", "/pizza carbonara.jpg", "/pizza margaritta.jpg",
                "/pizza mexicana.jpg", "/pizza napoletana.jpg", "/pizza pepperoni.jpg", "/pizza Romana.jpg", "/lasagna.jpg", "/water.jpg", "/citronade.jpg", "/citronadeGrapefruit.jpg",
                "/freshWatermelon.jpg", "/juiceAnanas.jpg", "/juiceApple.jpg", "/juicePear.jpg", "/juicePlum.jpg", "/lemonade.jpg", "/orangeade.jpg", "/smoothieForrestFruitAndBanana.jpg",
                "/smoothieForrestFruits.jpg", "/smoothieRaspberry.jpg", "/teaMint.jpg", "/biscuitLavazza.jpg", "/cappuccino.jpg", "/coffeeBreve.png", "/coffeeEspresso.png", "/coffeMocha.jpg",
                "/irishCoffee.jpg", "/latteMachiatto.jpg", "/blueberrymartini.jpg", "/campari.jpg", "/grapeRakia.jpg", "/pearRakia.jpg", "/makersMark.jpg", "/metaxa.jpg", "/tequilaPatron.jpg"
        );
    }

    public ItemsDatabase(int blocker) {
        this.newObjectCreationBlocker = blocker;
    }

    public List<String> getItemsNames() {
        return itemsNames;
    }

    public List<Double> getItemsPrices() {
        return itemsPrices;
    }

    public List<Integer> getItemsQuantities() {
        return itemsQuantities;
    }

    public List<String> getItemsImagePath() {
        return itemsImagePath;
    }

    public void setItemsQuantities(List<Integer> itemsQuantities) {
        this.itemsQuantities = itemsQuantities;
    }
}
