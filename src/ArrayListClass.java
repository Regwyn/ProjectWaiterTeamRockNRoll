import java.util.List;

import static java.util.Arrays.asList;

public class ArrayListClass {

    List<String> itemNames;
    List<Double> itemPrices;
    List<Integer> itemQuantities;

    public ArrayListClass() {
        itemNames = asList("SALAD CAPRESE", "SALAD EGGS", "SALAD MOTLEY", "SALAD OAK LEAF", "SALAD PEPPERS WITH CHEESE", "SALAD RUCOLA WITH HAMON AND FIGS", "SALAD SEA GIFTS",
                "SOUP BEANS", "SOUP BELLY", "SOUP BORSH", "SOUP CHICKEN", "SOUP MUSHROOM CREAM", "SOUP PEAS CREAM", "SOUP POTATO CREAM",
                "PEPPER WITH MEAT AND RICE", "DUCK WITH POTATOES", "GUVECH", "KAPAMA", "KAVARMA", "MUSAKA", "ZICCHINI",
                "PIZZA CARBONARA", "PIZZA MARGARITA", "PIZZA MEXICANA", "PIZZA NEAPOLITANA", "PIZZA PEPPERONI", "PIZZA ROMANA", "PIZZA LASAGNA",
                "WATER", "CITRONADE", "CITRONADE GRAPEFRUIT", "FRESH WATERMELON", "JUICE ANANAS", "JUICE APPLE", "JUICE PEAR",
                "JUICE PLUM", "LEMONADE", "ORANGEADE", "SMOOTHIE FORREST FRUIT AND BANANA", "SMOOTHIE FORREST FRUITS", "SMOOTHIE RASPBERRY", "TEA MINT",
                "BISQUIT LAVAZZA", "CAPPUCHINO", "COFFEE BREVE", "COFFEE ESPRESSO", "COFFEE MOCHA", "IRISH COFFEE", "LATTE MACHIATTO",
                "BLUEBERRY MARTINI", "CAMPARI", "GRAPE RAKIA", "PEAR RAKIA", "MAKERS MARK", "METAXA", "TEQUILA PATRON");

        itemPrices = asList(5.8,3.6);
    }

    public List<String> getItemNames() {
        return itemNames;
    }
}
