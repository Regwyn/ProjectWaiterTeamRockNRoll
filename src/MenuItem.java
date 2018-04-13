public class MenuItem {

    private String itemName;
    private double itemPrice;
    private int itemQuantity;
    private String itemImagePath;

    private int itemID;
    private static int counterID;

    public MenuItem() {
        ItemsDatabase itemsSpecifications;
        if (counterID == 0){
            itemsSpecifications = new ItemsDatabase();
        } else {
            itemsSpecifications = new ItemsDatabase(1);
        }

        this.itemName = itemsSpecifications.getItemsNames().get(itemID);
        this.itemPrice = itemsSpecifications.getItemsPrices().get(itemID);
        this.itemQuantity = itemsSpecifications.getItemsQuantities().get(itemID);
        this.itemImagePath = itemsSpecifications.getItemsImagePath().get(itemID);
        this.itemID = counterID;
        this.counterID++;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public String getItemImagePath() {
        return itemImagePath;
    }

    public int getItemID() {
        return itemID;
    }

    public static int getCounterID() {
        return counterID;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public static void main(String[] args) {
        ItemsDatabase a = new ItemsDatabase();
    }
}
