import javax.swing.*;
import java.awt.*;

public class HallRoomJFrame extends JFrame {


    private JFrame jFrame;
    private JLabel label;

    private JPanel panelWhoHoldsFreeTables;
    private JPanel panelWhoHoldsReservedTables;
    private JPanel panelWhoHoldsFreeAndReservedTables;

    private Table freeTable, reservedTable, panelWithTimers;

    private JPanel panelWhoHoldsFreeSeats;
    private JPanel panelWhoHoldsReservedSeats;
    private JPanel panelWhoHoldsFreeAndReservedSeats;


    private Seat freeSeat, reservedSeat;

    private final TablesDatabase tablesDatabase = new TablesDatabase();
    private final SeatsDatabase seatsDatabase = new SeatsDatabase();

    public HallRoomJFrame() throws HeadlessException {
        jFrame = new JFrame("Project Waiter");
        initializeComponents();
    }

    private void initializeComponents() {
        label = new JLabel();
        label.setOpaque(true);
        jFrame.setContentPane(new JLabel(new ImageIcon(getClass().getResource("Restaurant3.jpg"))));
        jFrame.add(label);

        initializingTables();

        initializingSeats();

        jFrame.setLayout(new GridBagLayout());
        jFrame.getContentPane().setLayout(null);
        jFrame.setVisible(true);
        jFrame.setSize(1830, 1080);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    private void initializingTables() {
        for (int i = 0; i < tablesDatabase.getSizeX().size(); i++) {
            panelWhoHoldsFreeAndReservedTables = new JPanel();
            panelWhoHoldsFreeAndReservedTables.setBounds(tablesDatabase.getCoordinatesX().get(i), tablesDatabase.getCoordinatesY().get(i), tablesDatabase.getSizeX().get(i), tablesDatabase.getSizeY().get(i));

            panelWhoHoldsFreeTables = new JPanel();
            panelWhoHoldsFreeTables.setSize(tablesDatabase.getSizeX().get(i), tablesDatabase.getSizeY().get(i));
            freeTable = new Table(tablesDatabase.getSizeX().get(i), tablesDatabase.getSizeY().get(i), tablesDatabase.getImagePathForFreeTables().get(i));

            panelWhoHoldsReservedTables = new JPanel();
            panelWhoHoldsReservedTables.setSize(tablesDatabase.getSizeX().get(i), tablesDatabase.getSizeY().get(i));
            reservedTable = new Table(tablesDatabase.getSizeX().get(i), tablesDatabase.getSizeY().get(i), tablesDatabase.getImagePathForReservedTables().get(i));

            panelWhoHoldsFreeTables.add(freeTable.getTable());
            panelWhoHoldsReservedTables.add(reservedTable.getTable());

            panelWhoHoldsFreeAndReservedTables.add(panelWhoHoldsFreeTables);
            panelWhoHoldsFreeAndReservedTables.add(panelWhoHoldsReservedTables);

            jFrame.add(panelWhoHoldsFreeAndReservedTables);
        }

        panelWithTimers = new Table(1710, 0, 120, 1139, "/Restaurant1.jpg");
        jFrame.getContentPane().add(panelWithTimers.getPanel());
    }

    private void initializingSeats() {
        for (int i = 0; i < seatsDatabase.getSizeX().size(); i++) {
            panelWhoHoldsFreeAndReservedSeats = new JPanel();
            panelWhoHoldsFreeAndReservedSeats.setBounds(seatsDatabase.getCoordinatesX().get(i), seatsDatabase.getCoordinatesY().get(i), seatsDatabase.getSizeX().get(i), seatsDatabase.getSizeY().get(i));

            panelWhoHoldsFreeSeats = new JPanel();
            panelWhoHoldsFreeSeats.setSize(seatsDatabase.getSizeX().get(i), seatsDatabase.getSizeY().get(i));
            freeSeat = new Seat(seatsDatabase.getSizeX().get(i), seatsDatabase.getSizeY().get(i), seatsDatabase.getImagePathsForSeatsWithChairs().get(i));

            panelWhoHoldsReservedSeats = new JPanel();
            panelWhoHoldsReservedSeats.setSize(seatsDatabase.getSizeX().get(i), seatsDatabase.getSizeY().get(i));
            reservedSeat = new Seat(seatsDatabase.getSizeX().get(i), seatsDatabase.getSizeY().get(i), seatsDatabase.getImagePathsForSeatsWithPeople().get(i));

            panelWhoHoldsFreeSeats.add(freeSeat.getSeat());
            panelWhoHoldsReservedSeats.add(reservedSeat.getSeat());

            panelWhoHoldsFreeAndReservedSeats.add(panelWhoHoldsFreeSeats);
            panelWhoHoldsFreeAndReservedSeats.add(panelWhoHoldsReservedSeats);

            jFrame.add(panelWhoHoldsFreeAndReservedSeats);
        }
    }
}
