import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelsWithFoodAndDrinksImages {

    private JPanel holderPanel;
    private JButton buttonWithImage;

    private String itemName;
    private double itemPrice;
    private int itemQuantity;
    private String itemImagePath;

    private JLabel itemNameJLabel;
    private JLabel itemPriceJLabel;
    private final int panelWidth = 200;
    private final int panelHeight = 200;
    private int itemID;
    private static int counterID;
    private DefaultTableModel dtm;

    public PanelsWithFoodAndDrinksImages(String itemName, double itemPrice, int itemQuantity, String itemImagePath) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
        this.itemImagePath = itemImagePath;
        this.itemID = counterID;
        this.counterID++;

        holderPanel = new JPanel();
        BoxLayout layoutForPanelThatHoldsTheKitchenPanelsWithFoods = new BoxLayout(holderPanel,1);
        holderPanel.setLayout(layoutForPanelThatHoldsTheKitchenPanelsWithFoods);
        buttonWithImage = new JButton();
        itemNameJLabel = new JLabel(this.itemName);
        itemPriceJLabel = new JLabel(String.valueOf(this.itemPrice));
        holderPanel.setSize(this.panelWidth,this.panelHeight);

        buttonWithImage.setSize(200,150);
        buttonWithImage.setIcon(new ImageIcon(getClass().getResource(this.itemImagePath)));
        buttonWithImage.setVisible(true);
        itemNameJLabel.setSize(200,20);
        itemNameJLabel.setToolTipText(this.itemName);
        itemPriceJLabel.setSize(200,20);

        buttonWithImage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonWithImageActionPerformed(e);
            }
        });

        holderPanel.add(buttonWithImage);
        holderPanel.add(itemNameJLabel);
        holderPanel.add(itemPriceJLabel);
    }

    public PanelsWithFoodAndDrinksImages() {
    }

    public static void setCounterID(int counterID) {
        PanelsWithFoodAndDrinksImages.counterID = counterID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getItemID() {
        return itemID;
    }

    public JPanel getHolderPanel() {
        return holderPanel;
    }

    private void buttonWithImageActionPerformed(ActionEvent e){

        ArrayListClass a = new ArrayListClass();
        System.out.println(a.getItemNames().get(getItemID()));
        System.out.println(getItemID());
        dtm.addRow(new Object[] { itemID,a.getItemNames().get(getItemID()),"data111",
                "data222"});
    }


}

