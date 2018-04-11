import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelsWithFoodAndDrinksImages {

    private JPanel holderPanel;
    private JButton buttonWithImage;
    private String itemName;
    private String itemPrice;
    private JLabel itemNameJLabel;
    private JLabel itemPriceJLabel;
    private String imagePath;
    private final int panelWidth = 200;
    private final int panelHeight = 200;

    public PanelsWithFoodAndDrinksImages(String itemName, String itemPrice, String imagePath) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.imagePath = imagePath;

        holderPanel = new JPanel();
        BoxLayout layoutForPanelThatHoldsTheKitchenPanelsWithFoods = new BoxLayout(holderPanel,1);
        holderPanel.setLayout(layoutForPanelThatHoldsTheKitchenPanelsWithFoods);
        buttonWithImage = new JButton();
        itemNameJLabel = new JLabel(this.itemName);
        itemPriceJLabel = new JLabel(this.itemPrice);
        holderPanel.setSize(this.panelWidth,this.panelHeight);

        buttonWithImage.setSize(200,150);
        buttonWithImage.setIcon(new ImageIcon(getClass().getResource(this.imagePath)));
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

    public JPanel getHolderPanel() {
        return holderPanel;
    }

    private void buttonWithImageActionPerformed(ActionEvent e){

    }
}
