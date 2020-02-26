import java.util.ArrayList;

public class Pokemon {

	String name;
    String type;
	
    ArrayList<Move> moves = new ArrayList<Move>();

	int level;
    int exp;

    int tempHP;

	int hpModifier;
	int atkModifier;
	int defModifier;
	int splModifier;
	int spdModifier;

	public Pokemon(String name, String type, int level, int hpModifier, int atkModifier, int defModifier, int splModifier, int spdModifier) {

		this.name = name;
		this.type = type;

        	this.tempHP = ((level/2)*(hpModifier*2)); // WIP NOT ACTUAL

		this.level = level;
        	this.exp = 0;

		this.hpModifier = hpModifier;
		this.atkModifier = atkModifier;
		this.defModifier = defModifier;
		this.splModifier = splModifier;
		this.spdModifier = splModifier;
	}

    public Pokemon() {
        
        name = "Obama";
        type = "Dark";

        this.level = 999;
        this.exp = 0;

        hpModifier = 1000;
        atkModifier = 1000;
        defModifier = 1000; 
        splModifier = 1000;
        spdModifier = 1000;
    
        
    }

    public void learnMove(int id) {

        Move learning = Data.getMove(id);

        Text.say(name + "Wants to learn " + learning.getName() + "...");
        if (moves.size()>=4) {
			Text.say("But " +name+ " already knows four moves...");
            Text.pause();
            boolean wantToLearn = Text.pickOption("Does " + name + " want to forget a old move and learn " + learning.getName()+"?","Yes, learn a new move", "No, keep old moves");

            if (wantToLearn==false) {
                Text.say(name+ " did not learn the move " + learning.getName() +". ");
                Text.pause();
                return;
            }
        } else {
            
            System.out.println(name + " learned " + learning.getName());
            addMove(learning, moves.size()+1);
        }
        
    }
    
    public void addMove(Move name, int pos) {
        
        moves.add(pos, name);
    }

    public String getName() {

        return this.name;
    }

    public int getLevel() {

        return this.level;
    }

    public String toString() {

        return "Species: " + name + "\nLevel: " + level;
    }
}