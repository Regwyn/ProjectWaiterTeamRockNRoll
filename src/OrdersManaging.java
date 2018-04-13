import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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

    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    private PanelsWithFoodAndDrinksImages foodOrDrinkItem;



    public OrdersManaging() throws HeadlessException {
        super("ORDER MANAGER");
        initializeComponents();
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

    private void initializeComponents() {

        clientOrderJTable = new JTable();

//        оформяне на панела с двата бутона съответно за кухня и Бар
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

//        оформяне на панела с номера на масата и мястото на клиента заедно със сметката на масата, сметката на клиента и двете падащи менюта, които избират маса и клиент
        panelForTableAndClientNumbersAndBills = new JPanel();
        tableNumberJLabel = new JLabel("SELECT TABLE NUMBER");
        tableNumberSelectorJComboBox = new JComboBox();
        tableBillJLabel = new JLabel("TABLE " + " X " + " BILL = " + "XXX");
        clientNumberJLabel = new JLabel("SELECT SEAT NUMBER");
        clientNumberSelectorJComboBox = new JComboBox();
        clientBillJLabel = new JLabel(" SEAT " + " X " + " BILL = " + "XXX");

//        оформяне на панела с бутоните за потвърждаване на поръчката и тези за изтриването и

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

//        menuSearchBar = new DropDownAutocompleteSearchBar();

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

//        инициализиране на jTable

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

//        инициализиране на двата панела, които ще държат менютата за кухня и бар

        holdsPanelsForTheKitchen = new JPanel(); //ще държи панелите от другите класове дето са обекти-храни от кухнята
        holdsPanelsForTheBar = new JPanel(); //ще държи панелите от другите класове дето са обекти-храни от бара

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

        ItemsDatabase itemsSpecifications = new ItemsDatabase();

        for (int j = 0; j < itemsSpecifications.getItemsNames().size(); j++) {
            String itemName = itemsSpecifications.getItemsNames().get(j);
            double itemPrice = itemsSpecifications.getItemsPrices().get(j);
            int itemQuantity = itemsSpecifications.getItemsQuantities().get(j);
            String itemImagePath = itemsSpecifications.getItemsImagePath().get(j);

            if (j < itemsSpecifications.getItemsNames().size() / 2) {
                foodOrDrinkItem = new PanelsWithFoodAndDrinksImages(itemName, itemPrice, itemQuantity, itemImagePath);
                holdsPanelsForTheKitchen.add(foodOrDrinkItem.getHolderPanel());
            } else {
                foodOrDrinkItem = new PanelsWithFoodAndDrinksImages(itemName, itemPrice, itemQuantity, itemImagePath);
                holdsPanelsForTheBar.add(foodOrDrinkItem.getHolderPanel());
            }
        }


        panelForTableAndClientNumbersAndBills.add(tableNumberJLabel);
        panelForTableAndClientNumbersAndBills.add(tableNumberSelectorJComboBox);
        panelForTableAndClientNumbersAndBills.add(tableBillJLabel);
        panelForTableAndClientNumbersAndBills.add(clientNumberJLabel);
        panelForTableAndClientNumbersAndBills.add(clientNumberSelectorJComboBox);
        panelForTableAndClientNumbersAndBills.add(clientBillJLabel);

//        panelForTableAndClientNumbersAndBills.add(menuSearchBar.getContentPanel());

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

    public static void main(String[] args) {
        OrdersManaging o = new OrdersManaging();

        System.out.println();
    }
}