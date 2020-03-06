import java.util.ArrayList;

public class Pokemon {

	private String name;
    private String type;
	
    private ArrayList<Move> moves = new ArrayList<Move>();

    private int dexNumber;
	private int level;
    private int exp;
    private int evolutionLevel;

    private int tempHP;

	private int hpModifier;
	private int atkModifier;
	private int defModifier;
	private int splModifier;
	private int spdModifier;

	public Pokemon(int dexNumber, String name, String type, int level, int hpModifier, int atkModifier, int defModifier, int splModifier, int spdModifier, int evolutionLevel) {

		this.dexNumber = dexNumber;

        this.name = name;
		this.type = type;

        

		this.level = level;
        this.exp = 0;
        this.evolutionLevel = evolutionLevel;

		this.hpModifier = hpModifier;
		this.atkModifier = atkModifier;
		this.defModifier = defModifier;
		this.splModifier = splModifier;
		this.spdModifier = splModifier;

        this.tempHP = getMaxHP();
	}
    public Pokemon(int dexNumber, String name, String type, int level, int hpModifier, int atkModifier, int defModifier, int splModifier, int spdModifier) {

		this.dexNumber = dexNumber;

        this.name = name;
		this.type = type;

        

		this.level = level;
        this.exp = 0;
        this.evolutionLevel = 105;

		this.hpModifier = hpModifier;
		this.atkModifier = atkModifier;
		this.defModifier = defModifier;
		this.splModifier = splModifier;
		this.spdModifier = splModifier;

        this.tempHP = getMaxHP();
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

            Data.learnSet(type, i);
        }
    }

    public void learnMove(Move learning) {

        
        Text.say(name + " Wants to learn " + learning.getName() + "...");
        Text.pauseNC();
        if (this.moves.size()>=4) {
			Text.say("But " +this.name+ " already knows four moves...");
            Text.pauseNC();
            boolean wantToLearn = Text.pickOption("Does " + name + " want to forget a old move and learn " + learning.getName()+"?","Yes, learn a new move", "No, keep old moves");

            if (wantToLearn==false) {
                Text.say(this.name+ " did not learn the move " + learning.getName() +". ");
                Text.pause();
                return;
            } else {
                String[] preExisting = new String[]{moves.get(0).getName(), moves.get(1).getName(), moves.get(2).getName(), moves.get(3).getName()};
                int position = Text.menu("Pick a move to forget: ", preExisting) - 1;
                
                System.out.println(name + " learned " + learning.getName());
                addMove(learning, position);
            }
        } else {
            
            System.out.println(name + " learned " + learning.getName());
            addMove(learning);
        }
        
    }

    public void addMove(Move name) {
        moves.add(name);
    }
    
    public void addMove(Move name, int pos) {
        
        moves.set(pos, name);
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

        return ((level*hpModifier)/3)+(level*2)+(hpModifier);
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

    public int getHPModifier() {

        return this.hpModifier;
    }

    public int getATKModifier() {

        return this.atkModifier;
    }

    public int getDEFModifier() {

        return this.defModifier;
    }

    public int getSPLModifier() {

        return this.splModifier;
    }

    public int getSPDModifier() {

        return this.spdModifier;
    }

    public int getModifierSum() {

	    return this.hpModifier + this.atkModifier+ this.defModifier + this.spdModifier + this.splModifier;
    }

    public int getDexNumber() {

        return this.dexNumber;
    }

    public int getEvoLevel() {

        return this.evolutionLevel;
    }

    public int expYield() {

        int expModifier =this.getModifierSum();
        return ((level*expModifier)/3) + (level/4);
    }

    

    public void addEXP(int amount) {

        Text.say(this.name + " has earned " + amount + " EXP. Points!");
        this.exp = this.exp + amount;

        while (this.exp >= (level*level*level) && this.level < 100) {

            levelUp();
        }
    }

    public void levelUp() {
        
        this.exp = this.exp-(level*level*level);
        this.level = this.level+1;
        Text.say(this.name + " grew to Lv. " + this.level +"!");
        Text.pauseNC();
        if (this.level >= this.evolutionLevel) {
            evolve();
        }

        Move possible = Data.learnSet(this.type, this.level);
        if (!possible.getName().equals("Null")) {
            
            learnMove(possible);
        }

    }

    public void evolve() {

        Text.say("What?");
        Text.pauseNC();
        boolean allowEvo = Text.pickOption(name + " is evolving!", "Allow", "Prevent");
        if (allowEvo) {

            Pokemon evoData = Data.getPokemon(this.dexNumber+1, level);
            this.hpModifier = evoData.getHPModifier();
            this.atkModifier = evoData.getATKModifier();
            this.defModifier = evoData.getDEFModifier();
            this.splModifier = evoData.getSPLModifier();
            this.spdModifier = evoData.getSPDModifier();
            

            Text.say("Congratulations, your " + this.name + " evolved into a " + evoData.getName() + "!");
            Text.pauseNC();
            this.name = evoData.getName();
            this.dexNumber = evoData.getDexNumber();

            this.evolutionLevel = evoData.getEvoLevel();

            
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
