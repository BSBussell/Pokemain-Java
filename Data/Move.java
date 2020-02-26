
public class Move {

    String name;
    String type;

    int accuracy;
    int power;
    boolean physical;

    //damaging moves
    public Move(String name, String type, int power, int accuracy, boolean physical) {

        this.name = name;
        this.type = type;
        this.power = power;
        this.accuracy = accuracy;
        this.physical = physical;
    }

    //other shit
    public Move(String name, String type, String stat) {}
}