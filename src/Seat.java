import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Seat {

    private JPanel panel;
    final private JButton tableOne;
    private int coordinatesX, coordinatesY, coordinatesW, coordinatesH, sizeX, sizeY;
    String imagePath;

    public Seat(int coordinatesX, int coordinatesY, int coordinatesW, int coordinatesH, int sizeX, int sizeY, String imagePath) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.coordinatesW = coordinatesW;
        this.coordinatesH = coordinatesH;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.imagePath = imagePath;

        panel = new JPanel();
        panel.setBounds(this.coordinatesX, this.coordinatesY, this.coordinatesW, this.coordinatesH);
        tableOne = new JButton();
        tableOne.setSize(this.sizeX, this.sizeY);
        tableOne.setIcon(new ImageIcon(getClass().getResource(this.imagePath)));
        tableOne.setVisible(true);
        tableOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OptionsWhenClientIsSeated o = new OptionsWhenClientIsSeated();

            }
        });
        panel.setOpaque(true);
        panel.add(tableOne);


    }

    public JPanel getPanel() {
        return panel;
    }
}