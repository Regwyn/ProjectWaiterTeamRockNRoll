import javax.swing.*;
import java.awt.*;

public class HallRoomJFrame extends JFrame {


    private JFrame jFrame;
    private JLabel label;

    private JPanel panelWhoHoldsFreeTables;
    private JPanel panelWhoHoldsReservedTables;
    private JPanel panelWhoHoldsFreeAndReservedTables = new JPanel();

    private Table table;

    private Table freeTable, reservedTable, panelWithTimers;

    private Seat freeSeat, reservedSeat;

    private final TablesDatabase tablesDatabase = new TablesDatabase();
    private final SeatsDatabase seatsDatabase = new SeatsDatabase();

    private int blocker;

    private int temporaryTableCoordinateX = 0;
    private int temporaryTableCoordinateY = 0;



    public HallRoomJFrame() throws HeadlessException {
        jFrame = new JFrame("Project Waiter");
        initializeComponents();
    }

    public HallRoomJFrame(int blocker) throws HeadlessException {
        this.blocker = blocker;
    }

    private void initializeComponents() {
        label = new JLabel();
        label.setOpaque(true);
        jFrame.setContentPane(new JLabel(new ImageIcon(getClass().getResource("Restaurant3.jpg"))));
        jFrame.add(label);


        initializingFreeTables();
        initializingReservedTables();

//        initializingSeats();



        panelWithTimers = new Table(1710, 0, 120, 1139, 120, 1139, "/Restaurant1.jpg");
        jFrame.getContentPane().add(panelWithTimers.getPanel());

        jFrame.setLayout(new GridBagLayout());
        jFrame.getContentPane().setLayout(null);
        jFrame.setVisible(true);
        jFrame.setSize(1830, 1080);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    private void initializingFreeTables(){
        for (int i = 0; i < tablesDatabase.getSizeX().size(); i++) {


            panelWhoHoldsFreeTables = new JPanel();
            panelWhoHoldsFreeTables.setBounds(tablesDatabase.getCoordinatesX().get(i),tablesDatabase.getCoordinatesY().get(i),tablesDatabase.getSizeX().get(i),tablesDatabase.getSizeY().get(i));
            freeTable = new Table(tablesDatabase.getSizeX().get(i),tablesDatabase.getSizeY().get(i), tablesDatabase.getImagePathForFreeTables().get(i));
            panelWhoHoldsFreeTables.add(freeTable.getPanel());
            panelWhoHoldsFreeAndReservedTables.add(panelWhoHoldsFreeTables);
            jFrame.add(panelWhoHoldsFreeTables);
        }

        panelWithTimers = new Table(1710, 0, 120, 1139, 120, 1139, "/Restaurant1.jpg");
        jFrame.getContentPane().add(panelWithTimers.getPanel());
    }

    private void initializingReservedTables(){
        for (int i = 0; i < tablesDatabase.getSizeX().size(); i++) {
            panelWhoHoldsReservedTables = new JPanel();
            panelWhoHoldsReservedTables.setBounds(tablesDatabase.getCoordinatesX().get(i),tablesDatabase.getCoordinatesY().get(i),tablesDatabase.getSizeX().get(i),tablesDatabase.getSizeY().get(i));
            reservedTable = new Table(tablesDatabase.getSizeX().get(i),tablesDatabase.getSizeY().get(i), tablesDatabase.getImagePathForReservedTables().get(i));
            panelWhoHoldsReservedTables.add(reservedTable.getPanel());
            panelWhoHoldsFreeAndReservedTables.add(panelWhoHoldsReservedTables);
            jFrame.add(panelWhoHoldsReservedTables);
        }
    }

//    private void initializingSeats(){
//        for (int i = 0; i < seatsDatabase.getSizeX().size(); i++) {
//            freeSeat = new Seat(seatsDatabase.getSizeX().get(i),seatsDatabase.getSizeY().get(i), seatsDatabase.getImagePathsForSeatsWithChairs().get(i));
//
//            reservedSeat = new Seat(seatsDatabase.getSizeX().get(i),seatsDatabase.getSizeY().get(i), seatsDatabase.getImagePathsForSeatsWithPeople().get(i));
//
//            panelHoldingTwoPanels  = new Table(seatsDatabase.getCoordinatesX().get(i),seatsDatabase.getCoordinatesY().get(i),seatsDatabase.getCoordinatesW().get(i),
//                    seatsDatabase.getCoordinatesH().get(i),seatsDatabase.getSizeX().get(i),seatsDatabase.getSizeY().get(i));
//
//
//            panelHoldingTwoPanels.getPanelHoldingTwoPanelsWithTables().add(reservedSeat.getPanel());
//            panelHoldingTwoPanels.getPanelHoldingTwoPanelsWithTables().add(freeSeat.getPanel());
//
//
//            jFrame.add(panelHoldingTwoPanels.getPanelHoldingTwoPanelsWithTables());
//        }
//    }

    public JPanel getPanelWhoHoldsFreeTables() {
        return panelWhoHoldsFreeTables;
    }

    public JPanel getPanelWhoHoldsReservedTables() {
        return panelWhoHoldsReservedTables;
    }

    public Table getReservedTable() {
        return reservedTable;
    }

    public JPanel getPanelWhoHoldsFreeAndReservedTables() {
        return panelWhoHoldsFreeAndReservedTables;
    }

    public int getTemporaryTableCoordinateX() {
        return temporaryTableCoordinateX;
    }

    public void setTemporaryTableCoordinateX(int temporaryTableCoordinateX) {
        this.temporaryTableCoordinateX = temporaryTableCoordinateX;
    }

    public int getTemporaryTableCoordinateY() {
        return temporaryTableCoordinateY;
    }

    public void setTemporaryTableCoordinateY(int temporaryTableCoordinateY) {
        this.temporaryTableCoordinateY = temporaryTableCoordinateY;
    }
}
