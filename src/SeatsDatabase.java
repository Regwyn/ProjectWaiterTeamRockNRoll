import java.util.List;

import static java.util.Arrays.asList;

public class SeatsDatabase {

    private final String chairUp = "/ChairUp.jpg.jpg";
    private final String chairDown = "/ChairDown.jpg.jpg";
    private final String chairRight = "/ChairRight.jpg.jpg";
    private final String chairLeft = "/ChairLeft.jpg.jpg";

    private final String manOnTableUp = "/ManOnTableUp.png";
    private final String manOnTableDown = "/ManOnTableDown.png";
    private final String manOnTableRight = "/ManOnTableRight.png";
    private final String manOnTableLeft = "/ManOnTableLeft.png";

    private final List<String> imagePathsForSeatsWithChairs = asList(

            chairUp, chairRight, chairDown, chairLeft,

            chairUp, chairUp,
            chairRight, chairRight,
            chairDown, chairDown,
            chairLeft, chairLeft,

            chairUp, chairUp,
            chairRight, chairRight,
            chairDown, chairDown,
            chairLeft, chairLeft,

            chairUp, chairRight, chairDown, chairLeft,

            chairUp, chairUp,
            chairRight, chairRight, chairRight,
            chairDown, chairDown,
            chairLeft, chairLeft, chairLeft,

            chairUp,
            chairRight, chairRight,
            chairDown,
            chairLeft, chairLeft,

            chairUp,
            chairRight, chairRight,
            chairDown,
            chairLeft, chairLeft,

            chairUp, chairUp,
            chairRight, chairRight, chairRight,
            chairDown, chairDown,
            chairLeft, chairLeft, chairLeft
    );

    private final  List<String> imagePathsForSeatsWithPeople = asList(

            manOnTableUp, manOnTableRight, manOnTableDown, manOnTableLeft,

            manOnTableUp, manOnTableUp,
            manOnTableRight, manOnTableRight,
            manOnTableDown, manOnTableDown,
            manOnTableLeft, manOnTableLeft,

            manOnTableUp, manOnTableUp,
            manOnTableRight, manOnTableRight,
            manOnTableDown, manOnTableDown,
            manOnTableLeft, manOnTableLeft,

            manOnTableUp, manOnTableRight, manOnTableDown, manOnTableLeft,

            manOnTableUp, manOnTableUp,
            manOnTableRight, manOnTableRight, manOnTableRight,
            manOnTableDown, manOnTableDown,
            manOnTableLeft, manOnTableLeft, manOnTableLeft,

            manOnTableUp,
            manOnTableRight, manOnTableRight,
            manOnTableDown,
            manOnTableLeft, manOnTableLeft,

            manOnTableUp,
            manOnTableRight, manOnTableRight,
            manOnTableDown,
            manOnTableLeft, manOnTableLeft,

            manOnTableUp, manOnTableUp,
            manOnTableRight, manOnTableRight, manOnTableRight,
            manOnTableDown, manOnTableDown,
            manOnTableLeft, manOnTableLeft, manOnTableLeft
    );



    private final  List<Integer> coordinatesX = asList(
            139, 232, 139, 37, 496, 583, 704, 704, 588, 499, 380, 380, 1020, 1117, 1231, 1231, 1133, 1025, 911, 911, 1460, 1556, 1461, 1361, 1415, 1506, 1622,
            1622, 1622, 1516, 1420, 1302, 1302, 1302, 1033, 1156, 1156, 1032, 911, 911, 620, 743, 743, 622, 498, 498, 150, 232, 357, 357, 357, 251, 153, 37, 37, 37

    );
    private final  List<Integer> coordinatesY = asList(
            143, 235, 343, 240, 62, 62, 164, 273, 382, 382, 272, 163, 62, 62, 173, 268, 382, 382, 273, 164, 148, 245, 343, 246, 457, 457, 568, 666, 778, 877,
            877, 778, 670, 564, 576, 670, 778, 877, 788, 686, 585, 686, 788, 865, 792, 693, 457, 457, 548, 657, 760, 877, 877, 761, 656, 550

    );
    private final  List<Integer> coordinatesW = asList(

            52, 58, 52, 58,
            52, 52, 58, 58, 52, 52, 58, 58,
            52, 52, 58, 58, 52, 52, 58, 58,
            52, 58, 52, 58,

            52, 52, 58, 58, 58, 52, 52, 58, 58, 58,
            52, 58, 58, 52, 58, 58,
            52, 58, 58, 52, 58, 58,
            52, 52, 58, 58, 58, 52, 52, 58, 58, 58
    );
    private final  List<Integer> coordinatesH = asList(
            58, 52, 58, 52,
            58, 58, 52, 52, 58, 58, 52, 52,
            58, 58, 52, 52, 58, 58, 52, 52,
            58, 52, 58, 52,
            58, 58, 52, 52, 52, 58, 58, 52, 52, 52,
            58, 52, 52, 58, 52, 52,
            58, 52, 52, 58, 52, 52,
            58, 58, 52, 52, 52, 58, 58, 52, 52, 52

    );
    private final  List<Integer> sizeX = asList(

            52, 58, 52, 58,
            52, 52, 58, 58, 52, 52, 58, 58,
            52, 52, 58, 58, 52, 52, 58, 58,
            52, 58, 52, 58,

            52, 52, 58, 58, 58, 52, 52, 58, 58, 58,
            52, 58, 58, 52, 58, 58,
            52, 58, 58, 52, 58, 58,
            52, 52, 58, 58, 58, 52, 52, 58, 58, 58

    );
    private final  List<Integer> sizeY = asList(

            58, 52, 58, 52,
            58, 58, 52, 52, 58, 58, 52, 52,
            58, 58, 52, 52, 58, 58, 52, 52,
            58, 52, 58, 52,

            58, 58, 52, 52, 52, 58, 58, 52, 52, 52,
            58, 52, 52, 58, 52, 52,
            58, 52, 52, 58, 52, 52,
            58, 58, 52, 52, 52, 58, 58, 52, 52, 52

    );

    public SeatsDatabase() {
    }

    public List<String> getImagePathsForSeatsWithChairs() {
        return imagePathsForSeatsWithChairs;
    }

    public List<String> getImagePathsForSeatsWithPeople() {
        return imagePathsForSeatsWithPeople;
    }

    public List<Integer> getCoordinatesX() {
        return coordinatesX;
    }

    public List<Integer> getCoordinatesY() {
        return coordinatesY;
    }

    public List<Integer> getCoordinatesW() {
        return coordinatesW;
    }

    public List<Integer> getCoordinatesH() {
        return coordinatesH;
    }

    public List<Integer> getSizeX() {
        return sizeX;
    }

    public List<Integer> getSizeY() {
        return sizeY;
    }

    public static void main(String[] args) {
        SeatsDatabase d = new SeatsDatabase();

        System.out.println(d.getImagePathsForSeatsWithChairs().size());
        System.out.println(d.getImagePathsForSeatsWithPeople().size());
        System.out.println(d.getCoordinatesX().size());
        System.out.println(d.getCoordinatesY().size());
        System.out.println(d.getCoordinatesW().size());
        System.out.println(d.getCoordinatesH().size());
        System.out.println(d.getSizeX().size());
        System.out.println(d.getSizeY().size());
    }
}
