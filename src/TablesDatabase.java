import java.util.List;

import static java.util.Arrays.asList;

public class TablesDatabase {

    private final  List<Integer> coordinatesX = asList (
            101,448,975,1425,1366,975,562,101
    );

    private final  List<Integer> coordinatesY = asList (
            212,126,126,212,521,649,649,521
    );

    private final  List<Integer> sizeX = asList (
            125,250,250,125,250,175,175,250
    );

    private final  List<Integer> sizeY = asList (
            125,250,250,125,350,210,210,350
    );

    private final  List<String> imagePathForFreeTables = asList(
            "/TableOne 125x125.png","/TableTwo 250x250.png","/TableThree 250x250.png","/TableFour 125x125.png",
            "/TableFive 250x350.png","/TableSix 175x210.png","/TableSeven 175x210.png","/TableEight 250x350.png"
    );

    private final  List<String> imagePathForReservedTables = asList(
            "/Reserved4s.jpg","/Reserved8s.jpg","/Reserved8s.jpg","/Reserved4s.jpg",
            "/Reserved10s.jpg","/Reserved6s.jpg","/Reserved6s.jpg","/Reserved10s.jpg"
    );

    public TablesDatabase() {
    }

    public List<String> getImagePathForFreeTables() {
        return imagePathForFreeTables;
    }

    public List<String> getImagePathForReservedTables() {
        return imagePathForReservedTables;
    }

    public List<Integer> getCoordinatesX() {
        return coordinatesX;
    }

    public List<Integer> getCoordinatesY() {
        return coordinatesY;
    }

    public List<Integer> getSizeX() {
        return sizeX;
    }

    public List<Integer> getSizeY() {
        return sizeY;
    }
}
