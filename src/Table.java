import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Table {



    private JPanel panel;
    private JButton table;
    private int coordinatesX, coordinatesY, coordinatesW, coordinatesH, sizeX, sizeY;
    private String imagePath;

    private JPanel panelHoldingTwoPanelsWithTables;

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

    public Table(int sizeX, int sizeY, String imagePath) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.imagePath = imagePath;

        panel = new JPanel();
        panel.setBounds(this.coordinatesX, this.coordinatesY, this.coordinatesW, this.coordinatesH);
        panel.setSize(this.sizeX,this.sizeY);
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

    public Table(int coordinatesX, int coordinatesY, int coordinatesW, int coordinatesH, int sizeX, int sizeY) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.coordinatesW = coordinatesW;
        this.coordinatesH = coordinatesH;
        this.sizeX = sizeX;
        this.sizeY = sizeY;

        panelHoldingTwoPanelsWithTables = new JPanel();
        panelHoldingTwoPanelsWithTables.setBounds(this.coordinatesX, this.coordinatesY, this.coordinatesW, this.coordinatesH);
        panelHoldingTwoPanelsWithTables.setOpaque(true);
    }

    public Table() {
    }

    public JPanel getPanel() {
        return panel;
    }

    public String getImagePath() {
        return imagePath;
    }


    public JPanel getPanelHoldingTwoPanelsWithTables() {
        return panelHoldingTwoPanelsWithTables;
    }

    void buttonWithImageActionPerformed(ActionEvent e) {
        ConfirmationDialogue confirmationDialogue = new ConfirmationDialogue("CONFIRM RESERVATION ?");



    }
}
