import javax.swing.*;
import java.awt.*;

public class ConfirmationDialogue extends JFrame{

    private String confirmQuestionForTheJLabel;
    private JLabel label;
    private JButton yesButton = new JButton("CONFIRM");
    private JButton noButton = new JButton("DENY");

    public ConfirmationDialogue(String confirmQuestionForTheJLabel) throws HeadlessException {
        this.confirmQuestionForTheJLabel = confirmQuestionForTheJLabel;

        label = new JLabel(this.confirmQuestionForTheJLabel);

        label.setBounds(100,30,150,15);
        yesButton.setBounds(40,90, 110,30);
        noButton.setBounds(195,90,110,30);

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
    }
}
