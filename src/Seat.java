import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Seat {


    private JButton seat;
    private int sizeX, sizeY;
    private String imagePath;

    private int tableID;
    private static int counterID;

    public Seat(int sizeX, int sizeY, String imagePath) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.imagePath = imagePath;
        this.tableID = counterID;
        this.counterID++;

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
    }

    public JButton getSeat() {
        return seat;
    }

}