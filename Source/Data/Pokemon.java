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

        this.tempHP = ((level*hpModifier)/3)+level+hpModifier;

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

    public void genMoves() {

        for (int i = 0; i < level; i++) {

            Data.learnSet(i, type);
        }
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
        
        if (moves.size() > 0)
            moves.set(pos, name);
        else
            moves.add(name);
    }

    public String getName() {

        return this.name;
    }

    public int getLevel() {

        return this.level;
    }

    public String getType() {

        return this.type;
    }

    public int getExp() {

        return this.exp;
    }
    
    public int getTempHP() {

        return this.tempHP;
    }

    public int getMaxHP() {

        return ((level*hpModifier)/3)+level+hpModifier;
    }

    public int getActualAttack() {

        return ((level*atkModifier)/3) + (level/4);
    }

    public int getActualDefense() {

        return ((level*defModifier)/3) + (level/4);
    }

    public int getActualSpecial() {

        return ((level*splModifier)/3) + (level/4);
    }

    public int getActualSpeed() {

        return ((level*spdModifier)/3) + (level/4);
    }
    
    public ArrayList<Move> getMoves() {

        return moves;
    }

    public int expYield() {

        int expModifier = hpModifier+atkModifier + defModifier + spdModifier + spdModifier;
        return ((level*expModifier)/3) + (level/4);
    }

    public void addEXP(int amount) {

        Text.say(this.name + " has earned " + amount + " EXP. Points!");
        this.exp = this.exp + amount;

        if (this.exp > (level*level*level) && this.level < 100) {

            this.exp = 0;
            this.level = this.level+1;
            Text.say(this.name + " grew to Lv. " + this.level +"!");
        }
    }

    public void heal(int amount) {

        this.tempHP = (this.tempHP+amount > getMaxHP()) ? getMaxHP() : this.tempHP+amount;
    }

    public void damage(int damage) {

        tempHP = tempHP-damage;
    }

    public String toString() {

        return "Species. : " + name + 
               "\nLevel. : " + level +
               "\nEXP.   : " + exp + "/" + (level*level*level) +
               "\nHP     : " + tempHP + "/" + getMaxHP() +
               "\nATK.   : " + getActualAttack() + 
               "\nDEF.   : " + getActualDefense() +
               "\nSPL.   : " + getActualSpecial() +
               "\nSPD.   : " + getActualSpeed() + "\n";
    }

    
}
