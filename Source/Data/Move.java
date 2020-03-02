
public class Move {

    private String name;
    private String type;

    private String statToModify;

    private int accuracy;
    private int power;

    private boolean physical;
    private boolean damaging;

    //damaging moves
    public Move(String name, String type, int power, int accuracy, boolean physical) {

        this.name = name;
        this.type = type;
        this.power = power;
        this.accuracy = accuracy;
        this.physical = physical;

        this.damaging = true;
    }

    // Default Constructor Always to be Replaced later by properly initalized.
    public Move() {}

    //other shit
    public Move(String name, String type, String stat) {

        this.name = name;
        this.type = type;

        this.statToModify = stat;
    }
    
    public String getName() {
        
        return this.name;
    }
    
    public String getType() {

        return this.type;
    }

    public int getPower() {
        
        return this.power;
    }
    
    public boolean isDamaging() {

        return this.damaging;
    }

    public boolean isPhysical() {

        return this.physical;
    }

    public int getAccuracy() {
        
        return this.accuracy;
    }
}