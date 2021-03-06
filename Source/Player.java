import java.util.ArrayList;

public class Player {

    private String name;

    private ArrayList<Pokemon> team = new ArrayList<Pokemon>();
    private ArrayList<Pokemon> pc = new ArrayList<Pokemon>();
    private ArrayList<Pokemon> dex = new ArrayList<Pokemon>();

    private int[] bag = new int[] {5,0,0,0};
    
    private int leadersBeat;
    private int cash;

    private int pokedex;
    
    public Player(String name, int cash) {
        
        this.name = name;
        this.cash = cash;
    }

    

    public void checkDex(Pokemon creature) {

        for (Pokemon seen : dex) {

            if (creature.getName() == seen.getName()) {
                return;
            }
        }
    }

    public void giveStarter(Pokemon creature) {

        team.add(creature);
    }

    public void healTeam() {

        for (Pokemon creature : team) {

            creature.heal(999999);
        }
    }

    public void addPokemonNext(Pokemon creature) {

        if (team.size() > 6)
            pc.add(creature);
        else
            team.add(creature);

    }

    public void addPokemonToTeam(Pokemon creature, int position) {

        if (team.size() >= position+1) {

            pc.add(team.remove(position));
            team.add(position, creature);
        } else {
        
            team.add(creature);
        }
   
    }

    public void swapPokemon(int index1, int index2) {

        Pokemon temp1 = team.get(index1);
        Pokemon temp2 = team.get(index2);

        team.set(index1,temp2);
        team.set(index2,temp1);
    }

    public void swapPokemonPC(int pcIndex, int teamIndex) {

        if (team.size() <= teamIndex+1) {

            team.add(pc.remove(pcIndex));
        } else {

            pc.add(team.remove(teamIndex));
            team.add(teamIndex,pc.remove(pcIndex));
        }
    }

    public String getName() {

        return this.name;
    }

    public ArrayList<Pokemon> getTeam() {

        return this.team;
    }

    public void addItem(int pos) {

        this.bag[pos]++;
    }

    public void useItem(int pos) {

        this.bag[pos]--;
    }

    public int[] getBag() {

        return this.bag;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String toString() {

        return "test";
    }
    
}