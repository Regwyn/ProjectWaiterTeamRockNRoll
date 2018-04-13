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
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        Table table = new Table();
        table.switcher();
//        if(tableObject.getImagePath().equalsIgnoreCase("/TableOne 125x125.png") || tableObject.getImagePath().equalsIgnoreCase("/TableFour 125x125.png")){
//            tableObject.getTable().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reserved4s.jpg")));
//        }
//        if(tableObject.getImagePath().equalsIgnoreCase("/TableTwo 250x250.png") || tableObject.getImagePath().equalsIgnoreCase("/TableThree 250x250.png")){
//            tableObject.getTable().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reserved8s.jpg")));
//        }
//        if(tableObject.getImagePath().equalsIgnoreCase("/TableFive 250x350.png") || tableObject.getImagePath().equalsIgnoreCase("/TableEight 250x350.png")){
//            tableObject.getTable().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reserved10s.jpg")));
//        }
//        if(tableObject.getImagePath().equalsIgnoreCase("/TableSix 175x210.png") || tableObject.getImagePath().equalsIgnoreCase("/TableSeven 175x210.png")){
//            tableObject.getTable().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reserved6s.jpg")));
//        }
    }

    private void noButtonActionPerformed(ActionEvent e) {

    }

}
