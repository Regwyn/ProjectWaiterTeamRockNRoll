import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionsWhenClientIsSeated extends JFrame {

    private JFrame jFrame;
    private JButton order;
    private JButton pay;
    private JButton leaveWithoutPaying;
    private JPanel clientSeatNumberAndTableNumber;
    private JLabel textForThePanel;

    public OptionsWhenClientIsSeated() throws HeadlessException {
        jFrame = new JFrame();
        order = new JButton("ORDER");
        pay = new JButton("PAY");
        leaveWithoutPaying = new JButton("LEAVE (WITHOUT PAYING)");
        clientSeatNumberAndTableNumber = new JPanel();
        textForThePanel = new JLabel("WHAT WOULD THE CLIENT LIKE TO DO ?");

        clientSeatNumberAndTableNumber.setBackground(new java.awt.Color(0, 204, 204));
        clientSeatNumberAndTableNumber.setBounds(160, 25, 285, 85);
        clientSeatNumberAndTableNumber.setOpaque(true);
        clientSeatNumberAndTableNumber.setLayout(new GridBagLayout());
        clientSeatNumberAndTableNumber.setVisible(true);

        order.setBounds(160, 130, 285, 45);
        pay.setBounds(160, 195, 285, 45);
        leaveWithoutPaying.setBounds(160, 260, 280, 45);


        jFrame.setSize(600, 425);
        jFrame.setLayout(new GridBagLayout());
        jFrame.getContentPane().setLayout(null);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrame.setContentPane(new JLabel(new ImageIcon(getClass().getResource("Restaurant2.jpg"))));
        jFrame.setVisible(true);
        clientSeatNumberAndTableNumber.add(textForThePanel);
        jFrame.add(clientSeatNumberAndTableNumber);
        jFrame.add(order);
        jFrame.add(pay);
        jFrame.add(leaveWithoutPaying);
        validate();

        order.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelsWithFoodAndDrinksImages p = new PanelsWithFoodAndDrinksImages();
                p.setItemID(0);
                PanelsWithFoodAndDrinksImages.setCounterID(0);
                OrdersManaging ordersManaging = new OrdersManaging();

            }
        });
        pay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConfirmationDialogue confirmationDialogue = new ConfirmationDialogue("   CONFIRM PAYMENT ?");
            }
        });
        leaveWithoutPaying.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConfirmationDialogue confirmationDialogue = new ConfirmationDialogue("   CONFIRM LEAVING ?");
            }
        });
    }
}