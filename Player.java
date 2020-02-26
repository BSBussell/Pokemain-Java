import java.util.ArrayList;

public class Player {

    String name;

    ArrayList<Pokemon> team = new ArrayList<Pokemon>();
    //ArrayList<Item> bag;
    ArrayList<Pokemon> pc = new ArrayList<Pokemon>();
    ArrayList<Pokemon> dex = new ArrayList<Pokemon>();
    
    int leadersBeat;
    int cash;
    
    int pokedex;
    
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

    public void addPokemonToTeam(Pokemon creature, int position) {

        if (team.size() >= position+1) {

            pc.add(team.remove(position));
            team.add(position, creature);
        } else {
            System.out.println("No");
            team.add(creature);
        }
   
    }

    public void movePokemonToPC(int pcIndex, int teamIndex) {

        if (team.size() <= teamIndex+1) {

            team.add(pc.remove(pcIndex));
        } else {

            pc.add(team.remove(teamIndex));
            team.add(teamIndex,pc.remove(pcIndex));
        }
    }
    
}