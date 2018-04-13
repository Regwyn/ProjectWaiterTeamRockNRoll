import javax.swing.*;
import java.awt.*;

public class HallRoomJFrame extends JFrame {
    private JFrame jFrame;
    private JLabel label;

    public HallRoomJFrame() throws HeadlessException {
        jFrame = new JFrame("Project Waiter");
        initializeComponents();
    }

    private void initializeComponents(){
        label = new JLabel();
        label.setOpaque(true);
        jFrame.setContentPane(new JLabel(new ImageIcon(getClass().getResource("Restaurant3.jpg"))));
        jFrame.add(label);

        Table tableOne = new Table(101, 212, 125, 125, 125, 125, "/TableOne 125x125.png");
        Table tableTwo = new Table(448, 126, 250, 250, 250, 250, "/TableTwo 250x250.png");
        Table tableThree = new Table(975, 126, 250, 250, 250, 250, "/TableThree 250x250.png");
        Table tableFour = new Table(1425, 212, 125, 125, 125, 125, "/TableFour 125x125.png");
        Table tableFive = new Table(1366, 521, 250, 350, 250, 350, "/TableFive 250x350.png");
        Table tableSix = new Table(975, 649, 175, 210, 175, 210, "/TableSix 175x210.png");
        Table tableSeven = new Table(562, 649, 175, 210, 175, 210, "/TableSeven 175x210.png");
        Table tableEight = new Table(101, 521, 250, 350, 250, 350, "/TableEight 250x350.png");

        Table panelWithTimers = new Table(1710, 0, 120, 1139, 120, 1139, "/Restaurant1.jpg");


        Seat tableOneSeatOne = new Seat(139, 143, 52, 58, 52, 58, "/ChairUp.jpg.jpg");
        Seat tableOneSeatTwo = new Seat(232, 235, 58, 52, 58, 52, "/ChairRight.jpg.jpg");
        Seat tableOneSeatThree = new Seat(139, 343, 52, 58, 52, 58, "/ChairDown.jpg.jpg");
        Seat tableOneSeatFour = new Seat(37, 240, 58, 52, 58, 52, "/ChairLeft.jpg.jpg");

        Seat tableTwoSeatOne = new Seat(496, 62, 52, 58, 52, 58, "/ManOnTableUp.png");
        Seat tableTwoSeatTwo = new Seat(583, 62, 52, 58, 52, 58, "/ManOnTableUp.png");
        Seat tableTwoSeatThree = new Seat(704, 164, 58, 52, 58, 52, "/ManOnTableRight.png");
        Seat tableTwoSeatFour = new Seat(704, 273, 58, 52, 58, 52, "/ManOnTableRight.png");
        Seat tableTwoSeatFive = new Seat(588, 382, 52, 58, 52, 58, "/ManOnTableDown.png");
        Seat tableTwoSeatSix = new Seat(499, 382, 52, 58, 52, 58, "/ManOnTableDown.png");
        Seat tableTwoSeatSeven = new Seat(380, 272, 58, 52, 58, 52, "/ManOnTableLeft.png");
        Seat tableTwoSeatEight = new Seat(380, 163, 58, 52, 58, 52, "/ManOnTableLeft.png");

        Seat tableThreeSeatOne = new Seat(1020, 62, 52, 58, 52, 58, "/ManOnTableUp.png");
        Seat tableThreeSeatTwo = new Seat(1117, 62, 52, 58, 52, 58, "/ManOnTableUp.png");
        Seat tableThreeSeatThree = new Seat(1231, 173, 58, 52, 58, 52, "/ManOnTableRight.png");
        Seat tableThreeSeatFour = new Seat(1231, 268, 58, 52, 58, 52, "/ManOnTableRight.png");
        Seat tableThreeSeatFive = new Seat(1133, 382, 52, 58, 52, 58, "/ManOnTableDown.png");
        Seat tableThreeSeatSix = new Seat(1025, 382, 52, 58, 52, 58, "/ManOnTableDown.png");
        Seat tableThreeSeatSeven = new Seat(911, 273, 58, 52, 58, 52, "/ManOnTableLeft.png");
        Seat tableThreeSeatEight = new Seat(911, 164, 58, 52, 58, 52, "/ManOnTableLeft.png");

        Seat tableFourSeatOne = new Seat(1460, 148, 52, 58, 52, 58, "/ManOnTableUp.png");
        Seat tableFourSeatTwo = new Seat(1556, 245, 58, 52, 58, 52, "/ManOnTableRight.png");
        Seat tableFourSeatThree = new Seat(1461, 343, 52, 58, 52, 58, "/ManOnTableDown.png");
        Seat tableFourSeatFour = new Seat(1361, 246, 58, 52, 58, 52, "/ManOnTableLeft.png");

        Seat tableFiveSeatOne = new Seat(1415, 457, 52, 58, 52, 58, "/ManOnTableUp.png");
        Seat tableFiveSeatTwo = new Seat(1506, 457, 52, 58, 52, 58, "/ManOnTableUp.png");
        Seat tableFiveSeatThree = new Seat(1622, 568, 58, 52, 58, 52, "/ManOnTableRight.png");
        Seat tableFiveSeatFour = new Seat(1622, 666, 58, 52, 58, 52, "/ManOnTableRight.png");
        Seat tableFiveSeatFive = new Seat(1622, 778, 58, 52, 58, 52, "/ManOnTableRight.png");
        Seat tableFiveSeatSix = new Seat(1516, 877, 52, 58, 52, 58, "/ManOnTableDown.png");
        Seat tableFiveSeatSeven = new Seat(1420, 877, 52, 58, 52, 58, "/ManOnTableDown.png");
        Seat tableFiveSeatEight = new Seat(1302, 778, 58, 52, 58, 52, "/ManOnTableLeft.png");
        Seat tableFiveSeatNine = new Seat(1302, 670, 58, 52, 58, 52, "/ManOnTableLeft.png");
        Seat tableFiveSeatTen = new Seat(1302, 564, 58, 52, 58, 52, "/ManOnTableLeft.png");

        Seat tableSixSeatOne = new Seat(1033, 576, 52, 58, 52, 58, "/ManOnTableUp.png");
        Seat tableSixSeatTwo = new Seat(1156, 670, 58, 52, 58, 52, "/ManOnTableRight.png");
        Seat tableSixSeatThree = new Seat(1156, 778, 58, 52, 58, 52, "/ManOnTableRight.png");
        Seat tableSixSeatFour = new Seat(1032, 877, 52, 58, 52, 58, "/ManOnTableDown.png");
        Seat tableSixSeatFive = new Seat(911, 788, 58, 52, 58, 52, "/ManOnTableLeft.png");
        Seat tableSixSeatSix = new Seat(911, 686, 58, 52, 58, 52, "/ManOnTableLeft.png");

        Seat tableSevenSeatOne = new Seat(620, 585, 52, 58, 52, 58, "/ManOnTableUp.png");
        Seat tableSevenSeatTwo = new Seat(743, 686, 58, 52, 58, 52, "/ManOnTableRight.png");
        Seat tableSevenSeatThree = new Seat(743, 788, 58, 52, 58, 52, "/ManOnTableRight.png");
        Seat tableSevenSeatFour = new Seat(622, 865, 52, 58, 52, 58, "/ManOnTableDown.png");
        Seat tableSevenSeatFive = new Seat(498, 792, 58, 52, 58, 52, "/ManOnTableLeft.png");
        Seat tableSevenSeatSix = new Seat(498, 693, 58, 52, 58, 52, "/ManOnTableLeft.png");

        Seat tableEightSeatOne = new Seat(150, 457, 52, 58, 52, 58, "/ManOnTableUp.png");
        Seat tableEightSeatTwo = new Seat(232, 457, 52, 58, 52, 58, "/ManOnTableUp.png");
        Seat tableEightSeatThree = new Seat(357, 548, 58, 52, 58, 52, "/ManOnTableRight.png");
        Seat tableEightSeatFour = new Seat(357, 657, 58, 52, 58, 52, "/ManOnTableRight.png");
        Seat tableEightSeatFive = new Seat(357, 760, 58, 52, 58, 52, "/ManOnTableRight.png");
        Seat tableEightSeatSix = new Seat(251, 877, 52, 58, 52, 58, "/ManOnTableDown.png");
        Seat tableEightSeatSeven = new Seat(153, 877, 52, 58, 52, 58, "/ManOnTableDown.png");
        Seat tableEightSeatEight = new Seat(37, 761, 58, 52, 58, 52, "/ManOnTableLeft.png");
        Seat tableEightSeatNine = new Seat(37, 656, 58, 52, 58, 52, "/ManOnTableLeft.png");
        Seat tableEightSeatTen = new Seat(37, 550, 58, 52, 58, 52, "/ManOnTableLeft.png");

        jFrame.setLayout(new GridBagLayout());
        jFrame.getContentPane().setLayout(null);
        jFrame.setVisible(true);
        jFrame.setSize(1830, 1080);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jFrame.getContentPane().add(tableOne.getPanel());
        jFrame.getContentPane().add(tableTwo.getPanel());
        jFrame.getContentPane().add(tableThree.getPanel());
        jFrame.getContentPane().add(tableFour.getPanel());
        jFrame.getContentPane().add(tableFive.getPanel());
        jFrame.getContentPane().add(tableSix.getPanel());
        jFrame.getContentPane().add(tableSeven.getPanel());
        jFrame.getContentPane().add(tableEight.getPanel());

        jFrame.getContentPane().add(panelWithTimers.getPanel());

        jFrame.getContentPane().add(tableOneSeatOne.getPanel());
        jFrame.getContentPane().add(tableOneSeatTwo.getPanel());
        jFrame.getContentPane().add(tableOneSeatThree.getPanel());
        jFrame.getContentPane().add(tableOneSeatFour.getPanel());

        jFrame.getContentPane().add(tableTwoSeatOne.getPanel());
        jFrame.getContentPane().add(tableTwoSeatTwo.getPanel());
        jFrame.getContentPane().add(tableTwoSeatThree.getPanel());
        jFrame.getContentPane().add(tableTwoSeatFour.getPanel());
        jFrame.getContentPane().add(tableTwoSeatFive.getPanel());
        jFrame.getContentPane().add(tableTwoSeatSix.getPanel());
        jFrame.getContentPane().add(tableTwoSeatSeven.getPanel());
        jFrame.getContentPane().add(tableTwoSeatEight.getPanel());

        jFrame.getContentPane().add(tableThreeSeatOne.getPanel());
        jFrame.getContentPane().add(tableThreeSeatTwo.getPanel());
        jFrame.getContentPane().add(tableThreeSeatThree.getPanel());
        jFrame.getContentPane().add(tableThreeSeatFour.getPanel());
        jFrame.getContentPane().add(tableThreeSeatFive.getPanel());
        jFrame.getContentPane().add(tableThreeSeatSix.getPanel());
        jFrame.getContentPane().add(tableThreeSeatSeven.getPanel());
        jFrame.getContentPane().add(tableThreeSeatEight.getPanel());

        jFrame.getContentPane().add(tableFourSeatOne.getPanel());
        jFrame.getContentPane().add(tableFourSeatTwo.getPanel());
        jFrame.getContentPane().add(tableFourSeatThree.getPanel());
        jFrame.getContentPane().add(tableFourSeatFour.getPanel());

        jFrame.getContentPane().add(tableFiveSeatOne.getPanel());
        jFrame.getContentPane().add(tableFiveSeatTwo.getPanel());
        jFrame.getContentPane().add(tableFiveSeatThree.getPanel());
        jFrame.getContentPane().add(tableFiveSeatFour.getPanel());
        jFrame.getContentPane().add(tableFiveSeatFive.getPanel());
        jFrame.getContentPane().add(tableFiveSeatSix.getPanel());
        jFrame.getContentPane().add(tableFiveSeatSeven.getPanel());
        jFrame.getContentPane().add(tableFiveSeatEight.getPanel());
        jFrame.getContentPane().add(tableFiveSeatNine.getPanel());
        jFrame.getContentPane().add(tableFiveSeatTen.getPanel());

        jFrame.getContentPane().add(tableSixSeatOne.getPanel());
        jFrame.getContentPane().add(tableSixSeatTwo.getPanel());
        jFrame.getContentPane().add(tableSixSeatThree.getPanel());
        jFrame.getContentPane().add(tableSixSeatFour.getPanel());
        jFrame.getContentPane().add(tableSixSeatFive.getPanel());
        jFrame.getContentPane().add(tableSixSeatSix.getPanel());

        jFrame.getContentPane().add(tableSevenSeatOne.getPanel());
        jFrame.getContentPane().add(tableSevenSeatTwo.getPanel());
        jFrame.getContentPane().add(tableSevenSeatThree.getPanel());
        jFrame.getContentPane().add(tableSevenSeatFour.getPanel());
        jFrame.getContentPane().add(tableSevenSeatFive.getPanel());
        jFrame.getContentPane().add(tableSevenSeatSix.getPanel());

        jFrame.getContentPane().add(tableEightSeatOne.getPanel());
        jFrame.getContentPane().add(tableEightSeatTwo.getPanel());
        jFrame.getContentPane().add(tableEightSeatThree.getPanel());
        jFrame.getContentPane().add(tableEightSeatFour.getPanel());
        jFrame.getContentPane().add(tableEightSeatFive.getPanel());
        jFrame.getContentPane().add(tableEightSeatSix.getPanel());
        jFrame.getContentPane().add(tableEightSeatSeven.getPanel());
        jFrame.getContentPane().add(tableEightSeatEight.getPanel());
        jFrame.getContentPane().add(tableEightSeatNine.getPanel());
        jFrame.getContentPane().add(tableEightSeatTen.getPanel());
    }
}
