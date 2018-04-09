import javax.swing.*;

public class Table {

    private JPanel panel;
    final private JButton table;
    private int coordinatesX, coordinatesY, coordinatesW, coordinatesH, sizeX, sizeY;
    String imagePath;

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
    }

    public JPanel getPanel() {
        return panel;
    }
}
