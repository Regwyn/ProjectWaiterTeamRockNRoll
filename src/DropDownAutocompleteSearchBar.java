
import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DropDownAutocompleteSearchBar {

    private String[] arr = {"Salad Tuna", "Salad Caesars", "Salad Lettuce", "Pizza Mexicana", "Pizza Romana", "Pizza Margaritta", "Pizza Dyankov"};
    private JPanel contentPanel;
    private JTextField txtName;
    private JComboBox<String> comboBox;

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        DropDownAutocompleteSearchBar a = new DropDownAutocompleteSearchBar();
//        a.autoCompleteStarter();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 407, 253);
        frame.setVisible(true);
        frame.add(a.getContentPanel());
    }

//    public void autoCompleteStarter() {
//        JFrame frame = new JFrame();
//
//        DropDownAutocompleteSearchBar a = new DropDownAutocompleteSearchBar();
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setBounds(100, 100, 407, 253);
//        frame.setVisible(true);
//        frame.add(a.getContentPane());
//    }


//    public JPanel getContentPane() {
//        return contentPanel;
//    }


    public JPanel getContentPanel() {
        return contentPanel;
    }

    public void setContentPanel(JPanel contentPanel) {
        this.contentPanel = contentPanel;
    }

    public void setContentPane(JPanel contentPane) {
        this.contentPanel = contentPane;
    }

    public DropDownAutocompleteSearchBar() {
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        setBounds(100, 100, 407, 253);
        contentPanel = new JPanel();
        contentPanel.setAutoscrolls(true);
        contentPanel.setBackground(Color.WHITE);
//        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//        setContentPane(this.contentPane);
        contentPanel.setLayout(null);

        txtName = new JTextField();
        txtName.setHorizontalAlignment(SwingConstants.CENTER);
        txtName.setText("");
        txtName.addCaretListener(new TextFieldCaretListener());

        txtName.setBounds(24, 17, 163, 34);
//        this.txtName.setSize(160,20);

        contentPanel.add(this.txtName);
        txtName.setColumns(20);

        comboBox = new JComboBox<>();
        comboBox.setFocusCycleRoot(true);
        comboBox.setFocusTraversalPolicyProvider(true);
        comboBox.setAutoscrolls(true);
        comboBox.setOpaque(false);
        comboBox.addActionListener(new ComboBoxActionListener());

        comboBox.setBounds(24, 51, 163, 28);
//        this.comboBox.setSize(160,20);
    }

    private class TextFieldCaretListener implements CaretListener {
        public void caretUpdate(CaretEvent e) {
            try {
                comboBox.removeAllItems();
                comboBox.hidePopup();
                contentPanel.remove(comboBox);
                if (e.getMark() > 0) {
                    for (String string : arr) {
                        if (string.toLowerCase().startsWith(txtName.getText().toLowerCase())) {
                            contentPanel.add(comboBox);
                            comboBox.addItem(string);
                            comboBox.showPopup();
                        }
                    }
                }
            } catch (Exception e1) {

            }
            if (e.getMark() < 1) {
                contentPanel.remove(comboBox);
            }
        }
    }


    private class ComboBoxActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                txtName.setText(comboBox.getSelectedItem().toString());
                comboBox.removeAllItems();
                comboBox.hidePopup();
                contentPanel.remove(comboBox);
            } catch (Exception any) {

            }
        }
    }
}

