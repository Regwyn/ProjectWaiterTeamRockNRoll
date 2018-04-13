import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Seat {

    private JPanel panel;
    private JButton seat;
    private int coordinatesX, coordinatesY, coordinatesW, coordinatesH, sizeX, sizeY;
    String imagePath;

    private JPanel panelHoldingTwoPanelsWithSeats;

    public Seat(int sizeX, int sizeY, String imagePath) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.imagePath = imagePath;

        panel = new JPanel();
        panel.setBounds(this.coordinatesX, this.coordinatesY, this.coordinatesW, this.coordinatesH);
        seat = new JButton();
        seat.setSize(this.sizeX, this.sizeY);
        seat.setIcon(new ImageIcon(getClass().getResource(this.imagePath)));
        seat.setVisible(true);
        seat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OptionsWhenClientIsSeated o = new OptionsWhenClientIsSeated();

            }
        });
        panel.setOpaque(true);
        panel.add(seat);
    }

    public Seat(int coordinatesX, int coordinatesY, int coordinatesW, int coordinatesH, int sizeX, int sizeY) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.coordinatesW = coordinatesW;
        this.coordinatesH = coordinatesH;
        this.sizeX = sizeX;
        this.sizeY = sizeY;

        panelHoldingTwoPanelsWithSeats = new JPanel();
        panelHoldingTwoPanelsWithSeats.setBounds(this.coordinatesX, this.coordinatesY, this.coordinatesW, this.coordinatesH);
        panelHoldingTwoPanelsWithSeats.setOpaque(true);
    }


    public JPanel getPanel() {
        return panel;
    }

    public JButton getSeat() {
        return seat;
    }

    public String getImagePath() {
        return imagePath;
    }

    public JPanel getPanelHoldingTwoPanelsWithSeats() {
        return panelHoldingTwoPanelsWithSeats;
    }
}