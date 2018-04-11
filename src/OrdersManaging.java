import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrdersManaging extends JFrame {

    private JPanel panelForTheKitchenAndBarButton;
    private JButton kitchenMenuButton;
    private JButton barMenuButton;

    private JPanel panelForThePlaceOrderAndRemoveButtons;

    private JPanel panelForTableAndClientNumbersAndBills;

    private JLabel tableNumberJLabel;
    private JComboBox tableNumberSelectorJComboBox;
    private JLabel tableBillJLabel;
    private JLabel clientNumberJLabel;
    private JComboBox clientNumberSelectorJComboBox;
    private JLabel clientBillJLabel;
    private JButton placeOrderButton;
    private JButton removeButton;
    private JButton removeAllButton;

    private JTable clientOrderJTable;
    private JScrollPane clientOrderJTableJScrollPane;

    private JPanel holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar;

    private JPanel holdsPanelsForTheKitchen;
    private JPanel holdsPanelsForTheBar;

    PanelsWithFoodAndDrinksImages saladCaprese;
    PanelsWithFoodAndDrinksImages saladEggs;
    PanelsWithFoodAndDrinksImages saladMotley;
    PanelsWithFoodAndDrinksImages saladOakLeaf;
    PanelsWithFoodAndDrinksImages saladPeppersWithCheese;
    PanelsWithFoodAndDrinksImages saladRucolaWithHamonAndFigs;
    PanelsWithFoodAndDrinksImages saladSeaGifts;
    PanelsWithFoodAndDrinksImages saladSheperd;

    PanelsWithFoodAndDrinksImages soupBeans;
    PanelsWithFoodAndDrinksImages soupBeef;
    PanelsWithFoodAndDrinksImages soupBelly;
    PanelsWithFoodAndDrinksImages soupBorsh;
    PanelsWithFoodAndDrinksImages soupChicken;
    PanelsWithFoodAndDrinksImages soupMushroomCream;
    PanelsWithFoodAndDrinksImages soupPeasCream;
    PanelsWithFoodAndDrinksImages soupPotatoCream;

    PanelsWithFoodAndDrinksImages chickenWithRice;
    PanelsWithFoodAndDrinksImages duckWithPotatoes;
    PanelsWithFoodAndDrinksImages guvech;
    PanelsWithFoodAndDrinksImages kapama;
    PanelsWithFoodAndDrinksImages kavarma;
    PanelsWithFoodAndDrinksImages meatSticksWithFries;
    PanelsWithFoodAndDrinksImages musaka;
    PanelsWithFoodAndDrinksImages zucchini;

    PanelsWithFoodAndDrinksImages pizzaCarbonara;
    PanelsWithFoodAndDrinksImages pizzaMargaritta;
    PanelsWithFoodAndDrinksImages pizzaMexicana;
    PanelsWithFoodAndDrinksImages pizzaNapoletana;
    PanelsWithFoodAndDrinksImages pizzaPepperoni;
    PanelsWithFoodAndDrinksImages pizzaRomana;
    PanelsWithFoodAndDrinksImages pizzaLasagna;



    public OrdersManaging() throws HeadlessException {
        super("ORDER MANAGER");

        clientOrderJTable = new JTable();

        panelForTheKitchenAndBarButton = new JPanel();
        panelForTheKitchenAndBarButton.setBackground(Color.CYAN);
        kitchenMenuButton = new JButton("Kitchen");
        barMenuButton = new JButton("Bar");
        GroupLayout layoutForPanelForTheKitchenAndBarButton = new GroupLayout(panelForTheKitchenAndBarButton);
        panelForTheKitchenAndBarButton.setLayout(layoutForPanelForTheKitchenAndBarButton);
        panelForTheKitchenAndBarButton.setBounds(10, 10, 180, 200);
        kitchenMenuButton.setBounds(10, 10, 160, 85);
        barMenuButton.setBounds(10, 105, 160, 85);
        panelForTheKitchenAndBarButton.add(kitchenMenuButton);
        panelForTheKitchenAndBarButton.add(barMenuButton);
        add(panelForTheKitchenAndBarButton);

        panelForTableAndClientNumbersAndBills = new JPanel();
        tableNumberJLabel = new JLabel("SELECT TABLE NUMBER");
        tableNumberSelectorJComboBox = new JComboBox();
        tableBillJLabel = new JLabel("TABLE " + " X " + " BILL = " + "XXX");
        clientNumberJLabel = new JLabel("SELECT SEAT NUMBER");
        clientNumberSelectorJComboBox = new JComboBox();
        clientBillJLabel = new JLabel(" SEAT " + " X " + " BILL = " + "XXX");

        panelForThePlaceOrderAndRemoveButtons = new JPanel();
        panelForThePlaceOrderAndRemoveButtons.setBackground(Color.CYAN);

        placeOrderButton = new JButton("PLACE ORDER");
        removeButton = new JButton("REMOVE");
        removeAllButton = new JButton("REMOVE ALL");
        panelForThePlaceOrderAndRemoveButtons.setBounds(1540, 10, 180, 200);

        placeOrderButton.setSize(120, 15);
        removeButton.setSize(75, 15);
        removeAllButton.setSize(95, 15);

        panelForThePlaceOrderAndRemoveButtons.add(placeOrderButton);
        panelForThePlaceOrderAndRemoveButtons.add(removeButton);
        panelForThePlaceOrderAndRemoveButtons.add(removeAllButton);
        add(panelForThePlaceOrderAndRemoveButtons);

        panelForTableAndClientNumbersAndBills.setBounds(190, 170, 1350, 40);
        panelForTableAndClientNumbersAndBills.setBackground(Color.YELLOW);
        FlowLayout layoutForPanelForTableAndClientNumbersAndBills = new FlowLayout();
        panelForTableAndClientNumbersAndBills.setLayout(layoutForPanelForTableAndClientNumbersAndBills);
        tableNumberJLabel.setSize(115, 15);
        tableNumberSelectorJComboBox.setSize(55, 20);
        tableNumberSelectorJComboBox.setModel(new DefaultComboBoxModel<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8"}));
        tableBillJLabel.setSize(120, 15);
        clientNumberJLabel.setSize(115, 15);
        clientNumberSelectorJComboBox.setSize(55, 20);
        clientNumberSelectorJComboBox.setModel(new DefaultComboBoxModel<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9", "Item 10"}));
        clientBillJLabel.setSize(120, 15);

        clientOrderJTable.setBounds(190, 10, 1350, 160);
        clientOrderJTableJScrollPane = new JScrollPane();
        clientOrderJTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String[]{
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));

        clientOrderJTableJScrollPane.setViewportView(clientOrderJTable);

        holdsPanelsForTheKitchen = new JPanel();
        holdsPanelsForTheBar = new JPanel();

        holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar = new JPanel();
        holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.setBackground(Color.GRAY);
        holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.setLayout(null);
        holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.setBounds(10, 210, 1710, 800);
        holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.setVisible(true);
        add(holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar);


        holdsPanelsForTheKitchen.setBackground(Color.GRAY);
        FlowLayout layoutForPanelThatHoldsTheKitchenPanelsWithFoods = new FlowLayout();
        holdsPanelsForTheKitchen.setLayout(layoutForPanelThatHoldsTheKitchenPanelsWithFoods);
        holdsPanelsForTheKitchen.setSize(1710, 800);
        holdsPanelsForTheKitchen.setVisible(true);
        holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.add(holdsPanelsForTheKitchen);

        holdsPanelsForTheBar.setBackground(Color.GREEN);
        FlowLayout layoutForPanelThatHoldsTheBarPanelsWithDrinks = new FlowLayout();
        holdsPanelsForTheBar.setLayout(layoutForPanelThatHoldsTheBarPanelsWithDrinks);
        holdsPanelsForTheBar.setSize(1710, 800);
        holdsPanelsForTheBar.setVisible(true);
        holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.add(holdsPanelsForTheBar);

        double i = 5.0;


        saladCaprese = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/caprese.jpg");
        saladEggs = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/egg salad.jpg");
        saladMotley = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/motley salad.jpg");
        saladOakLeaf = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/oak leaf salad.JPG");
        saladPeppersWithCheese = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/peppers with cheese.jpg");
        saladRucolaWithHamonAndFigs = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/ricola salad with hamon and figs.jpg");
        saladSeaGifts = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/sea gifts salad.jpg");

        soupBeans = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/beans soup.jpg");
        soupBelly = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/belly soup.jpg");
        soupBorsh = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/borsh soup.jpg");
        soupChicken = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/chicken soup.jpg");
        soupMushroomCream = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/mushroom cream soup.jpg");
        soupPeasCream = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/peas cream soup.jpg");
        soupPotatoCream = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/potato cream soup.jpg");

        chickenWithRice = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/chicken with rice.jpg");
        duckWithPotatoes = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/duck with potatoes.png");
        guvech = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/guvech.jpg");
        kapama = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/kapama.jpg");
        kavarma = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/kavarma.jpg");
        musaka = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/musaka.jpg");
        zucchini = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/zucchini.jpg");

        pizzaCarbonara = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/pizza carbonara.jpg");
        pizzaMargaritta = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/pizza margaritta.jpg");
        pizzaMexicana = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/pizza mexicana.jpg");
        pizzaNapoletana = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/pizza napoletana.jpg");
        pizzaPepperoni = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/pizza pepperoni.jpg");
        pizzaRomana = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/pizza Romana.jpg");
        pizzaLasagna = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/pizza Romana.jpg");

        holdsPanelsForTheKitchen.add(saladCaprese.getHolderPanel());
        holdsPanelsForTheKitchen.add(saladEggs.getHolderPanel());
        holdsPanelsForTheKitchen.add(saladMotley.getHolderPanel());
        holdsPanelsForTheKitchen.add(saladOakLeaf.getHolderPanel());
        holdsPanelsForTheKitchen.add(saladPeppersWithCheese.getHolderPanel());
        holdsPanelsForTheKitchen.add(saladRucolaWithHamonAndFigs.getHolderPanel());
        holdsPanelsForTheKitchen.add(saladSeaGifts.getHolderPanel());

        holdsPanelsForTheKitchen.add(soupBeans.getHolderPanel());
        holdsPanelsForTheKitchen.add(soupBelly.getHolderPanel());
        holdsPanelsForTheKitchen.add(soupBorsh.getHolderPanel());
        holdsPanelsForTheKitchen.add(soupChicken.getHolderPanel());
        holdsPanelsForTheKitchen.add(soupMushroomCream.getHolderPanel());
        holdsPanelsForTheKitchen.add(soupPeasCream.getHolderPanel());
        holdsPanelsForTheKitchen.add(soupPotatoCream.getHolderPanel());

        holdsPanelsForTheKitchen.add(chickenWithRice.getHolderPanel());
        holdsPanelsForTheKitchen.add(duckWithPotatoes.getHolderPanel());
        holdsPanelsForTheKitchen.add(guvech.getHolderPanel());
        holdsPanelsForTheKitchen.add(kapama.getHolderPanel());
        holdsPanelsForTheKitchen.add(kavarma.getHolderPanel());
        holdsPanelsForTheKitchen.add(musaka.getHolderPanel());
        holdsPanelsForTheKitchen.add(zucchini.getHolderPanel());

        holdsPanelsForTheKitchen.add(pizzaCarbonara.getHolderPanel());
        holdsPanelsForTheKitchen.add(pizzaMargaritta.getHolderPanel());
        holdsPanelsForTheKitchen.add(pizzaMexicana.getHolderPanel());
        holdsPanelsForTheKitchen.add(pizzaNapoletana.getHolderPanel());
        holdsPanelsForTheKitchen.add(pizzaPepperoni.getHolderPanel());
        holdsPanelsForTheKitchen.add(pizzaRomana.getHolderPanel());
        holdsPanelsForTheKitchen.add(pizzaLasagna.getHolderPanel());


        panelForTableAndClientNumbersAndBills.add(tableNumberJLabel);
        panelForTableAndClientNumbersAndBills.add(tableNumberSelectorJComboBox);
        panelForTableAndClientNumbersAndBills.add(tableBillJLabel);
        panelForTableAndClientNumbersAndBills.add(clientNumberJLabel);
        panelForTableAndClientNumbersAndBills.add(clientNumberSelectorJComboBox);
        panelForTableAndClientNumbersAndBills.add(clientBillJLabel);


        add(panelForTableAndClientNumbersAndBills);
        add(clientOrderJTable);


        setLayout(new GridBagLayout());
        getContentPane().setLayout(null);
        setVisible(true);
        setSize(1740, 1050);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        kitchenMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kitchenMenuButtonActionPerformed(e);
            }
        });
        barMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                barMenuButtonActionPerformed(e);
            }
        });
    }

    private void kitchenMenuButtonActionPerformed(ActionEvent event) {
        holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.removeAll();
        holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.repaint();
        holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.revalidate();

        holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.add(holdsPanelsForTheKitchen);
        holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.repaint();
        holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.revalidate();
    }

    private void barMenuButtonActionPerformed(ActionEvent event) {
        holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.removeAll();
        holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.repaint();
        holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.revalidate();

        holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.add(holdsPanelsForTheBar);
        holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.repaint();
        holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.revalidate();

    }

    public static void main(String[] args) {
        OrdersManaging o = new OrdersManaging();
    }
}
