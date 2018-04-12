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

    private PanelsWithFoodAndDrinksImages saladCaprese;
    private PanelsWithFoodAndDrinksImages saladEggs;
    private PanelsWithFoodAndDrinksImages saladMotley;
    private PanelsWithFoodAndDrinksImages saladOakLeaf;
    private PanelsWithFoodAndDrinksImages saladPeppersWithCheese;
    private PanelsWithFoodAndDrinksImages saladRucolaWithHamonAndFigs;
    private PanelsWithFoodAndDrinksImages saladSeaGifts;

    private PanelsWithFoodAndDrinksImages soupBeans;
    private PanelsWithFoodAndDrinksImages soupBelly;
    private PanelsWithFoodAndDrinksImages soupBorsh;
    private PanelsWithFoodAndDrinksImages soupChicken;
    private PanelsWithFoodAndDrinksImages soupMushroomCream;
    private PanelsWithFoodAndDrinksImages soupPeasCream;
    private PanelsWithFoodAndDrinksImages soupPotatoCream;

    private PanelsWithFoodAndDrinksImages peppersWithRiceAndMeat;
    private PanelsWithFoodAndDrinksImages duckWithPotatoes;
    private PanelsWithFoodAndDrinksImages guvech;
    private PanelsWithFoodAndDrinksImages kapama;
    private PanelsWithFoodAndDrinksImages kavarma;
    private PanelsWithFoodAndDrinksImages musaka;
    private PanelsWithFoodAndDrinksImages zucchini;

    private PanelsWithFoodAndDrinksImages pizzaCarbonara;
    private PanelsWithFoodAndDrinksImages pizzaMargaritta;
    private PanelsWithFoodAndDrinksImages pizzaMexicana;
    private PanelsWithFoodAndDrinksImages pizzaNapoletana;
    private PanelsWithFoodAndDrinksImages pizzaPepperoni;
    private PanelsWithFoodAndDrinksImages pizzaRomana;
    private PanelsWithFoodAndDrinksImages pizzaLasagna;

    private PanelsWithFoodAndDrinksImages water;
    private PanelsWithFoodAndDrinksImages citronade;
    private PanelsWithFoodAndDrinksImages citronadeGrapefruit;
    private PanelsWithFoodAndDrinksImages freshWatermelon;
    private PanelsWithFoodAndDrinksImages juiceAnanas;
    private PanelsWithFoodAndDrinksImages juiceApple;
    private PanelsWithFoodAndDrinksImages juicePear;

    private PanelsWithFoodAndDrinksImages juicePlum;
    private PanelsWithFoodAndDrinksImages lemonade;
    private PanelsWithFoodAndDrinksImages orangeade;
    private PanelsWithFoodAndDrinksImages smoothieForrestFruitAndBanana;
    private PanelsWithFoodAndDrinksImages smoothieForrestFruits;
    private PanelsWithFoodAndDrinksImages smoothieRaspberry;
    private PanelsWithFoodAndDrinksImages teaMint;

    private PanelsWithFoodAndDrinksImages biscuitLavazza;
    private PanelsWithFoodAndDrinksImages cappuccino;
    private PanelsWithFoodAndDrinksImages coffeeBreve;
    private PanelsWithFoodAndDrinksImages coffeeEspresso;
    private PanelsWithFoodAndDrinksImages coffeMocha;
    private PanelsWithFoodAndDrinksImages irishCoffee;
    private PanelsWithFoodAndDrinksImages latteMachiatto;

    private PanelsWithFoodAndDrinksImages blueberrymartini;
    private PanelsWithFoodAndDrinksImages campari;
    private PanelsWithFoodAndDrinksImages grapeRakia;
    private PanelsWithFoodAndDrinksImages pearRakia;
    private PanelsWithFoodAndDrinksImages makersMark;
    private PanelsWithFoodAndDrinksImages metaxa;
    private PanelsWithFoodAndDrinksImages tequilaPatron;

    //private DropDownAutocompleteSearchBar menuSearchBar;

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

    private void initializeComponents(){

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

        double i = 5.0;

        saladCaprese = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/caprese.jpg");
        saladEggs = new PanelsWithFoodAndDrinksImages("SALAD EGGS", ("PRICE:  5.80                             QTY:   " + i), "/egg salad.jpg");
        saladMotley = new PanelsWithFoodAndDrinksImages("SALAD MOTLEY", ("PRICE:  5.80                             QTY:   " + i), "/motley salad.jpg");
        saladOakLeaf = new PanelsWithFoodAndDrinksImages("SALAD OAK LEAF", ("PRICE:  5.80                             QTY:   " + i), "/oak leaf salad.JPG");
        saladPeppersWithCheese = new PanelsWithFoodAndDrinksImages("SALAD PEPPERS WITH CHEESE", ("PRICE:  5.80                             QTY:   " + i), "/peppers with cheese.jpg");
        saladRucolaWithHamonAndFigs = new PanelsWithFoodAndDrinksImages("SALAD RUCOLA WITH HAMON AND FIGS", ("PRICE:  5.80                             QTY:   " + i), "/ricola salad with hamon and figs.jpg");
        saladSeaGifts = new PanelsWithFoodAndDrinksImages("SALAD SEA GIFTS", ("PRICE:  5.80                             QTY:   " + i), "/sea gifts salad.jpg");

        soupBeans = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/soupBeans.jpg");
        soupBelly = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/belly soup.jpg");
        soupBorsh = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/borsh soup.jpg");
        soupChicken = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/chicken soup.jpg");
        soupMushroomCream = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/mushroom cream soup.jpg");
        soupPeasCream = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/peas cream soup.jpg");
        soupPotatoCream = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/potato cream soup.jpg");

        peppersWithRiceAndMeat = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/peppersWithRiceAndMeat.jpg");
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
        pizzaLasagna = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/lasagna.jpg");

        water = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/water.jpg");
        citronade = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/citronade.jpg");
        citronadeGrapefruit = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/citronadeGrapefruit.jpg");
        freshWatermelon = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/freshWatermelon.jpg");
        juiceAnanas = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/juiceAnanas.jpg");
        juiceApple = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/juiceApple.jpg");
        juicePear = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/juicePear.jpg");

        juicePlum = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/juicePlum.jpg");
        lemonade = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/lemonade.jpg");
        orangeade = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/orangeade.jpg");
        smoothieForrestFruitAndBanana = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/smoothieForrestFruitAndBanana.jpg");
        smoothieForrestFruits = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/smoothieForrestFruits.jpg");
        smoothieRaspberry = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/smoothieRaspberry.jpg");
        teaMint = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/teaMint.jpg");


        biscuitLavazza = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/biscuitLavazza.jpg");
        cappuccino = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/cappuccino.jpg");
        coffeeBreve = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/coffeeBreve.png");
        coffeeEspresso = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/coffeeEspresso.png");
        coffeMocha = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/coffeMocha.jpg");
        irishCoffee = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/irishCoffee.jpg");
        latteMachiatto = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/latteMachiatto.jpg");
//
//
        blueberrymartini = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/blueberrymartini.jpg");
        campari = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/campari.jpg");
        grapeRakia = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/grapeRakia.jpg");
        pearRakia = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/pearRakia.jpg");
        makersMark = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/makersMark.jpg");
        metaxa = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/metaxa.jpg");
        tequilaPatron = new PanelsWithFoodAndDrinksImages("SALAD CAPRESE", ("PRICE:  5.80                             QTY:   " + i), "/tequilaPatron.jpg");


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

        holdsPanelsForTheKitchen.add(peppersWithRiceAndMeat.getHolderPanel());
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



        holdsPanelsForTheBar.add(water.getHolderPanel());
        holdsPanelsForTheBar.add(citronade.getHolderPanel());
        holdsPanelsForTheBar.add(citronadeGrapefruit.getHolderPanel());
        holdsPanelsForTheBar.add(freshWatermelon.getHolderPanel());
        holdsPanelsForTheBar.add(juiceAnanas.getHolderPanel());
        holdsPanelsForTheBar.add(juiceApple.getHolderPanel());
        holdsPanelsForTheBar.add(juicePear.getHolderPanel());

        holdsPanelsForTheBar.add(juicePlum.getHolderPanel());
        holdsPanelsForTheBar.add(lemonade.getHolderPanel());
        holdsPanelsForTheBar.add(orangeade.getHolderPanel());
        holdsPanelsForTheBar.add(smoothieForrestFruitAndBanana.getHolderPanel());
        holdsPanelsForTheBar.add(smoothieForrestFruits.getHolderPanel());
        holdsPanelsForTheBar.add(smoothieRaspberry.getHolderPanel());
        holdsPanelsForTheBar.add(teaMint.getHolderPanel());

        holdsPanelsForTheBar.add(biscuitLavazza.getHolderPanel());
        holdsPanelsForTheBar.add(cappuccino.getHolderPanel());
        holdsPanelsForTheBar.add(coffeeBreve.getHolderPanel());
        holdsPanelsForTheBar.add(coffeeEspresso.getHolderPanel());
        holdsPanelsForTheBar.add(coffeMocha.getHolderPanel());
        holdsPanelsForTheBar.add(irishCoffee.getHolderPanel());
        holdsPanelsForTheBar.add(latteMachiatto.getHolderPanel());

        holdsPanelsForTheBar.add(blueberrymartini.getHolderPanel());
        holdsPanelsForTheBar.add(campari.getHolderPanel());
        holdsPanelsForTheBar.add(grapeRakia.getHolderPanel());
        holdsPanelsForTheBar.add(pearRakia.getHolderPanel());
        holdsPanelsForTheBar.add(makersMark.getHolderPanel());
        holdsPanelsForTheBar.add(metaxa.getHolderPanel());
        holdsPanelsForTheBar.add(tequilaPatron.getHolderPanel());

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
    }
}
