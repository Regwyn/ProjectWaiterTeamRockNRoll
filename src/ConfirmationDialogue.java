import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfirmationDialogue extends JFrame {

    private String confirmQuestionForTheJLabel;
    private JLabel label;
    private JButton yesButton = new JButton("CONFIRM");
    private JButton noButton = new JButton("DENY");

    public ConfirmationDialogue(String confirmQuestionForTheJLabel) throws HeadlessException {
        this.confirmQuestionForTheJLabel = confirmQuestionForTheJLabel;

        label = new JLabel(this.confirmQuestionForTheJLabel);

        label.setBounds(100, 30, 150, 15);
        yesButton.setBounds(40, 90, 110, 30);
        noButton.setBounds(195, 90, 110, 30);

        setSize(350, 200);
        setLayout(new GridBagLayout());
        getContentPane().setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
        add(label);
        add(yesButton);
        add(noButton);
        validate();

        yesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yesButtonActionPerformed(e);
            }
        });

        noButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                noButtonActionPerformed(e);
            }
        });
    }

    private void yesButtonActionPerformed(ActionEvent e) {
        HallRoomJFrame hallRoomBlocker = new HallRoomJFrame(1);


        hallRoomBlocker.getPanelWhoHoldsFreeAndReservedTables().getComponentAt(hallRoomBlocker.getTemporaryTableCoordinateX(),hallRoomBlocker.getTemporaryTableCoordinateY()).repaint();
        hallRoomBlocker.getPanelWhoHoldsFreeAndReservedTables().getComponentAt(hallRoomBlocker.getTemporaryTableCoordinateX(),hallRoomBlocker.getTemporaryTableCoordinateY()).revalidate();


//        hallRoomBlocker.getPanelWhoHoldsFreeAndReservedTables().getComponentAt()
        hallRoomBlocker.getPanelWhoHoldsFreeAndReservedTables().getComponentAt(hallRoomBlocker.getTemporaryTableCoordinateX(),hallRoomBlocker.getTemporaryTableCoordinateY()).repaint();
        hallRoomBlocker.getPanelWhoHoldsFreeAndReservedTables().getComponentAt(hallRoomBlocker.getTemporaryTableCoordinateX(),hallRoomBlocker.getTemporaryTableCoordinateY()).revalidate();

        System.out.println(hallRoomBlocker.getTemporaryTableCoordinateX());

//            holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.removeAll();
//            holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.repaint();
//            holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.revalidate();
//
//            holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.add(holdsPanelsForTheKitchen);
//            holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.repaint();
//            holdsBothPanelsThatHoldThePanelsForTheKitchenAndBar.revalidate();

    }

    private void noButtonActionPerformed(ActionEvent e) {

    }

}
