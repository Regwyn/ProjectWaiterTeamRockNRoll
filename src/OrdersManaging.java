import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrdersManaging extends JFrame {

    private JPanel panelForTheKitchenAndBarButton;
    private JButton kitchenMenuButton;
    private JButton barMenuButton;
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

        placeOrderButton = new JButton("PLACE ORDER");
        removeButton = new JButton("REMOVE");
        removeAllButton = new JButton("REMOVE ALL");
        panelForTableAndClientNumbersAndBills.setBounds(190, 170, 1390, 40);
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
        placeOrderButton.setSize(120, 15);
        removeButton.setSize(75, 15);
        removeAllButton.setSize(95, 15);

        clientOrderJTable.setBounds(190, 10, 1390, 160);
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
        holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.setBounds(10, 210, 1570, 600);
        holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.setVisible(true);
        add(holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar);


        holdsPanelsForTheKitchen.setBackground(Color.GRAY);
        FlowLayout layoutForPanelThatHoldsTheKitchenPanelsWithFoods = new FlowLayout();
        holdsPanelsForTheKitchen.setLayout(layoutForPanelThatHoldsTheKitchenPanelsWithFoods);
        holdsPanelsForTheKitchen.setSize(1570, 600);
        holdsPanelsForTheKitchen.setVisible(true);
        holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.add(holdsPanelsForTheKitchen);

        holdsPanelsForTheBar.setBackground(Color.GREEN);
        FlowLayout layoutForPanelThatHoldsTheBarPanelsWithDrinks = new FlowLayout();
        holdsPanelsForTheBar.setLayout(layoutForPanelThatHoldsTheBarPanelsWithDrinks);
        holdsPanelsForTheBar.setSize(1570, 600);
        holdsPanelsForTheBar.setVisible(true);
        holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.add(holdsPanelsForTheBar);


        panelForTableAndClientNumbersAndBills.add(tableNumberJLabel);
        panelForTableAndClientNumbersAndBills.add(tableNumberSelectorJComboBox);
        panelForTableAndClientNumbersAndBills.add(tableBillJLabel);
        panelForTableAndClientNumbersAndBills.add(clientNumberJLabel);
        panelForTableAndClientNumbersAndBills.add(clientNumberSelectorJComboBox);
        panelForTableAndClientNumbersAndBills.add(clientBillJLabel);

        panelForTableAndClientNumbersAndBills.add(placeOrderButton);
        panelForTableAndClientNumbersAndBills.add(removeButton);
        panelForTableAndClientNumbersAndBills.add(removeAllButton);

        add(clientOrderJTable);
        add(panelForTableAndClientNumbersAndBills);
        
        setLayout(new GridBagLayout());
        getContentPane().setLayout(null);
        setVisible(true);
        setSize(1600, 850);
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
