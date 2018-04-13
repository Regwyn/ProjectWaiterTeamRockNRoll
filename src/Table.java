import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Table {

    private JPanel panel;
    private JButton table;
    private int coordinatesX, coordinatesY, coordinatesW, coordinatesH, sizeX, sizeY;
    private String imagePath;
    private ImageIcon currentTableImageIcon;

    public Table(int coordinatesX, int coordinatesY, int coordinatesW, int coordinatesH, int sizeX, int sizeY, String imagePath) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.coordinatesW = coordinatesW;
        this.coordinatesH = coordinatesH;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.imagePath = imagePath;

        panel = new JPanel();
        panel.setBounds(this.coordinatesX, this.coordinatesY, this.coordinatesW, this.coordinatesH);
        table = new JButton();
        table.setSize(this.sizeX, this.sizeY);
        table.setIcon(new ImageIcon(getClass().getResource(this.imagePath)));
        table.setVisible(true);
        panel.setOpaque(true);
        panel.add(table);

        table.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                buttonWithImageActionPerformed(e);
            }
        });
    }

    public Table() {
    }

    public JPanel getPanel() {
        return panel;
    }

    public String getImagePath() {
        return imagePath;
    }

    public JButton getTable() {
        return table;
    }

    void buttonWithImageActionPerformed(ActionEvent e) {
        ConfirmationDialogue confirmationDialogue = new ConfirmationDialogue("CONFIRM RESERVATION ?");

//        this.currentTableImageIcon = (ImageIcon) table.getIcon();

        System.out.println(getImagePath());
//        if(imagePath.equalsIgnoreCase("/TableOne 125x125.png") || imagePath.equalsIgnoreCase("/TableFour 125x125.png")){
//            table.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reserved4s.jpg")));
//        }
//        if(imagePath.equalsIgnoreCase("/TableTwo 250x250.png") || imagePath.equalsIgnoreCase("/TableThree 250x250.png")){
//            table.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reserved8s.jpg")));
//        }
//        if(imagePath.equalsIgnoreCase("/TableFive 250x350.png") || imagePath.equalsIgnoreCase("/TableEight 250x350.png")){
//            table.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reserved10s.jpg")));
//        }
//        if(imagePath.equalsIgnoreCase("/TableSix 175x210.png") || imagePath.equalsIgnoreCase("/TableSeven 175x210.png")){
//            table.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reserved6s.jpg")));
//        }
    }

    void switcher() {
        if (this.currentTableImageIcon.toString().equalsIgnoreCase("/TableOne 125x125.png") || this.currentTableImageIcon.toString().equalsIgnoreCase("/TableFour 125x125.png")) {
            table.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reserved4s.jpg")));
        }
        if (this.currentTableImageIcon.toString().equalsIgnoreCase("/TableTwo 250x250.png") || this.currentTableImageIcon.toString().equalsIgnoreCase("/TableThree 250x250.png")) {
            table.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reserved8s.jpg")));
        }
        if (this.currentTableImageIcon.toString().equalsIgnoreCase("/TableFive 250x350.png") || this.currentTableImageIcon.toString().equalsIgnoreCase("/TableEight 250x350.png")) {
            table.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reserved10s.jpg")));
        }
        if (this.currentTableImageIcon.toString().equalsIgnoreCase("/TableSix 175x210.png") || this.currentTableImageIcon.toString().equalsIgnoreCase("/TableSeven 175x210.png")) {
            table.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reserved6s.jpg")));
        }
    }

    void print(){
        System.out.println(getImagePath());
    }
}
