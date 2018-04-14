import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Table {

    private JPanel panel;
    private JButton table;
    private int coordinatesX, coordinatesY, sizeX, sizeY;
    private String imagePath;

    private int tableID;
    private static int counterID;

    public Table(int coordinatesX, int coordinatesY, int sizeX, int sizeY, String imagePath) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.imagePath = imagePath;
        this.tableID = counterID;
        this.counterID++;


        panel = new JPanel();
        panel.setBounds(this.coordinatesX, this.coordinatesY, this.sizeX, this.sizeY);
        table = new JButton();
        table.setSize(this.sizeX, this.sizeY);
        table.setIcon(new ImageIcon(getClass().getResource(this.imagePath)));
        table.setVisible(true);
        panel.setOpaque(true);
        panel.add(table);

        table.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                timerJButtonActionPerformed(e);
            }
        });
    }

    public Table(int sizeX, int sizeY, String imagePath) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.imagePath = imagePath;
        this.tableID = counterID;
        this.counterID++;


        table = new JButton();
        table.setSize(this.sizeX, this.sizeY);
        table.setIcon(new ImageIcon(getClass().getResource(this.imagePath)));
        table.setVisible(true);


        table.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tableButtonActionPerformed(e);
            }
        });
    }

    public JPanel getPanel() {
        return panel;
    }

    private void timerJButtonActionPerformed(ActionEvent e){

    }

    private void tableButtonActionPerformed(ActionEvent e) {

    }

    public JButton getTable() {
        return table;
    }
}
